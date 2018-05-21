package com.learn.learning.dragger2.components;

import com.learn.learning.dragger2.activity.TestActivity;
import com.learn.learning.dragger2.modules.TestModule;
import com.learn.learning.dragger2.scopes.TestScope;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
@TestScope
@Subcomponent(modules = TestModule.class)
public interface TestCompnent extends AndroidInjector<TestActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TestActivity> {
    }
}
