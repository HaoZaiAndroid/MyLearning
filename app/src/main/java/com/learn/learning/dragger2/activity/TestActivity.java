package com.learn.learning.dragger2.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.learn.learning.R;
import com.learn.learning.dragger2.bean.Cat;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class TestActivity extends AppCompatActivity implements View.OnClickListener {
    @Inject
    Cat mCat;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        View cat = findViewById(R.id.bt_cat);
        cat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_cat:
                mCat.speak(this);
                break;
            default:
                break;
        }
    }

}
