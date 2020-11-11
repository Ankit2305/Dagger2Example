package com.example.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    public static final String TAG = "Log_Remote";

    @Inject
    public Remote() {}

    public void setListener() {
        Log.d(TAG, "Setting up listener");
    }

}
