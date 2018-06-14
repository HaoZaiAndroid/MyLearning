package com.learn.learning.activitys.main;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    public MainFragment getMainfragment(){
        return new MainFragment();
    }
}
