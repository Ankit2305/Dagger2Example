package com.example.dagger2example.car;

import android.util.Log;

import com.example.dagger2example.dagger.ActivityScope;

import javax.inject.Inject;

@ActivityScope
public class Car {
    public static final String TAG = "Log_Car";

    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener();
    }

    public void drive() {
        engine.start();
        Log.d(TAG,  driver+ " " + driver.name + " driving " + this);
    }
}
