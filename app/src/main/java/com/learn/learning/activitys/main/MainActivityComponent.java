package com.learn.learning.activitys.main;


import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@PerActivity
@Subcomponent(modules = {MainActivityModule.class})
public interface MainActivityComponent extends AndroidInjector<MainActivity>{
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }

}