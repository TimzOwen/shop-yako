package com.timzowen.shopyako

import android.app.Application
import com.google.firebase.Firebase
import com.google.firebase.initialize
import com.timzowen.di.initializeKoin
import org.koin.android.ext.koin.androidContext

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initializeKoin(
            config = {
                androidContext(this@MyApplication)
            }
        )
        Firebase.initialize(this)
    }
}