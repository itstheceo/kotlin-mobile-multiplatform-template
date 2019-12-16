enableFeaturePreview("GRADLE_METADATA")

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "kotlin-android" ||
                requested.id.id == "kotlin-multiplatform" ||
                requested.id.id == "kotlin-native-cocoapods") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
            if (requested.id.id == "kotlinx-serialization") {
                useModule("org.jetbrains.kotlin:kotlin-serialization:${requested.version}")
            }
            if (requested.id.id == "kotlin-android-extensions") {
                useModule("org.jetbrains.com:kotlin-android-extensions:${requested.version}")
            }
        }
    }
}

rootProject.name = Config.rootProjectName

val excludeAndroid: String by extra
if (excludeAndroid == "true") {
    print("Including project :core")
    include(":core")
} else {
    print("Including projects :core, :android")
    include(":core", ":android")
}