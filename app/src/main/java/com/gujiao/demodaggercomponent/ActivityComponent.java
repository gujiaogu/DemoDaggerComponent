package com.gujiao.demodaggercomponent;

import dagger.Component;

@Component(modules = GsonModule.class, dependencies = SuperPowerComponent.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
}
