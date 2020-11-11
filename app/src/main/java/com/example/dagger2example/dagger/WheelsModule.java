package com.example.dagger2example.dagger;

import com.example.dagger2example.car.Rims;
import com.example.dagger2example.car.Tyres;
import com.example.dagger2example.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    public static Rims provideRims() {
        return new Rims();
    }

    @Provides
    public static Tyres provideTyres() {
        Tyres tyres = new Tyres();
        tyres.inflate();
        return tyres;
    }

    @Provides
    public static Wheels provideWheels(Rims rims, Tyres tyres) {
        return new Wheels(rims, tyres);
    }
}
