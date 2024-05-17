package com.plcoding.jetpackviewmodel_cmp

import KoinKMPStarter
import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()

        KoinKMPStarter().init {
            androidLogger()
            androidContext(this@MyApp)
        }
    }
}