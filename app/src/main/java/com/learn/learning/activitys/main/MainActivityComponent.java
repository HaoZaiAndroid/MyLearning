package com.learn.learning.activitys.main;


import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@PerActivity
@Subcomponent(modules = {MainActivityModule.class})
public interface MainActivityComponent extends AndroidInjector<MainDaggerActivity>{
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainDaggerActivity> {
    }

}
