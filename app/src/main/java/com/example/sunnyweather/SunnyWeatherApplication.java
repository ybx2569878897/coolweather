package com.example.sunnyweather;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class SunnyWeatherApplication extends Application {
    private static Context context;
    private static final String TOKEN = "KUS9uUCOoijtj8bG";
    @SuppressLint("MissingSuperCall")
    @Override
    public void onCreate() {
        context=getApplicationContext();
        
    }
    public static Context getContext(){
        return context;
    }
}
