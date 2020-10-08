plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
}


java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    compileOnly("io.reactivex:rxjava:1.3.6")
}
