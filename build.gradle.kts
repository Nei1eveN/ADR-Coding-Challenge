// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        mavenCentral()
        jcenter()
        google()
    }
    dependencies {
        classpath(Libs.build_gradle)
        classpath(Libs.kotlin_gradle_plugin)
        /*classpath("com.github.dcendents:android-maven-gradle-plugin:2.1")*/

        // realm classpath
        classpath(Libs.realm_gradle_plugin)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        mavenCentral()
        jcenter()
        google()
        maven { url = uri("https://jitpack.io") }
    }
}

tasks.register("clean", Delete::class){
    delete(rootProject.buildDir)
}
