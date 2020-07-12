object Libs {
    const val kotlin_stdlib_jdk7 =
        "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${DependencyVersions.kotlinVersion}"

    const val appcompat = "androidx.appcompat:appcompat:${DependencyVersions.appcompat}"

    const val core_ktx = "androidx.core:core-ktx:${DependencyVersions.core_ktx}"

    const val junit_unit_test = "junit:junit:${DependencyVersions.junit_unit_test}"

    const val androidx_junit_ext =
        "androidx.test.ext:junit:${DependencyVersions.androidx_junit_ext}"

    const val espresso_core =
        "androidx.test.espresso:espresso-core:${DependencyVersions.espresso_core}"

    const val mvrx = "com.airbnb.android:mvrx:${DependencyVersions.mvrxVersion}"

    const val epoxy = "com.airbnb.android:epoxy:${DependencyVersions.epoxyVersion}"

    const val epoxy_databinding_support =
        "com.airbnb.android:epoxy-databinding:${DependencyVersions.epoxyVersion}"

    const val epoxy_annotation_processor =
        "com.airbnb.android:epoxy-processor:${DependencyVersions.epoxyVersion}"

    const val glide = "com.github.bumptech.glide:glide:${DependencyVersions.glideVersion}"

    const val glide_compiler =
        "com.github.bumptech.glide:compiler:${DependencyVersions.glideVersion}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${DependencyVersions.retrofitVersion}"

    const val gson = "com.squareup.retrofit2:converter-gson:${DependencyVersions.retrofitVersion}"

    const val logging_interceptor =
        "com.github.ihsanbal:LoggingInterceptor:${DependencyVersions.loggingInterceptor}"

    const val coroutines_core =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${DependencyVersions.coroutinesVersion}"

    const val coroutines_android =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${DependencyVersions.coroutinesVersion}"

    const val navigation_fragment_ktx =
        "androidx.navigation:navigation-fragment-ktx:${DependencyVersions.nav_version}"

    const val navigation_ui_ktx =
        "androidx.navigation:navigation-ui-ktx:${DependencyVersions.nav_version}"

    const val exo_player =
        "com.google.android.exoplayer:exoplayer:${DependencyVersions.exoPlayerVersion}"

    /******************************************************************************************
     ************************************* PROJECT LEVEL **************************************
     ******************************************************************************************/

    const val build_gradle = "com.android.tools.build:gradle:3.6.3"

    const val kotlin_gradle_plugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${DependencyVersions.kotlinVersion}"

    const val realm_gradle_plugin =
        "io.realm:realm-gradle-plugin:${DependencyVersions.realmVersion}"
}