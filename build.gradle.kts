// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    System.setProperty("version", "1.6")
}

buildscript{


    System.setProperty("version", "1.6")
    repositories {
        google()
    }
    dependencies{
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
        val nav_version = "2.7.7"
        val hilt_version = "2.48"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:$hilt_version")

    }

}
