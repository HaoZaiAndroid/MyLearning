package com.learn.learning.modules;

import com.learn.learning.activity.MainActivity;
import com.learn.learning.components.MainActivityComponent;
import com.learn.learning.scopes.PerActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(subcomponents = MainActivityComponent.class)
public abstract class BuildModule {

    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivityInjector();
}
