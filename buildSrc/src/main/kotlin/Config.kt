object Config {
    const val rootProjectName = "example mpp template"

    object Android {
        const val applicationId = "com.example.androidapp"
        const val isMinifyEnabled = false // release builds only
        const val versionCode = 1
        const val versionName = "1.0"

        object Sdk {
            const val compileVersion = 29
            const val minimumVersion = 23
            const val targetVersion = compileVersion
        }
    }

    object Core {
        const val groupIdentifier = "com.example" // Remember to update this manually in core/src/main/AndroidManifest.xml
        const val version = "0.0.1"
    }

    object IOS {
        const val projectPath = "../ios/iosApp.xcodeproj"
        const val projectTarget = "iosApp"
    }
}
