package com.learn.learning.modules;

import com.learn.learning.fragment.MainFragment;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

//    @Provides
//    public TestBean getTestBean(){
//        return new TestBean();
//    }

    @Provides
    public MainFragment getMainfragment(){
        return new MainFragment();
    }
}
