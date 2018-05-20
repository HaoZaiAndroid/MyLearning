package com.learn.learning.dragger2;

import javax.inject.Inject;

public class Bus {
    private String driver;
    @Inject
    public Bus(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "driver='" + driver + '\'' +
                '}';
    }
}
