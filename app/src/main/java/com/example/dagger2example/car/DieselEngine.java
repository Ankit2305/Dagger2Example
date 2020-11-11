package com.example.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    public static final String TAG = "Log_DieselEngine";
    private int horsePower;

    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.i(TAG, "Diesel engine started... horsePower: " + horsePower);
    }
}
