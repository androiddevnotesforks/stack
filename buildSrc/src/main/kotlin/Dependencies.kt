object Versions {
    const val androidxAppCompat = "1.2.0-alpha02"
    const val androidxBrowser = "1.3.0-alpha01"
    const val androidxLifecycleExtensions = "2.2.0"
    const val androidxPreference = "1.1.0"
    const val androidxSwipeRefreshLayout = "1.1.0-alpha03"
    const val androidxTestCore = "1.3.0-alpha03"
    const val androidxViewPager2 = "1.0.0"
    const val apacheCommonsText = "1.8"
    const val betterLinkMovementMethod = "2.2.0"
    const val coil = "0.9.4"
    const val constraintLayout = "2.0.0-beta4"
    const val compose = "0.1.0-dev04"
    const val crashlytics = "2.10.1"
    const val detekt = "1.5.0"
    const val espresso = "3.1.0"
    const val fabric = "1.31.2"
    const val firebaseCore = "17.2.2"
    const val googleServices = "4.3.3"
    const val gradlePlugin = "4.0.0-alpha09"
    const val insetter = "0.2.0"
    const val jUnit = "4.12"
    const val klock = "1.8.6"
    const val kotlin = "1.3.61"
    const val kotlinxCoroutines = "1.3.3"
    const val ktlintGradle = "8.2.0"
    const val ktxActivityExtensions = "1.1.0"
    const val ktxFragmentExtensions = "1.2.0"
    const val markwon = "4.2.1"
    const val materialComponents = "1.2.0-alpha04"
    const val mockito = "3.0.0"
    const val mockitoKotlin = "2.1.0"
    const val moshi = "1.9.2"
    const val okHttp = "4.2.2"
    const val playCore = "1.6.4"
    const val prism4j = "2.0.0"
    const val processPhoenix = "2.0.0"
    const val retrofit = "2.7.1"
    const val robolectric = "4.3"
    const val room = "2.2.3"
    const val testRunner = "1.1.0"
    const val timber = "4.7.1"
}

object Dep {
    const val androidxAppCompat = "androidx.appcompat:appcompat:${Versions.androidxAppCompat}"
    const val androidxBrowser = "androidx.browser:browser:${Versions.androidxBrowser}"
    const val androidxLifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.androidxLifecycleExtensions}"
    const val androidxPreference = "androidx.preference:preference:${Versions.androidxPreference}"
    const val androidxSwipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.androidxSwipeRefreshLayout}"
    const val androidxTestCore = "androidx.test:core:${Versions.androidxTestCore}"
    const val androidxViewPager2 = "androidx.viewpager2:viewpager2:${Versions.androidxViewPager2}"
    const val apacheCommonsText = "org.apache.commons:commons-text:${Versions.apacheCommonsText}"
    const val betterLinkMovementMethod = "me.saket:better-link-movement-method:${Versions.betterLinkMovementMethod}"
    const val coil = "io.coil-kt:coil:${Versions.coil}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val composeCompiler = "androidx.compose:compose-compiler:${Versions.compose}"
    const val composeRuntime = "androidx.compose:compose-runtime:${Versions.compose}"
    const val composeUiCore = "androidx.ui:ui-core:${Versions.compose}"
    const val composeUiFoundation = "androidx.ui:ui-foundation:${Versions.compose}"
    const val composeUiLayout = "androidx.ui:ui-layout:${Versions.compose}"
    const val composeUiMaterial= "androidx.ui:ui-material:${Versions.compose}"
    const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}"
    const val fabricPlugin = "io.fabric.tools:gradle:${Versions.fabric}"
    const val firebaseCore = "com.google.firebase:firebase-core:${Versions.firebaseCore}"
    const val googleServicesPlugin = "com.google.gms:google-services:${Versions.googleServices}"
    const val insetter = "dev.chrisbanes:insetter-ktx:${Versions.insetter}"
    const val klock = "com.soywiz.korlibs.klock:klock:${Versions.klock}"
    const val kotlinLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val kotlinCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinxCoroutines}"
    const val kotlinCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinxCoroutines}"
    const val ktxActivityExtensions = "androidx.activity:activity-ktx:${Versions.ktxActivityExtensions}"
    const val ktxFragmentExtensions = "androidx.fragment:fragment-ktx:${Versions.ktxFragmentExtensions}"
    const val ktxLiveDataExtensions = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.androidxLifecycleExtensions}"
    const val ktxViewModelExtensions = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.androidxLifecycleExtensions}"
    const val markwonCore = "io.noties.markwon:core:${Versions.markwon}"
    const val markwonHtml = "io.noties.markwon:html:${Versions.markwon}"
    const val markwonImageCoil = "io.noties.markwon:image-coil:${Versions.markwon}"
    const val markwonStrikethrough = "io.noties.markwon:ext-strikethrough:${Versions.markwon}"
    const val markwonSyntaxHighlight = "io.noties.markwon:syntax-highlight:${Versions.markwon}"
    const val markwonTables = "io.noties.markwon:ext-tables:${Versions.markwon}"
    const val materialComponents = "com.google.android.material:material:${Versions.materialComponents}"
    const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    const val moshiKotlinCodegen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpLogger = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    const val okHttpMock = "com.squareup.okhttp3:mockwebserver:${Versions.okHttp}"
    const val playCore = "com.google.android.play:core:${Versions.playCore}"
    const val prism4jBundler = "io.noties:prism4j-bundler:${Versions.prism4j}"
    const val processPhoenix = "com.jakewharton:process-phoenix:${Versions.processPhoenix}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitMoshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val roomProcessor = "androidx.room:room-compiler:${Versions.room}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
    const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"

    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val gradlePlugin = "com.android.tools.build:gradle:${Versions.gradlePlugin}"
}
