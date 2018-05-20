package com.learn.learning.dragger2;

import dagger.Module;
import dagger.Provides;
@Module
class ParkingModule {
    public ParkingModule() {
    }
    @Provides
    public String provideDriver() {
        return "隔壁老王";
    }
}
