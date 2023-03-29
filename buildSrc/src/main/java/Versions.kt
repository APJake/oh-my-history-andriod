/**
 * Created by AP-Jake
 * on 29/03/2023
 */

object ConfigData {
    const val compileSdkVersion = 33
    const val buildToolsVersion = "30.0.3"
    const val minSdkVersion = 21
    const val targetSdkVersion = 32
    private const val versionMajor = 2
    private const val versionMinor = 0
    private const val versionPatch = 1
    private const val versionBuild = 1
    const val versionName = "$versionMajor.$versionMinor.$versionPatch-$versionBuild"
    const val versionCode =
        17 * 10000000 + versionMajor * 1000000 + versionMinor * 10000 + versionPatch * 100 + versionBuild
    const val debugTag = "(testing)"
}

object Network {
    private const val retrofitVersion = "2.9.0"

    const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
    const val retrofitConverterMoshi = "com.squareup.retrofit2:converter-moshi:$retrofitVersion"
    const val retrofitConverterScalar = "com.squareup.retrofit2:converter-scalars:$retrofitVersion"
    const val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:4.10.0"
}

object Firebase {
    private const val bomVersion = "31.2.0"

    const val bom = "com.google.firebase:firebase-bom:$bomVersion"
    const val crashlytics = "com.google.firebase:firebase-crashlytics-ktx"
    const val analytics = "com.google.firebase:firebase-analytics-ktx"
    const val config = "com.google.firebase:firebase-config-ktx"
    const val cloudMessaging = "com.google.firebase:firebase-messaging-ktx"
}

object ComposeUi {
    private const val FLOW_VERSION = "0.26.2-beta"
    const val flowLayout = "com.google.accompanist:accompanist-flowlayout:$FLOW_VERSION"

    private const val DESTINATION_VERSION = "1.7.33-beta"
    const val destinationKsp = "io.github.raamcosta.compose-destinations:ksp:$DESTINATION_VERSION"
    const val destination = "io.github.raamcosta.compose-destinations:animations-core:$DESTINATION_VERSION"
}

object JetpackCompose {
    const val VERSION = "1.4.2"

    const val composeBomPlatform = "androidx.compose:compose-bom:2023.01.00"

    const val ui = "androidx.compose.ui:ui"
    const val material = "androidx.compose.material:material"
    const val uiPreview = "androidx.compose.ui:ui-tooling-preview"
    const val activity = "androidx.activity:activity-compose:1.3.1"

    const val uiUtil = "androidx.compose.ui:ui-util"

    // UI
    const val constraintLayout = "androidx.constraintlayout:constraintlayout-compose:1.0.1"

    // google accompanists
    private const val FLOW_VERSION = "0.29.1-alpha"
    private const val SWIPE_REFRESH = "0.26.1-alpha"
    const val swipeRefresh = "com.google.accompanist:accompanist-swiperefresh:$SWIPE_REFRESH"
    const val flowLayout = "com.google.accompanist:accompanist-flowlayout:$FLOW_VERSION"

    private const val MATERIAL_ICONS_VERSION = "1.2.1"
    const val materialIcons =
        "androidx.compose.material:material-icons-extended:$MATERIAL_ICONS_VERSION"

    // third party libs
    const val dateTimePicker = "io.github.vanpra.compose-material-dialogs:datetime:0.9.0"

    // testing
    const val uiTest = "androidx.compose.ui:ui-test-junit4"
    const val uiTooling = "androidx.compose.ui:ui-tooling"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest"
}

object DataStore {
    const val datastore = "androidx.datastore:datastore:1.0.0"
    const val preferences = "androidx.datastore:datastore-preferences:1.0.0"
}

object Hilt {
    private const val VERSION = "2.44"
    const val fragment = "androidx.hilt:hilt-navigation-fragment:1.0.0"
    const val navigationCompose = "androidx.hilt:hilt-navigation-compose:1.0.0"
    const val compiler = "com.google.dagger:hilt-android-compiler:$VERSION"
    const val android = "com.google.dagger:hilt-android:$VERSION"
    const val core = "com.google.dagger:hilt-core:$VERSION"

}

object CommonUi {
    //    private const val CONSTRAINT_VERSION = "2.1.2"
    private const val CONSTRAINT_VERSION = "2.1.4"

    //    private const val MATERIAL_VERSION = "1.6.0"
    private const val MATERIAL_VERSION = "1.4.0"
    const val material = "com.google.android.material:material:$MATERIAL_VERSION"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:$CONSTRAINT_VERSION"
    const val legacySupport = "androidx.legacy:legacy-support-v4:1.0.0"
    const val core = "androidx.core:core-ktx:1.7.0"
    const val appCompat = "androidx.appcompat:appcompat:1.4.0"
    const val fragment = "androidx.fragment:fragment-ktx:1.5.5"

    private const val GLIDE_VERSION = "4.13.0"
    const val glide = "com.github.bumptech.glide:glide:$GLIDE_VERSION"

    const val splashScreen = "androidx.core:core-splashscreen:1.0.0"
}

object Others {
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.10"
    const val dataBinding = "com.android.databinding:compiler:3.2.0-alpha10"
    const val timber = "com.jakewharton.timber:timber:5.0.1"
    const val desugarJdk = "com.android.tools:desugar_jdk_libs:1.1.6"

    const val kotlinxCollections = "org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.5"
    const val kotlinxSerialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2"
}

object Coroutine {
    //    private const val VERSION = "1.6.1"
    private const val VERSION = "1.6.0"
    const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$VERSION"
    const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$VERSION"
}

object Lifecycle {
    private const val VERSION = "2.5.0"

    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"
    const val extension = "androidx.lifecycle:lifecycle-extensions:2.2.0"
    const val compiler = "androidx.lifecycle:lifecycle-compiler:$VERSION"
    const val common = "androidx.lifecycle:lifecycle-common-java8:$VERSION"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$VERSION"
}

object Room {
    private const val VERSION = "2.4.2"
    const val compiler = "androidx.room:room-compiler:$VERSION"
    const val ktx = "androidx.room:room-ktx:$VERSION"
    const val runtime = "androidx.room:room-runtime:$VERSION"
    const val testing = "androidx.room:room-testing:$VERSION"
}

object Navigation {
    private const val VERSION = "2.5.1"

    const val fragment = "androidx.navigation:navigation-fragment-ktx:$VERSION"
    const val ui = "androidx.navigation:navigation-ui-ktx:$VERSION"
    const val compose = "androidx.navigation:navigation-compose:$VERSION"
}

object Testings {
    const val junit = "junit:junit:4.13.2"
    const val extJunit = "androidx.test.ext:junit:1.1.5"
    const val espressoCore = "androidx.test.espresso:espresso-core:3.5.1"
}
