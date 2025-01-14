import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
    kotlin("jvm")
}

group = "meteor"
version = "2.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":rs2"))

    implementation(compose.runtime)
    implementation(compose.ui)
    implementation(compose.desktop.currentOs)

    with(libs) {
        implementation(eventbus)
        implementation(logger)
        implementation(kotlin.reflect)
        implementation(lineawesome)
        implementation(gson)
        implementation(kpresence)
    }
}

kotlin {
    jvmToolchain(23)
}


compose.desktop {
    application {
        jvmArgs("-Dsun.java2d.uiScale=1.0")
        mainClass = "meteor.Main"
        version = "1.0.0"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Exe, TargetFormat.Deb)
            packageName = "meteor"
            packageVersion = "1.0.0"
            windows {

                console = true
                upgradeUuid = "9df19034-e962-4bb4-90c0-74330a07082b"
                iconFile.set(project.file("src/main/resources/Meteor.ico"))
                shortcut = true
            }
        }
    }
}