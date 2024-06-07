rootProject.name = "Meteor"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

plugins {
    id("de.fayard.refreshVersions") version "0.60.5"
}

include(":annotations")
include(":api")
include(":api-rs")
include(":composeApp")
include(":eventbus")
include(":injector")
include(":logger")
include(":mixins")
include(":rs3")

