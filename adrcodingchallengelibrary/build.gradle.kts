plugins {
    `android-library`
    /*id("com.android.library")*/
    kotlin("android")
    id("org.jetbrains.kotlin.android.extensions")
    id("kotlin-kapt")
    id("realm-android")
    `maven-publish`
}

/*kapt {
    correctErrorTypes = true
}*/

android {
    compileSdkVersion(29)

    defaultConfig {
        minSdkVersion(23)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    dataBinding {
        isEnabled = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    /*kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }*/

}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libs.kotlin_stdlib_jdk7)
    implementation(Libs.appcompat)
    implementation(Libs.core_ktx)
    testImplementation(Libs.junit_unit_test)
    androidTestImplementation(Libs.androidx_junit_ext)
    androidTestImplementation(Libs.espresso_core)

    // mvrx
    api(Libs.mvrx)
    // epoxy
    api(Libs.epoxy)
    // epoxy databinding support
    api(Libs.epoxy_databinding_support)
    // Add the annotation processor if you are using Epoxy's annotations (recommended)
    /*kapt(Libs.epoxy_annotation_processor)*/

    // glide
    api(Libs.glide)
    /*kapt(Libs.glide_compiler)*/

    // retrofit
    api(Libs.retrofit)
    // gson
    api(Libs.gson)
    // logging interceptor
    api(Libs.logging_interceptor) {
        exclude(group = "org.json", module = "json")
    }

    // kotlin coroutines
    api(Libs.coroutines_core)
    api(Libs.coroutines_android)

    // navigation jetpack
    // Kotlin
    api(Libs.navigation_fragment_ktx)
    api(Libs.navigation_ui_ktx)

    // Google ExoPlayer
    api(Libs.exo_player)
}
