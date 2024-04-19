import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsCompose)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "11"
            }
        }
    }
    
    jvm("desktop")
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "ComposeApp"
            isStatic = true
        }
    }
    
    sourceSets {
        val desktopMain by getting
        
        androidMain.dependencies {
            implementation(libs.compose.ui.tooling.preview)
            implementation(libs.androidx.activity.compose)
        }
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
        }
        desktopMain.dependencies {
            implementation(projects.eventbus)
            implementation(projects.rs2)
            implementation(compose.desktop.currentOs)

            implementation("org.bytedeco:javacv:1.5.10") {
                exclude(group = "com.google.android", module = "android")
                exclude(group = "org.bytedeco", module = "openblas")
                exclude(group = "org.bytedeco", module = "numpy")
                exclude(group = "org.bytedeco", module = "javacpp")
                exclude(group = "org.bytedeco", module = "opencv")
            }
            implementation("org.bytedeco:opencv-platform-gpu:4.9.0-1.5.10"){
                exclude(group = "com.google.android", module = "android")
                exclude(group = "org.bytedeco", module = "numpy")
                exclude(group = "org.bytedeco", module = "javacpp")
                exclude(group = "org.bytedeco", module = "opencv")
            }
            implementation("org.bytedeco:opencv:4.9.0-1.5.10"){
                exclude(group = "com.google.android", module = "android")
                exclude(group = "org.bytedeco", module = "numpy")
                exclude(group = "org.bytedeco", module = "opencv-android-arm64")
                exclude(group = "org.bytedeco", module = "opencv-android-x86_64")
                exclude(group = "org.bytedeco", module = "opencv-ios-arm64")
                exclude(group = "org.bytedeco", module = "opencv-ios-x86_64")
                exclude(group = "org.bytedeco", module = "opencv-linux-arm64")
                exclude(group = "org.bytedeco", module = "opencv-linux-ppc64le")
                exclude(group = "org.bytedeco", module = "opencv-linux-x86_64")
                exclude(group = "org.bytedeco", module = "opencv-macos-arm64")
                exclude(group = "org.bytedeco", module = "opencv-macos-x86_64")
            }
        }
    }
}

android {
    namespace = "meteor.client"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("src/androidMain/res")
    sourceSets["main"].resources.srcDirs("src/commonMain/resources")

    defaultConfig {
        applicationId = "meteor.client"
        minSdk = libs.versions.android.minSdk.get().toInt()
        targetSdk = libs.versions.android.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    dependencies {
        debugImplementation(libs.compose.ui.tooling)
    }
}

compose.desktop {
    application {
        mainClass = "meteor.Main"
        version = "2.0.1"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Exe, TargetFormat.Deb)
            packageName = "meteor"
            packageVersion = "2.0.1"
            windows {
                console = true
                upgradeUuid = "9df19035-e962-4bb4-90c0-74330a07082b"
                iconFile.set(project.file("src/desktopMain/resources/Meteor.ico"))
                shortcut = true
            }
        }
    }
}
