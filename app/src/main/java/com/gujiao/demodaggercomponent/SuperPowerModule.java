package com.gujiao.demodaggercomponent;

import dagger.Module;
import dagger.Provides;

@Module
public class SuperPowerModule {
    @Provides
    public SuperPowerInvisibility provideSuperPower() {
        return new SuperPowerInvisibility();
    }
}
