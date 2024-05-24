package com.example.borrar2

import android.app.Application
import com.example.borrar2.core.Config
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class Borrar2 : Application() {
    override fun onCreate() {
        super.onCreate()
        Config.url = "https://pokeapi.co/"
    }

}