rootProject.name = "topit-store"
include("hello-world")

pluginManagement {
    val kotlinVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinVersion apply false
        id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
    }
}