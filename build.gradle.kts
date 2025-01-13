plugins {
    alias(libs.plugins.jetbrainsCompose) apply false
    alias(libs.plugins.compose.compiler) apply false
    kotlin("jvm") version "2.0.21" apply false
}

group = "meteor"
version = "2.1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven { url = uri("https://raw.githubusercontent.com/MeteorLite/hosting/main/repo/") }
        maven { url = uri("https://raw.githubusercontent.com/zeruth/repo/main/") }
    }
}