pluginManagement {
    plugins {
        id("com.netflix.nebula.archrules.library") version "latest.release"
        id("com.netflix.nebula.archrules.runner") version "latest.release"
        id("com.netflix.nebula.archrules.aggregate") version "latest.release"
    }
}
include(":library")
include(":application")
include(":rules")