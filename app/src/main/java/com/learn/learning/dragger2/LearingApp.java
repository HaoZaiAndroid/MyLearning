package com.learn.learning.dragger2;


import com.learn.learning.dragger2.components.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;


public class LearingApp extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return  DaggerAppComponent.builder().create(this);
    }
}
