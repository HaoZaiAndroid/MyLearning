package com.learn.learning.components;

import com.learn.learning.app.LearningApplication;
import com.learn.learning.modules.AppModule;
import com.learn.learning.modules.BuildModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AppModule.class,
        BuildModule.class,
        AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<LearningApplication> {
    @Component.Builder
    public abstract class Builder extends AndroidInjector.Builder<LearningApplication> {
    }

}
