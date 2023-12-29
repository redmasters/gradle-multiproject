plugins {
    alias(libs.plugins.spring.boot)
    id("io.red.maxirail.common-conventions")
}

dependencies {
    implementation(project(":service"))
    implementation(libs.spring.boot.web)

    testImplementation(libs.spring.boot.test)
}