package com.learn.learning.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.learn.learning.BR;

public class Person extends BaseObservable {
    private String name;
    private String age;
    private String birthday;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    @Bindable
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
        notifyPropertyChanged(BR.birthday);
    }
}
