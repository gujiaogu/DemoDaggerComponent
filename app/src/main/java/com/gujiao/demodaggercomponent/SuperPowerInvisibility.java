package com.gujiao.demodaggercomponent;

import android.util.Log;

import javax.inject.Inject;

public class SuperPowerInvisibility {

    @Inject
    SuperPowerInvisibility(){}

    public void lostInsight() {
        Log.d("=======", "lost insight");
    }
}
