package com.learn.learning.activitys.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import com.learn.learning.R;
import com.learn.learning.activitys.BaseDaggerActivity;
import com.learn.learning.activitys.main.view.adapter.MainPagerAdapter;
import com.learn.learning.activitys.main.view.fragment.TabOneFragment;
import com.learn.learning.activitys.main.view.fragment.TabThreeFragment;
import com.learn.learning.activitys.main.view.fragment.TabTwoFragment;
import com.learn.learning.databinding.ActivityMainBinding;
import com.learn.learning.utils.StatusBarUtil;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;


public class MainActivity extends BaseDaggerActivity implements View.OnClickListener {
    @Inject
    TabOneFragment tabOneFragment;
    @Inject
    TabTwoFragment tabTwoFragment;
    @Inject
    TabThreeFragment tabThreeFragment;
    @Inject
    MainPagerAdapter mainPagerAdapter;

    private ActivityMainBinding mainBinding;
    private ViewPager mainViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        init();
    }

    private void init() {
        initId();
        initStatusView();
        initFragment();
    }

    private void initId() {
        mainViewPager = mainBinding.include.mainViewPager;
    }

    private void initFragment() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(tabOneFragment);
        fragments.add(tabTwoFragment);
        fragments.add(tabThreeFragment);
        mainPagerAdapter.setFragmentList(fragments);
        mainViewPager.setAdapter(mainPagerAdapter);
    }

    private void initStatusView() {
        ViewGroup.LayoutParams layoutParams = mainBinding.include.viewStatus.getLayoutParams();
        layoutParams.height = StatusBarUtil.getStatusBarHeight(this);
        mainBinding.include.viewStatus.setLayoutParams(layoutParams);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
        }
    }
}
