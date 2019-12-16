buildscript {
    repositories {
        google()
        jcenter()
        maven { url = uri("http://dl.bintray.com/kotlin/kotlin-eap") }
        maven { url = uri("https://kotlin.bintray.com/kotlinx") }
        maven { url = uri("https://maven.google.com") }
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${Dependencies.gradlePluginVersion}")
        classpath("co.touchlab:kotlinxcodesync:${Dependencies.kotlinxCodeSyncVersion}")
        classpath("org.jetbrains.kotlin:kotlin-serialization:${Dependencies.Core.Kotlin.version}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Dependencies.Core.Kotlin.version}")
    }
}

subprojects {
    buildscript {
        repositories {
            google()
            jcenter()
            maven { url = uri("http://dl.bintray.com/kotlin/kotlin-eap") }
            maven { url = uri("https://kotlin.bintray.com/kotlinx") }
            maven { url = uri("https://maven.google.com") }
            mavenCentral()
        }
    }
}
