package com.learn.learning.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.learn.learning.BR;
import com.learn.learning.R;

public class DataBindingActivity extends AppCompatActivity{
    ActivityDatabindingBinding mBinding;
    private Person person;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_databinding);
       testBinding();
    }

    public void testBinding() {
        Person person = new Person();
        person.setAge("18");
        person.setBirthday("10.01");
        person.setName("洪三元");
        mBinding.setVariable(BR.person, person);
    }
}
