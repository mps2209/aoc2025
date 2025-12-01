plugins {
    kotlin("jvm") version "1.9.22"      // Adjust for your Kotlin version
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))              // Includes kotlin.test for multiplatform
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1") // JUnit 5
}

tasks.test {
    useJUnitPlatform()
}