package com.learn.learning.activitys.main.view.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.learn.learning.R;
import com.learn.learning.activitys.main.view.adapter.BannerAdapter;
import com.learn.learning.app.ConstantsImageUrl;
import com.learn.learning.databinding.FragmentTabOneBinding;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

public class TabOneFragment extends DaggerFragment {

    private FragmentTabOneBinding binding;
    private RecyclerView banner;
    @Inject
    public BannerAdapter bannerAdapter;
    private List<String> list;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_one, container, false);
        binding = DataBindingUtil.bind(view);
        init();
        return view;
    }

    private void init() {
        banner = binding.banner;
        initData();
        banner.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false));
        new LinearSnapHelper().attachToRecyclerView(banner);
        banner.setAdapter(bannerAdapter);
        bannerAdapter.setUrllist(list);

    }

    private void initData() {
        list = new ArrayList<>();
        list.add(ConstantsImageUrl.TRANSITION_URLS[0]);
        list.add(ConstantsImageUrl.TRANSITION_URLS[1]);
        list.add(ConstantsImageUrl.TRANSITION_URLS[2]);
        list.add(ConstantsImageUrl.TRANSITION_URLS[3]);
        list.add(ConstantsImageUrl.TRANSITION_URLS[4]);
    }


}
