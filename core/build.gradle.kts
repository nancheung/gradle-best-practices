plugins {
    id("my-plugin")
}

dependencies {
    // 使用api传递依赖到下游模块 https://docs.gradle.org/current/userguide/java_library_plugin.html#sec:java_library_configurations_graph
    api(libs.spring.boot.web)
}