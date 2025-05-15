plugins {
    java
    id("org.springframework.boot") version "2.2.1.RELEASE" // Upgrade Spring Boot
    id("io.spring.dependency-management") version "1.0.11.RELEASE" // Upgrade Plugin
}

group = "org.example"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.drools:drools-core:9.44.0.Final")
    implementation("org.drools:drools-compiler:9.44.0.Final")
    implementation("org.drools:drools-decisiontables:9.44.0.Final")
    implementation("org.drools:drools-mvel:9.44.0.Final")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
