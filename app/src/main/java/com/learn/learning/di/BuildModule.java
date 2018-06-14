package com.learn.learning.di;

import com.learn.learning.activitys.main.MainDaggerActivity;
import com.learn.learning.activitys.main.MainActivityComponent;
import com.learn.learning.activitys.main.MainActivityModule;
import com.learn.learning.activitys.main.PerActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(subcomponents = MainActivityComponent.class)
public abstract class BuildModule {

    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainDaggerActivity mainActivityInjector();
}
