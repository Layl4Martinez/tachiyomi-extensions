plugins {
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

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(Deps.kotlin.stdlib)
    compileOnly(Deps.okhttp)
    compileOnly(Deps.jsoup)
    // AndroidStub
    compileOnly(project(":lib-android-stub"))
}
