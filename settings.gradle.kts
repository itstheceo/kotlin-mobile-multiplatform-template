enableFeaturePreview("GRADLE_METADATA")

rootProject.name = Config.rootProjectName

val excludeAndroid: String by extra
if (excludeAndroid == "true") {
    print("Including project :core")
    include(":core")
} else {
    print("Including projects :core, :android")
    include(":core", ":android")
}