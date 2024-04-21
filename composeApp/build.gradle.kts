import com.android.build.gradle.internal.lint.AndroidLintAnalysisTask
import com.android.build.gradle.internal.lint.LintModelWriterTask
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
            implementation(projects.api)
            implementation(projects.apiRs)
            implementation(compose.desktop.currentOs)
            runtimeOnly(files("./src/desktopMain/resources/injected-client.jar"))

            //GPU Upscaling
            //Very heavy deps, so only one runtime configuration should be used at once

            //Common
            implementation(files(
                "../libs/javacpp-1.5.10.jar",
                "../libs/javacv-1.5.10.jar",
                "../libs/openblas-0.3.26-1.5.10.jar",
                "../libs/opencv-4.9.0-1.5.10.jar",
                ))
            //Windows
            runtimeOnly(files(
                "../libs/javacpp-1.5.10-windows-x86_64.jar",
                "../libs/openblas-0.3.26-1.5.10-windows-x86_64.jar",
                "../libs/opencv-4.9.0-1.5.10-windows-x86_64.jar",
            ))
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

// Fixes for latest Android Gradle Plugin for Kotlin Multiplatform
tasks.withType<LintModelWriterTask> {
    if (this.name == "generateDebugUnitTestLintModel")
        dependsOn(tasks.named("generateResourceAccessorsForAndroidUnitTest"))
}

tasks.withType<AndroidLintAnalysisTask> {
    if (this.name == "lintAnalyzeDebug" || this.name == "lintAnalyzeDebugUnitTest")
        dependsOn(tasks.named("generateResourceAccessorsForAndroidUnitTest"))
}
