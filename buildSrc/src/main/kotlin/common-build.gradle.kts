plugins {
    java
}

group = "org.playground"
version = "1.0-SNAPSHOT"

dependencies {

    implementation( "com.thoughtworks.xstream:xstream:1.4.19") //group: 'com.thoughtworks.xstream', name: 'xstream', version: '1.4.19'
    implementation("org.apache.commons:commons-csv:1.9.0") //group: 'org.apache.commons', name: 'commons-csv', version: '1.9.0'

}


repositories {
    mavenCentral()
}

testing {
    suites {
        named("test", JvmTestSuite::class) {
            useJUnit()
        }
    }
}