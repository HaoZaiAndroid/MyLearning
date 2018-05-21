package com.learn.learning.dragger2.modules;

import com.learn.learning.dragger2.activity.TestActivity;
import com.learn.learning.dragger2.components.TestCompnent;
import com.learn.learning.dragger2.scopes.TestScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(subcomponents = {TestCompnent.class})
public abstract class BuildModule {

    @TestScope
    @ContributesAndroidInjector(modules = TestModule.class)
    abstract TestActivity contributeSecondActivityInjector();
}
