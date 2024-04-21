rootProject.name = "Meteor"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

include(":annotations")
include(":api")
include(":api-rs")
include(":composeApp")
include(":eventbus")
include(":injector")
include(":logger")
include(":mixins")
include(":rs2")

