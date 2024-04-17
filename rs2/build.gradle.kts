plugins {
    id("java")
    id("application")
}

group = "meteor"
version = "unspecified"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(project(":eventbus"))
}

application {
    mainClass.set("jagex2.client.Client")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.addAll(listOf("-Xlint:unchecked", "-Xlint:deprecation"))
}

tasks.withType<JavaExec> {
    workingDir = project.rootDir
}