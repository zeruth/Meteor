plugins {
    kotlin("jvm")
    `maven-publish`
}

group = "meteor"
version = "1.0.0"

dependencies {
    implementation("nulled:logger:1.0")
    implementation("nulled:annotations:1.0")

    compileOnly(files(
        "../libs/javacpp-1.5.10.jar",
        "../libs/javacv-1.5.10.jar",
        "../libs/openblas-0.3.26-1.5.10.jar",
        "../libs/opencv-4.9.0-1.5.10.jar",
    ))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().all {
    kotlinOptions {
        apiVersion = "1.8"
        languageVersion = "1.8"
        jvmTarget = "21"
    }
}