object Dependencies {
    const val gradlePluginVersion = "3.5.2"
    const val kotlinxCodeSyncVersion = "0.2"

    object Android {
        object X {
            const val appCompat = "androidx.appcompat:appcompat:1.0.2"
            const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
            const val coreKtx = "androidx.core:core-ktx:1.0.2"
            const val testRunner = "androidx.test:runner:1.2.0"
            const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
        }
        const val jUnit = "junit:junit:4.12"
    }

    object Core { // Be careful bumping versions here; the ABI version must match between dependencies on iOS
        object Kotlin {
            const val version = "1.3.61"

            const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$version"
            const val stdlibCommon = "org.jetbrains.kotlin:kotlin-stdlib-common:$version"
            const val test = "org.jetbrains.kotlin:kotlin-test:$version"
            const val testCommon = "org.jetbrains.kotlin:kotlin-test-common:$version"
            const val testAnnotationsCommon = "org.jetbrains.kotlin:kotlin-test-annotations-common:$version"
        }

        object Kotlinx {
            object Coroutines {
                const val version = "1.3.3" // kotlin 1.3.61

                const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
                const val common = "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:$version"
                const val native = "org.jetbrains.kotlinx:kotlinx-coroutines-core-native:$version"
                const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
            }
            object Serialization {
                const val version = "0.14.0" // kotlin 1.3.60

                const val android = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:$version"
                const val common = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:$version"
                const val native = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:$version"
            }
        }

        object Ktor {
            const val version = "1.2.6" // kotlin 1.3.60

            object Client {
                const val android = "io.ktor:ktor-client-android:$version"
                const val core = "io.ktor:ktor-client-core:$version"
                const val ios = "io.ktor:ktor-client-ios:$version"
            }
            object ClientJson {
                const val android = "io.ktor:ktor-client-json-jvm:$version"
                const val core = "io.ktor:ktor-client-json:$version"
                const val native = "io.ktor:ktor-client-json-native:$version"
            }
            object ClientSerialization {
                const val android = "io.ktor:ktor-client-serialization-jvm:$version"
                const val core = "io.ktor:ktor-client-serialization:$version"
                const val native = "io.ktor:ktor-client-serialization-native:$version"
            }
            object ClientLogging {
                const val android = "io.ktor:ktor-client-logging-jvm:$version"
                const val core = "io.ktor:ktor-client-logging:$version"
                const val native = "io.ktor:ktor-client-logging-native:$version"
            }
        }

        object SqlDelight {
            const val version = "1.2.1" // kotlin 1.3.60
            const val runtime = "com.squareup.sqldelight:runtime:$version"

            object Driver {
                const val android = "com.squareup.sqldelight:android-driver:$version"
                const val ios = "com.squareup.sqldelight:ios-driver:$version"
            }
        }
    }
}
