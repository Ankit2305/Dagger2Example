package com.example.dagger2example.car;

import android.util.Log;

public class Tyres {
    //Dummy third party library that can't be annotated with @Inject
    public static final String TAG = "Log_Tyres";

    public void inflate() {
        Log.d(TAG, "Tyres inflated");
    }
}
