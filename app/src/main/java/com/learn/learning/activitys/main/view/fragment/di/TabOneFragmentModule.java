package com.learn.learning.activitys.main.view.fragment.di;

import android.content.Context;

import com.learn.learning.activitys.main.view.adapter.BannerAdapter;

import dagger.Module;
import dagger.Provides;

@Module
public class TabOneFragmentModule {
    @Provides
    public BannerAdapter getBannerAdapter(Context context) {
        return new BannerAdapter(context);
    }

}
