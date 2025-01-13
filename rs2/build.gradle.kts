plugins {
    id("java")
}

group = "meteor"
version = "2.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    with(libs) {
        implementation(eventbus)
    }
}