package com.redrocks.service.ningxia.application;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by chuny on 2016/4/21.
 */
public class NXApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
