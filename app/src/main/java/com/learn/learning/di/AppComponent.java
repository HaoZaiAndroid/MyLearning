package com.learn.learning.di;

import com.learn.learning.app.LearningApplication;

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
