plugins {
    java
}

repositories {
    mavenCentral()
}

testing {
    suites {
        named("test", JvmTestSuite::class){
            useJUnitJupiter()
        }
    }
}