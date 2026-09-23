import org.gradle.kotlin.dsl.application
import org.gradle.kotlin.dsl.repositories

plugins {
    application
    id("com.netflix.nebula.archrules.runner")

}
repositories {
    mavenCentral()
}
dependencies {
    archRules(project(":rules"))
    implementation("joda-time:joda-time:2.14.4")
    implementation(project(":library"))
}
archRules {
    failureThreshold("HIGH")
    skipPassingSummaries = false
    consoleDetailsThreshold("LOW")
}
application {
    mainClass = "myapp.MyApplication"
}