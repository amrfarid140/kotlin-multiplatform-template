pluginManagement {
    repositories {
        jcenter()
        maven { setUrl("https://dl.bintray.com/kotlin/kotlin-dev") }
        maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
    }

    resolutionStrategy {
        val kotlin_version = "1.3.72"
        eachPlugin {
            when {
                requested.id.id == "org.jetbrains.kotlin.native.cocoapods" ||
                        requested.id.id == "kotlin-native-cocoapods" ->
                    useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
                requested.id.id.startsWith("org.jetbrains.kotlin") ->
                    useVersion(kotlin_version)
            }
        }
    }
}

include(
    ":app",
    ":commonCode",
    ":jsApp"
)

rootProject.name = "kotlin-mpp"
enableFeaturePreview("GRADLE_METADATA")
