import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("jvm")
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
}

repositories {
    gradlePluginPortal()
    mavenCentral()
    google()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

compose.desktop {
    application {
        mainClass = "meteor.Main"
        version = "2.0.5"
        jvmArgs += listOf("-noverify")
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

dependencies {
    implementation(projects.eventbus)
    implementation(projects.api)
    implementation(projects.apiRs)
    implementation(compose.desktop.currentOs)
    implementation("com.twelvemonkeys.imageio:imageio-jpeg:3.10.1")
    runtimeOnly(files("./src/desktopMain/resources/injected-client.jar"))

    //GPU Upscaling
    //Very heavy deps, so only one runtime configuration should be used at once

    //Common
    implementation(
        files(
            "../libs/javacpp-1.5.10.jar",
            "../libs/javacv-1.5.10.jar",
            "../libs/openblas-0.3.26-1.5.10.jar",
            "../libs/opencv-4.9.0-1.5.10.jar",
        )
    )
    //Windows
    runtimeOnly(
        files(
            "../libs/javacpp-1.5.10-windows-x86_64.jar",
            "../libs/openblas-0.3.26-1.5.10-windows-x86_64.jar",
            "../libs/opencv-4.9.0-1.5.10-windows-x86_64.jar",
        )
    )
}