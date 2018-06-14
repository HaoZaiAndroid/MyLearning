package com.learn.learning.di;

import android.content.Context;

import com.learn.learning.app.LearningApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    @Singleton
    Context provideContext(LearningApplication application) {
        return application;
    }
}
