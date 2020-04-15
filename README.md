# Deprecated
This template is not being actively maintained, check out [KaMP Kit](https://github.com/touchlab/KaMPKit) by Touchlab instead.

![Core CI](https://github.com/itstheceo/kotlin-mobile-multiplatform-template/workflows/Core%20CI/badge.svg)
![Kotlin version](https://img.shields.io/badge/kotlin-v1.3.71-blue)
![Gradle version](https://img.shields.io/badge/gradle-v5.6.4-blue)

# Kotlin Mobile Multiplatform Template

A template for Kotlin mobile multiplatform projects that leverages the new Kotlin DSL, has clear boundaries between 
modules, and tidy integration with the consuming native platforms.

## Getting Started

### Recommended IDEs

It is recommended you use IntelliJ IDEA (2019.3.4), as this is the preferred IDE for Kotlin multiplatform development. If you have 
used Android Studio before, it will feel very familiar. When working with iOS directly, it's recommended to use Xcode 11.

#### Recommended IDE settings

Add .idea and *.iml to the list of hidden files in IntelliJ IDEA by navigating to:
```
File > Preferences/Settings > Editor > File Types
```
And adding the following to the "Ignore files and folders" field: `.idea;*.iml;`

### Config

Config settings can be found in `buildSrc/.../Config` including the project name and app identifiers. You'll most 
likely want to change these after cloning the template.

Don't forget to update `local.properties` to point at your Android sdk
#### MacOS
```
sdk.dir=/Users/<username>/Library/Android/sdk
```

#### Windows
```
sdk.dir=C\:\\Users\\<username>\\AppData\\Local\\Android\\sdk
```

### Dependencies

Dependencies can be found in `buildSrc/.../Dependencies`. I've included some useful dependencies out of the box, 
such as;

- [Kotlinx.Coroutines (official)](https://github.com/Kotlin/kotlinx.coroutines)
- [Kotlinx.Serialization (official)](https://github.com/Kotlin/kotlinx.serialization)
- [Ktor (official)](https://github.com/ktorio/ktor)
- [SqlDelight (3rd party)](https://github.com/cashapp/sqldelight)

Be careful bumping versions here, as the ABI (Application Binary Interface) must match between dependencies or you'll 
have a bad time.
