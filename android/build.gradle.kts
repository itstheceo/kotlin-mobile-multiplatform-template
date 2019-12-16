import org.jetbrains.kotlin.gradle.internal.AndroidExtensionsExtension

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

repositories {
    google()
    jcenter()
    maven { url = uri("http://dl.bintray.com/kotlin/kotlin-eap") }
    maven { url = uri("https://kotlin.bintray.com/kotlinx") }
    maven { url = uri("https://maven.google.com") }
    mavenCentral()
}

android {
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    compileSdkVersion(Config.Android.Sdk.compileVersion)
    defaultConfig {
        applicationId = Config.Android.applicationId
        minSdkVersion(Config.Android.Sdk.minimumVersion)
        targetSdkVersion(Config.Android.Sdk.targetVersion)
        versionCode = Config.Android.versionCode
        versionName = Config.Android.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = Config.Android.isMinifyEnabled
        }
    }
    packagingOptions {
        exclude("**/*.kotlin_module")
    }
}

dependencies {
    implementation(project(":core"))
    implementation(Dependencies.Core.Kotlin.stdlib)
    implementation(Dependencies.Android.X.appCompat)
    implementation(Dependencies.Android.X.constraintLayout)
    implementation(Dependencies.Android.X.coreKtx)
    testImplementation(Dependencies.Android.X.testRunner)
    testImplementation(Dependencies.Android.X.espressoCore)
    testImplementation(Dependencies.Android.jUnit)
}
