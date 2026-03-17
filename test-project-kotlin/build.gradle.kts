plugins {
    id("idea")
    id("com.bakdata.gradle.avro") version ("2.0.0")
//    id "com.bakdata.gradle.avro" version "2.0.1-SNAPSHOT"
}

repositories {
    mavenCentral()
}

project.ext.set("avroVersion", "1.12.1")
dependencies {
    implementation("org.apache.avro:avro:${project.ext.get("avroVersion")}")
    implementation("org.apache.avro:avro-tools:${project.ext.get("avroVersion")}")
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

avro {
    stringType.set("CharSequence")
    fieldVisibility.set("private")
    customConversion(org.apache.avro.Conversions.UUIDConversion::class.java)
}
