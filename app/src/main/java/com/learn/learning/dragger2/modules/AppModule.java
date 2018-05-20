package com.learn.learning.dragger2.modules;

import android.content.Context;

import com.learn.learning.dragger2.LearingApp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(LearingApp application) {
        return application;
    }

}
