package com.learn.learning.activity;

import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import com.learn.learning.R;
import com.learn.learning.databinding.ActivityMainBinding;
import com.learn.learning.utils.StatusBarUtil;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    NavigationView mNavView;
    ActivityMainBinding mainBinding;
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        immersiveStatusBar();
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        init();

    }

    private void initStatusView() {
        ViewGroup.LayoutParams layoutParams = mainBinding.include.viewStatus.getLayoutParams();
        layoutParams.height = StatusBarUtil.getStatusBarHeight(this);
        mainBinding.include.viewStatus.setLayoutParams(layoutParams);
    }
    private void immersiveStatusBar() {
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
           // getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
    }

    private void init() {
        initViewID();
        StatusBarUtil.setTranslucentForDrawerLayout(this, mDrawerLayout, 0);
        initStatusView();
    }
    private void initViewID() {
        mNavView = mainBinding.navView;
        mDrawerLayout = mainBinding.drawerRoot;
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
        }
    }
}
