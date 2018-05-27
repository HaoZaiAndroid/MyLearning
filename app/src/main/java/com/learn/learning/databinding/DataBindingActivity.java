package com.learn.learning.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;

import com.learn.learning.R;

import java.util.ArrayList;
import java.util.List;

public class DataBindingActivity extends AppCompatActivity{
    ActivityDatabingBinding mBinding;
    private Person person;
    List<Person> datas = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_databing);
        init();
    }

    private void init() {
        initData();
        initView();
    }

    private void initView() {
        mBinding.rv.setLayoutManager(new GridLayoutManager(this, 2));
        ListAdapter listAdapter = new ListAdapter(this,datas);
        mBinding.rv.setAdapter(listAdapter);
    }

    private void initData() {
        for (int i = 0; i < 25; i++) {
            Person person = new Person();
            person.setName("姓名" + i);
            person.setBirthday("生日" + i);
            person.setAge("年龄" + i);
            datas.add(person);
        }
    }


}
