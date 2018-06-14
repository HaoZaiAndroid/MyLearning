package com.learn.learning.activitys.main.view.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.learn.learning.R;
import com.learn.learning.databinding.FragmentTabTwoBinding;

public class TabTwoFragment extends Fragment {

    private FragmentTabTwoBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_two, container, false);
        binding = DataBindingUtil.bind(view);
        return view;
    }


    public void showlog() {

        Log.d("yh", "dagger2  tabOneFragment");
    }

}
