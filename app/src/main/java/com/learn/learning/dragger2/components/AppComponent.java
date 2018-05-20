package com.learn.learning.dragger2.components;

import com.learn.learning.dragger2.LearingApp;
import com.learn.learning.dragger2.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AppModule.class,
        AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<LearingApp> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<LearingApp> {
    }

}
