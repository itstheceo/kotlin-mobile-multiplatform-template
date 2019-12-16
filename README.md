# Kotlin Mobile Multiplatform Template

A template for Kotlin mobile multiplatform projects that leverages the new Kotlin DSL, has clear boundaries between 
modules, and tidy integration with the consuming native platforms.

## Getting Started

### Config

Config settings can be found in `buildSrc/.../Config` including the project name and app identifiers. You'll most 
likely want to change these after cloning the template.

### Dependencies

Dependencies can be found in `buildSrc/.../Dependencies`. I've included some useful dependencies out of the box, 
such as;
- Kotlinx.Coroutines
- Kotlinx.Serialization
- Ktor
- SqlDelight

Be careful bumping versions here, as the ABI (Application Binary Interface) must match between dependencies or you'll 
have a bad time.