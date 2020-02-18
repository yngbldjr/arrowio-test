plugins {
    kotlin("jvm") version "1.3.61"
}

repositories {
    mavenCentral()
    jcenter()
    maven(url = "https://packages.confluent.io/maven/")
    maven(url = "https://jitpack.io")
    maven(url = "https://dl.bintray.com/arrow-kt/arrow-kt/")
    maven(url = "https://oss.jfrog.org/artifactory/oss-snapshot-local/")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation("io.arrow-kt:arrow-core:0.10.4")
    implementation("io.arrow-kt:arrow-fx:0.10.4")
    implementation("io.arrow-kt:arrow-syntax:0.10.4")

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("io.kotlintest:kotlintest-assertions-arrow:3.4.2")
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.4.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}