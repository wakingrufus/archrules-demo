import org.gradle.kotlin.dsl.`java-library`

plugins {
    `java-library`
    id("com.netflix.nebula.archrules.library")
    id("com.netflix.nebula.archrules.runner")
}
dependencies {
    implementation("io.micrometer:micrometer-core:1.17.1")
}
repositories {
    mavenCentral()
}