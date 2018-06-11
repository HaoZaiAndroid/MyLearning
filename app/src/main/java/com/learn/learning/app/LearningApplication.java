package com.learn.learning.app;

import android.app.Application;

public class LearningApplication extends Application {

    private static LearningApplication learningApplication;

    public static LearningApplication getInstance() {
        return learningApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        learningApplication = this;
    }
}
