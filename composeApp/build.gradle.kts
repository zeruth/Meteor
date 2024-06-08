import nulled.InjectTask
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import java.util.jar.JarFile

plugins {
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
    kotlin("jvm")
    id("meteor.injector") version "1.0"
}

repositories {
    mavenLocal()
    mavenCentral()
    google()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    maven { url = uri("https://raw.githubusercontent.com/MeteorLite/hosting/main/repo/") }
}

dependencies {
    implementation(libs.fernflower)
    implementation(compose.runtime)
    implementation(compose.ui)
    implementation(projects.api)
    implementation(projects.apiRs)
    implementation(projects.eventbus)
    implementation(compose.desktop.currentOs)
    runtimeOnly(files("./src/main/resources/injected-client.jar"))

    //GPU Upscaling
    //Very heavy deps, so only one runtime configuration should be used at once

    //Common
    implementation(files(
        "../libs/javacpp-1.5.10.jar",
        "../libs/javacv-1.5.10.jar",
        "../libs/openblas-0.3.26-1.5.10.jar",
        "../libs/opencv-4.9.0-1.5.10.jar",
    ))
    //Windows
    runtimeOnly(files(
        "../libs/javacpp-1.5.10-windows-x86_64.jar",
        "../libs/openblas-0.3.26-1.5.10-windows-x86_64.jar",
        "../libs/opencv-4.9.0-1.5.10-windows-x86_64.jar",
    ))
}

tasks.register<InjectTask>("inject") {
    dependsOn(":api-rs:build")
    dependsOn(":mixins:build")
    dependsOn(":rs2:build")
    api = "${project.layout.projectDirectory}/../api-rs/build/classes/java/main/net/runelite/rs/api/"
    mixins = "${project.layout.projectDirectory}/../mixins/build/libs/mixins-1.0.0.jar"
    target = "${project.layout.projectDirectory}/../rs2/build/libs/rs2.jar"
    output = "${project.layout.projectDirectory}/src/main/resources/injected-client.jar"
}

tasks.named("processResources") {
    dependsOn("inject")
}

compose.desktop {
    application {
        mainClass = "meteor.Main"
        version = "2.0.5"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Exe, TargetFormat.Deb)
            packageName = "meteor"
            packageVersion = "2.0.5"
            windows {
                console = true
                upgradeUuid = "9df19035-e962-4bb4-90c0-74330a07082b"
                iconFile.set(project.file("src/desktopMain/resources/Meteor.ico"))
                shortcut = true
            }
        }
    }
}