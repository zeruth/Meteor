plugins {
    kotlin("jvm")
    `maven-publish`
}

group = "meteor"
version = "1.0.0"

repositories {
    mavenCentral()
    maven { url = uri("https://raw.githubusercontent.com/MeteorLite/hosting/main/repo/") }
    maven {
        url = uri("https://maven.pkg.github.com/zeruth/annotations")
        credentials {
            username = project.findProperty("gpr.user")?.toString() ?: System.getenv("USERNAME")
            password = project.findProperty("gpr.key")?.toString() ?: System.getenv("TOKEN")
        }
    }
}

dependencies {
    with(projects) {
        implementation(api)
        implementation(apiRs)
    }

    with(libs) {
        annotationProcessor(lombok)
        implementation(annotations)
        implementation(asm)
        implementation(asm.util)
        implementation(fernflower)
        implementation(gson)
        implementation(guava)
        compileOnly(lombok)
    }
    implementation("nulled:logger:1.2")
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

java {
    disableAutoTargetJvm()
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().all {
    kotlinOptions {
        apiVersion = "1.8"
        languageVersion = "1.8"
        jvmTarget = "17"
    }
}