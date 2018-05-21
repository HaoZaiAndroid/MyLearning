package com.learn.learning.dragger2.modules;

import com.learn.learning.dragger2.bean.Cat;

import dagger.Module;
import dagger.Provides;

@Module
public class TestModule {

    @Provides
    public Cat getSpeakCat(){
        return new Cat();
    }
}
