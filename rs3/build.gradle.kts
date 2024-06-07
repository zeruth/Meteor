plugins {
    id("java")
    id("application")
}

group = "meteor"
version = "unspecified"

repositories {
    gradlePluginPortal()
    mavenCentral()
    google()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

java{
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
    disableAutoTargetJvm()
}

dependencies {
    implementation(projects.eventbus)
    implementation("com.twelvemonkeys.imageio:imageio-jpeg:3.10.1")
}

application {
    mainClass.set("Client")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.addAll(listOf("-Xlint:unchecked", "-Xlint:deprecation"))
}

tasks.withType<JavaExec> {
    workingDir = project.rootDir
}