plugins {
    kotlin("jvm")
    `maven-publish`
}

group = "meteor"
version = "1.0.0"

repositories{
    mavenCentral()
    maven { url = uri("https://raw.githubusercontent.com/MeteorLite/hosting/main/repo/") }
}

dependencies{
    with(projects){
        implementation(annotations)
        implementation(api)
        implementation(apiRs)
        implementation(logger)
    }

    with(libs){
        compileOnly(lombok)
        annotationProcessor(lombok)
        implementation(gson)
        implementation(java.inject)
        implementation(asm)
        implementation(asm.util)
        implementation(guava)
        implementation(jopt.simple)
        implementation(annotations)
        implementation(fernflower)
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks.compileJava {
    sourceCompatibility = JavaVersion.VERSION_17.toString()
    targetCompatibility = JavaVersion.VERSION_17.toString()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().all {
    kotlinOptions {
        apiVersion = "1.8"
        languageVersion = "1.8"
        jvmTarget = "17"
    }
}