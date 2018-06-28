package com.learn.learning.activitys.main.di;

import com.learn.learning.activitys.main.MainActivity;
import com.learn.learning.activitys.main.view.adapter.MainPagerAdapter;
import com.learn.learning.activitys.main.view.fragment.TabOneFragment;
import com.learn.learning.activitys.main.view.fragment.TabThreeFragment;
import com.learn.learning.activitys.main.view.fragment.TabTwoFragment;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {
    @Provides
    public TabOneFragment getTabOnefragment() {
        return new TabOneFragment();
    }

    @Provides
    public TabTwoFragment getTabTwofragment() {
        return new TabTwoFragment();
    }

    @Provides
    public TabThreeFragment getTabThreefragment() {
        return new TabThreeFragment();
    }
    @Provides
    public MainPagerAdapter getMainPagerAdapter(MainActivity mainActivity){
        return new MainPagerAdapter(mainActivity.getSupportFragmentManager());
    }
}
