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
    jvmToolchain(22)
}