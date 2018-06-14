package com.learn.learning.activitys.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.learn.learning.R;
import com.learn.learning.activitys.BaseDaggerActivity;
import com.learn.learning.databinding.ActivityMainBinding;
import com.learn.learning.utils.StatusBarUtil;

import javax.inject.Inject;


public class MainDaggerActivity extends BaseDaggerActivity implements View.OnClickListener {
    @Inject
    MainFragment mainFragment;
    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        init();
    }
    private void init() {
        initStatusView();
        initFragment();
    }

    private void initFragment() {

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
