plugins {
    `java-gradle-plugin`

    // Apply the Kotlin JVM plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.5.10"
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    testImplementation(gradleTestKit())
}

gradlePlugin {
    plugins.create("foo") {
        id = "com.osacky.incompatible"
        displayName = "Incompatible"
        description = "Test if we can replace the plugin"
        implementationClass = "com.osacky.replace.example.ReplacePluginTaskPlugin"
    }
}

