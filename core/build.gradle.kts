plugins {
    id("com.android.library")
    id("kotlin-multiplatform")
    id("kotlinx-serialization")
    id("kotlin-native-cocoapods")
    id("co.touchlab.kotlinxcodesync")
}

repositories {
    google()
    jcenter()
    maven { url = uri("http://dl.bintray.com/kotlin/kotlin-eap") }
    maven { url = uri("https://kotlin.bintray.com/kotlinx") }
    maven { url = uri("https://maven.google.com") }
    mavenCentral()
}

group = Config.Core.groupIdentifier
version = Config.Core.version

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().all {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
}

android {
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    compileSdkVersion(Config.Android.Sdk.compileVersion)
    defaultConfig {
        minSdkVersion(Config.Android.Sdk.minimumVersion)
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = Config.Android.isMinifyEnabled
        }
    }
}

kotlin {
    if (project.findProperty("kotlin.native.cocoapods.target") == "ios_arm") {
        iosArm64("ios")
    } else {
        iosX64("ios")
    }
    android()
    sourceSets {
        getByName("commonMain") {
            dependencies {
                implementation(Dependencies.Core.Kotlin.stdlibCommon)
                implementation(Dependencies.Core.Kotlinx.Coroutines.common)
                implementation(Dependencies.Core.Kotlinx.Serialization.common)
                implementation(Dependencies.Core.Ktor.Client.core)
                implementation(Dependencies.Core.Ktor.ClientJson.core)
                implementation(Dependencies.Core.Ktor.ClientSerialization.core)
                implementation(Dependencies.Core.Ktor.ClientLogging.core)
                implementation(Dependencies.Core.SqlDelight.runtime)
            }
        }
        getByName("commonTest") {
            dependencies {
                dependsOn(getByName("commonMain"))
                implementation(Dependencies.Core.Kotlin.test)
                implementation(Dependencies.Core.Kotlin.testCommon)
                implementation(Dependencies.Core.Kotlin.testAnnotationsCommon)
                implementation(Dependencies.Core.Kotlinx.Coroutines.test)
                implementation(Dependencies.Core.Ktor.Client.Mock.common)
            }
        }
        getByName("androidMain") {
            dependencies {
                implementation(Dependencies.Core.Kotlin.stdlib)
                implementation(Dependencies.Core.Kotlinx.Coroutines.android)
                implementation(Dependencies.Core.Kotlinx.Serialization.android)
                implementation(Dependencies.Core.Ktor.Client.android)
                implementation(Dependencies.Core.Ktor.ClientJson.android)
                implementation(Dependencies.Core.Ktor.ClientSerialization.android)
                implementation(Dependencies.Core.Ktor.ClientLogging.android)
                implementation(Dependencies.Core.SqlDelight.Driver.android)
            }
        }
        getByName("androidTest") {
            dependencies {
                dependsOn(getByName("androidMain"))
                implementation(Dependencies.Core.Kotlin.jUnit)
                implementation(Dependencies.Core.Ktor.Client.Mock.android)
                implementation(Dependencies.Core.SqlDelight.Driver.androidTest)
            }
        }
        getByName("iosMain") {
            dependencies {
                implementation(Dependencies.Core.Kotlinx.Coroutines.native)
                implementation(Dependencies.Core.Kotlinx.Serialization.native)
                implementation(Dependencies.Core.Ktor.Client.ios)
                implementation(Dependencies.Core.Ktor.ClientJson.native)
                implementation(Dependencies.Core.Ktor.ClientSerialization.native)
                implementation(Dependencies.Core.Ktor.ClientLogging.native)
                implementation(Dependencies.Core.SqlDelight.Driver.ios)
            }
        }
        getByName("iosTest") {
            dependencies {
                dependsOn(getByName("iosMain"))
                implementation(Dependencies.Core.Ktor.Client.Mock.native)
            }
        }
        targets.withType<org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget> {
            binaries.withType<org.jetbrains.kotlin.gradle.plugin.mpp.Framework> {
                isStatic = false
            }
        }
    }
}

xcodeSync {
    projectPath = Config.IOS.projectPath
    target = Config.IOS.projectTarget
}

apply("logging.gradle")
apply("ios-test.gradle")