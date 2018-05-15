package com.learn.learning;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.learn.learning.databinding.ActivityMainBinding;
import com.learn.learning.databinding.Person;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    public void testBinding() {
        Person person = new Person();
        person.setAge("18");
        person.setBirthday("10.01");
        person.setName("洪三元");
        mMainBinding.setVariable(BR.person, person);
    }
}
