package com.learn.learning.fragment;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.learn.learning.R;
import com.learn.learning.databinding.FragmentMainBinding;

public class MainFragment extends Fragment{

   private FragmentMainBinding binding;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        binding = DataBindingUtil.bind(view);
        return view;
    }


    public void showlog(){

        Log.d("yh", "dagger2  mainFragment");
    }

}
