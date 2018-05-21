package com.learn.learning.dragger2.bean;

import android.content.Context;
import android.widget.Toast;

import com.learn.learning.dragger2.interfaces.ISpeak;

import javax.inject.Inject;

public class Cat implements ISpeak{

    @Inject
    public Cat(){

    }
    @Override
    public void speak(Context context) {
        Toast.makeText(context, "说话的猫", Toast.LENGTH_SHORT).show();
    }
}
