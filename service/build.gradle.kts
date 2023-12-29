plugins {
    `java-library`
    id("io.red.maxirail.common-conventions")
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(":model"))
    implementation(libs.spring.boot.starter)
}

testing {
    suites {
        named("test", JvmTestSuite::class){
            useJUnitJupiter()
        }

    }
}