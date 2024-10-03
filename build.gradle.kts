import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "2.0.20"
}

group = "codes.isuru"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

kotlin {
  compilerOptions {
    freeCompilerArgs = listOf("-Xcontext-receivers")
  }
}

dependencies {
  implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.1")
  testImplementation(kotlin("test"))
}

tasks.test {
  useJUnitPlatform()
}

tasks.withType<JavaCompile> {
  options.compilerArgs.add("--enable-preview")
}