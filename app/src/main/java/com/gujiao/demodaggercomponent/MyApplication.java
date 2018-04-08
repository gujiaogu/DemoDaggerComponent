package com.gujiao.demodaggercomponent;

import android.app.Application;

public class MyApplication extends Application {

    ActivityComponent activityComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        activityComponent = DaggerActivityComponent.builder().superPowerComponent(
                DaggerSuperPowerComponent.create()).build();
    }

    ActivityComponent getActivityComponent() {
        return activityComponent;
    }
}
