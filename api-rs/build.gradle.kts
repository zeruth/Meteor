plugins {
    kotlin("jvm")
    `maven-publish`
}

group = "meteor"
version = "1.0.0"

dependencies {
    with(projects) {
        implementation(api)
    }

    implementation("nulled:annotations:1.0")
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