plugins {
    kotlin("jvm")
    `maven-publish`
}

group = "meteor"
version = "1.0.0"

dependencies {
    implementation("nulled:logger:1.2")
    implementation("nulled:annotations:1.0")

    with (libs) {
        annotationProcessor(lombok)
        implementation(lombok)
        implementation("org.jetbrains:annotations:24.1.0")
        implementation("javax.annotation:javax.annotation-api:1.3.2")
        implementation("com.google.code.findbugs:jsr305:3.0.2")
        implementation("com.google.guava:guava:33.2.1-jre")
        implementation("org.apache.commons:commons-lang3:3.14.0")
        implementation("org.apache.commons:commons-text:1.12.0")
    }

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
        languageVersion = "1.9"
        jvmTarget = "21"
    }
}