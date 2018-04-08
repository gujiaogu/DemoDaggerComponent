package com.gujiao.demodaggercomponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Gson gson;
    @Inject
    SuperPowerInvisibility superPowerInvisibility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApplication) getApplication()).getActivityComponent().inject(this);
        superPowerInvisibility.lostInsight();
    }
}
