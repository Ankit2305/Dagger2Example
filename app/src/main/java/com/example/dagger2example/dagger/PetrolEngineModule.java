package com.example.dagger2example.dagger;

import com.example.dagger2example.car.Engine;
import com.example.dagger2example.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    public abstract Engine bindsEngine(PetrolEngine petrolEngine);
}
