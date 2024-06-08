rootProject.name = "Meteor"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
        gradlePluginPortal()
        mavenCentral()
        maven { url = uri("https://raw.githubusercontent.com/MeteorLite/hosting/main/repo/") }
        maven { url = uri("https://raw.githubusercontent.com/zeruth/repo/main/") }
    }
}

plugins {
    id("de.fayard.refreshVersions") version "0.60.5"
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

include(":api")
include(":api-rs")
include(":client")
include(":mixins")
include(":rs2")
