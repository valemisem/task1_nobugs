plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.rest-assured:rest-assured:4.5.1")
    testImplementation ("com.fasterxml.jackson.core:jackson-databind:2.15.0")
    testImplementation("com.google.code.gson:gson:2.8.8")
    compileOnly("org.projectlombok:lombok:1.18.28")
    annotationProcessor("org.projectlombok:lombok:1.18.28")
    testCompileOnly("org.projectlombok:lombok:1.18.28")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.28")
    testImplementation ("com.codeborne:selenide:7.4.3")

}

tasks.test {
    useJUnitPlatform()
}