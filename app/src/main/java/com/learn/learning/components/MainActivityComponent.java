package com.learn.learning.components;

import com.learn.learning.activity.MainActivity;
import com.learn.learning.modules.MainActivityModule;
import com.learn.learning.scopes.PerActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@PerActivity
@Subcomponent(modules = {MainActivityModule.class})
public interface MainActivityComponent extends AndroidInjector<MainActivity>{
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }

}
