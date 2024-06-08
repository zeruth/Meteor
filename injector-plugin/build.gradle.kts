plugins {
    `java-gradle-plugin`
    `maven-publish`
    kotlin("jvm")
}

group = "meteor"
version = "1.0"

repositories{
    mavenCentral()
    mavenLocal()
    maven { url = uri("https://raw.githubusercontent.com/MeteorLite/hosting/main/repo/") }
}

gradlePlugin {
    plugins {
        create("injector") {
            id = "meteor.injector"
            implementationClass = "nulled.InjectorPlugin"
        }
    }
}
dependencies{
    implementation(gradleApi())
    implementation(localGroovy())

    with(projects){
        implementation(annotations)
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

publishing {
    publications {
        create<MavenPublication>("java") {
            from(components["java"])
        }
    }
}