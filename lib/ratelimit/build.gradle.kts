plugins {
    //id("com.android.library")
    kotlin("jvm")
}

/*android {
    compileSdkVersion(AndroidConfig.compileSdk)
    buildToolsVersion(AndroidConfig.buildTools)

    defaultConfig {
        minSdkVersion(AndroidConfig.minSdk)
        targetSdkVersion(AndroidConfig.targetSdk)
    }
}*/

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(Deps.kotlin.stdlib)
    compileOnly(Deps.okhttp)
    // AndroidStub
    compileOnly(project(":lib-android-stub"))
}
