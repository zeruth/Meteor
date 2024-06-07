import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
    kotlin("jvm")
}

dependencies {
    implementation(compose.runtime)
    implementation(compose.ui)
    implementation(projects.eventbus)
    implementation(projects.api)
    implementation(projects.apiRs)
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