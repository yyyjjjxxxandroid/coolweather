plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.coolweather.android"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.coolweather.android"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation("com.github.bumptech.glide:glide:3.7.0")
    implementation("org.litepal.guolindev:core:3.2.3")
    implementation("com.squareup.okhttp3:okhttp:3.4.1")
    implementation("com.google.code.gson:gson:2.7")

    implementation(files("libs/litepal-2.0.0-src.jar"))
}