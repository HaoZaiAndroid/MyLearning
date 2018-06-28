package com.learn.learning.activitys.main.view.fragment.di;

import com.learn.learning.activitys.main.view.fragment.TabOneFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {TabOneFragmentModule.class})
public interface TabOneFragmentComponent extends AndroidInjector<TabOneFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TabOneFragment> {
    }
}
