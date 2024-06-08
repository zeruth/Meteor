plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.jetbrainsCompose) apply false
    alias(libs.plugins.compose.compiler) apply false
    kotlin("jvm") version "2.0.0" apply false
}

allprojects {
    repositories {
        mavenCentral()
        google()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven { url = uri("https://raw.githubusercontent.com/MeteorLite/hosting/main/repo/") }

        maven {
            url = uri("https://maven.pkg.github.com/zeruth/annotations")
            credentials {
                username = System.getenv("USERNAME")
                password = System.getenv("TOKEN")
            }
        }

        maven {
            url = uri("https://maven.pkg.github.com/zeruth/logger")
            credentials {
                username = System.getenv("USERNAME")
                password = System.getenv("TOKEN")
            }
        }

        maven {
            url = uri("https://maven.pkg.github.com/zeruth/injector")
            credentials {
                username = System.getenv("USERNAME")
                password = System.getenv("TOKEN")
            }
        }
    }
}