package com.example.dagger2example.car;

import android.util.Log;

import com.example.dagger2example.dagger.EngineCapacity;
import com.example.dagger2example.dagger.HorsePower;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    public static final String TAG = "Log_PetrolEngine";

    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@HorsePower int horsePower, @Named("engineCapacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.i(TAG, "Petrol engine started... horsePower: " + horsePower + " | engineCapacity: " + engineCapacity);
    }
}
