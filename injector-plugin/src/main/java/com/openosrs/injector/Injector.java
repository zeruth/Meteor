/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector;

import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.injection.InjectTaskHandler;
import com.openosrs.injector.injectors.*;
import com.openosrs.injector.rsapi.RSApi;
import nulled.transformers.EnumInvokeVirtualFixer;
import com.openosrs.injector.transformers.InjectTransformer;
import com.openosrs.injector.transformers.SourceChanger;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

import meteor.Logger;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.util.JarUtil;
import nulled.injectors.CreateAnnotations;

import static net.runelite.asm.util.JarUtil.load;

public class Injector extends InjectData implements InjectTaskHandler
{
	static final Logger log = new Logger("Injector");
	static Injector injector = new Injector();

	public static ArrayList<String> report = new ArrayList<>();

	public static String target;
	public static String api;
	public static String mixinsFile;
	public static String output;

	public static void main(String[] args) {
		injector.vanilla = load(new File(target));
		injector.deobfuscated = load(new File(target));
		injector.rsApi = new RSApi(Objects.requireNonNull(new File(api).listFiles()));
		injector.mixins = load(new File(mixinsFile));

		File outputFile = new File(output);

		if (outputFile.exists()) {
			outputFile.delete();
		}

		injector.initToVanilla();
		injector.injectVanilla();
		log.warn("\t\t\t[Injection Report]");
		for (String s : report) {
			log.warn(s);
		}
		save(injector.getVanilla(), outputFile, OutputMode.JAR);
	}

	public void injectVanilla() {
		//runelite asm mashes bytecode for array initializers,
		//this quickly fixes that, making bytecode 100% valid
		transform(new EnumInvokeVirtualFixer(this));

		//Adds "virtual" annotations to all classes/fields/methods in rs2
		//They must still be imported as normal in api-rs(api)
		inject(new CreateAnnotations(this));

		//Attaches our api-rs(api) to their target class in rs2
		inject(new InterfaceInjector(this));

		//Code to be injected / modified in rs2
		inject(new MixinInjector(this));

		inject(new InjectConstruct(this));

		//Inject all members from api-rs(api) in rs2
		inject(new RSApiInjector(this));

		//Warns about unimplemented members in api-rs(api)
		validate(new InjectorValidator(this));

		//Print better stacktrace info
		transform(new SourceChanger(this));
	}

	private void inject(com.openosrs.injector.injectors.Injector injector) {
		final String name = injector.getName();

		//log.lifecycle("[INFO] Starting {}", name);

		injector.start();

		injector.inject();

		log.debug("{} {}", name, injector.getCompletionMsg());

		if (injector instanceof Validator) {
			validate((Validator) injector);
		}
	}

	private void validate(Validator validator) {
		final String name = validator.getName();

		if (!validator.validate()) {
			//throw new InjectException(name + " failed validation");
		}
	}

	private void transform(InjectTransformer transformer) {
		final String name = transformer.getName();

		//log.info("[INFO] Starting {}", name);

		transformer.transform();

		log.debug("{} {}", name, transformer.getCompletionMsg());
	}

	private static void save(ClassGroup group, File output, OutputMode mode) {
		if (output.exists()) {
			try {
				Files.walk(output.toPath()).sorted(Comparator.reverseOrder()).map(Path::toFile).forEach(File::delete);
			} catch (IOException e) {
				log.debug("Failed to delete output directory contents.");
				throw new RuntimeException(e);
			}
		}

		switch (mode) {
			case FILES:
				saveFiles(group, output);
				break;
			case JAR:
				output.getParentFile().mkdirs();
				JarUtil.save(group, output);
				break;
		}
	}

	private static void saveFiles(ClassGroup group, File outDir) {
		try {
			outDir.mkdirs();

			for (ClassFile cf : group.getClasses()) {
				File f = new File(outDir, cf.getName() + ".class");
				byte[] data = JarUtil.writeClass(group, cf);
				Files.write(f.toPath(), data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void runChildInjector(com.openosrs.injector.injectors.Injector injector) {
		inject(injector);
	}
}
