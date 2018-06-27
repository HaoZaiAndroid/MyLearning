package com.learn.learning.activitys.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.learn.learning.R;
import com.learn.learning.activitys.main.view.adapter.MainPagerAdapter;
import com.learn.learning.activitys.main.view.fragment.TabOneFragment;
import com.learn.learning.activitys.main.view.fragment.TabThreeFragment;
import com.learn.learning.activitys.main.view.fragment.TabTwoFragment;
import com.learn.learning.base.BaseDaggerActivity;
import com.learn.learning.databinding.ActivityMainBinding;
import com.learn.learning.utils.StatusBarUtil;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;


public class MainActivity extends BaseDaggerActivity implements View.OnClickListener {
    private static final int TAB_ONE_INDEX = 0;
    private static final int TAB_TWO_INDEX = 1;
    private static final int TAB_THREE_INDEX = 2;

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
    private ImageView ivTitleOne;
    private ImageView ivTitleTwo;
    private ImageView ivTitleThree;
    private ImageView ivTitleMenu;
    private DrawerLayout drawerLayout;

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
        initListener();
        setCurrentItem(TAB_ONE_INDEX);
    }
    private void initListener() {
        ivTitleOne.setOnClickListener(this);
        ivTitleTwo.setOnClickListener(this);
        ivTitleThree.setOnClickListener(this);
        ivTitleMenu.setOnClickListener(this);

    }


    private void initId() {
        drawerLayout = mainBinding.drawerRoot;
        ivTitleMenu = mainBinding.include.ivTitleMenu;
        mainViewPager = mainBinding.include.mainViewPager;
        ivTitleOne = mainBinding.include.ivTitleOne;
        ivTitleTwo = mainBinding.include.ivTitleTwo;
        ivTitleThree = mainBinding.include.ivTitleThree;
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
            case R.id.iv_title_one:
                setCurrentItem(TAB_ONE_INDEX);
                break;
            case R.id.iv_title_two:
                setCurrentItem(TAB_TWO_INDEX);
                break;
            case R.id.iv_title_three:
                setCurrentItem(TAB_THREE_INDEX);
                break;
            case R.id.iv_title_menu:
                drawerLayout.openDrawer(GravityCompat.START);
                break;
            default:
                break;
        }
    }

    /**
     * 切换页面
     * @param position 分类角标
     */
    private void setCurrentItem(int position) {
        boolean isOne = false;
        boolean isTwo = false;
        boolean isThree = false;
        switch (position) {
            case 0:
                isOne = true;
                break;
            case 1:
                isTwo = true;
                break;
            case 2:
                isThree = true;
                break;
            default:
                isTwo = true;
                break;
        }
        mainViewPager.setCurrentItem(position);
        ivTitleOne.setSelected(isOne);
        ivTitleTwo.setSelected(isTwo);
        ivTitleThree.setSelected(isThree);
    }
}
