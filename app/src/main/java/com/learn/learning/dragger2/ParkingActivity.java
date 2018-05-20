package com.learn.learning.dragger2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.learn.learning.R;

import javax.inject.Inject;


public class ParkingActivity extends AppCompatActivity{
    @Inject
    Bus mBus;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);
        DaggerParkingComponent.create().inject(this);
        Log.i("yh", mBus.toString());
    }
}
