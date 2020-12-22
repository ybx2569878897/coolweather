package com.example.weather

import android.annotation.SuppressLint
import android.content.Context

class SunnyWeatherApplication {
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context:Context
    }
    override fun onCreate(){
        super.onCreate()
        context=applicationContext
    }
}