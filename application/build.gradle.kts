import org.gradle.kotlin.dsl.application
import org.gradle.kotlin.dsl.repositories

plugins {
    application
    id("com.netflix.nebula.archrules.runner")

}
repositories {
    mavenCentral()
}
archRules {
    failureThreshold("LOW")
    skipPassingSummaries = false
    consoleDetailsThreshold("LOW")
}