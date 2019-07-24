package com.bawei.day_016;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

public class app extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
       JPushInterface.setDebugMode(true);
       JPushInterface.init(this);

    }
}
