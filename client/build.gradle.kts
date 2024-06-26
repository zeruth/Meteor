
import nulled.InjectTask
import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
    kotlin("jvm")
    id("nulled.injector") version "1.4"
}

dependencies {
    implementation(libs.fernflower)
    implementation(compose.runtime)
    implementation(compose.ui)
    implementation(projects.api)
    implementation(projects.apiRs)
    implementation(compose.desktop.currentOs)
    implementation("org.jetbrains.kotlin:kotlin-reflect:2.0.0")

    implementation("nulled:injector:1.4")
    implementation("nulled:logger:1.2")
    implementation("nulled:eventbus:1.1")
    implementation("br.com.devsrsouza.compose.icons:line-awesome:1.1.0")
    implementation("com.google.code.gson:gson:2.11.0")
    runtimeOnly(files("./src/main/resources/injected-client.jar"))
}

tasks.withType<InjectTask> {
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

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

val installerVersion = "2.0.7"

compose.desktop {
    application {
        mainClass = "meteor.Main"
        version = installerVersion
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Exe, TargetFormat.Deb)
            packageName = "meteor"
            packageVersion = installerVersion
            windows {
                console = true
                upgradeUuid = "9df19035-e962-4bb4-90c0-74330a07082b"
                iconFile.set(project.file("src/main/resources/Meteor.ico"))
                shortcut = true
            }
        }
    }
}