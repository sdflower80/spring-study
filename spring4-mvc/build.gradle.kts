plugins {
    java
    war
}

group = "sdflower80"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://repo.spring.io/release")
}

dependencies {
    implementation("org.springframework:spring-webmvc:4.3.30.RELEASE")
    implementation("org.apache.logging.log4j:log4j-api:2.14.0")
    implementation("org.apache.logging.log4j:log4j-core:2.14.0")

    providedCompile("javax.servlet:javax.servlet-api:3.1.0")
    testImplementation("junit", "junit", "4.12")
}
