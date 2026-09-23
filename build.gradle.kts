plugins {
    id("com.netflix.nebula.archrules.aggregate")
}
tasks.wrapper {
    distributionType = Wrapper.DistributionType.BIN
    gradleVersion = "9.7.1"
}
repositories {
    mavenCentral()
}
archRulesAggregate {
    skipPassingSummaries = false
    consoleDetailsThreshold("LOW")
}