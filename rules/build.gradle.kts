import org.gradle.kotlin.dsl.`java-library`

plugins {
    `java-library`
    id("com.netflix.nebula.archrules.library")
}
repositories {
    mavenCentral()
}