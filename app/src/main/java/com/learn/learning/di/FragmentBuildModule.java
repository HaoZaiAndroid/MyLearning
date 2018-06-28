package com.learn.learning.di;

import android.support.v4.app.Fragment;

import com.learn.learning.activitys.main.view.fragment.TabOneFragment;
import com.learn.learning.activitys.main.view.fragment.di.TabOneFragmentComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = TabOneFragmentComponent.class)
public abstract class FragmentBuildModule {
    @Binds
    @IntoMap
    @FragmentKey(TabOneFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    TabOneFragmentInjectorFactory(TabOneFragmentComponent.Builder builder);

}
