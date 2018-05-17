package com.learn.learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.learn.learning.databinding.DataBindingActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init() {
        View binding = findViewById(R.id.bt_binding);
        binding.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_binding:
                Intent bindingIntent = new Intent();
                bindingIntent.setClass(this,DataBindingActivity.class);
                startActivity(bindingIntent);
                break;
            default:
                break;
        }
    }
}
