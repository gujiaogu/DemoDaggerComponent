package com.gujiao.demodaggercomponent;

import dagger.Component;

@Component(modules = SuperPowerModule.class)
public interface SuperPowerComponent {
    SuperPowerInvisibility testSuperPower();
}
