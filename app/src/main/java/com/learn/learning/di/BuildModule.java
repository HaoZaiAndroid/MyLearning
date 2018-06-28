package com.learn.learning.di;

import com.learn.learning.activitys.main.MainActivity;
import com.learn.learning.activitys.main.MainActivityComponent;
import com.learn.learning.activitys.main.di.MainActivityModule;
import com.learn.learning.activitys.main.di.PerActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(subcomponents = MainActivityComponent.class)
public abstract class BuildModule {

    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivityInjector();
}
