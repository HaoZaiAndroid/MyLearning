package com.learn.learning.dragger2;

import dagger.Component;

@Component(modules = ParkingModule.class)
public interface ParkingComponent {
    void inject(ParkingActivity activity);
}
