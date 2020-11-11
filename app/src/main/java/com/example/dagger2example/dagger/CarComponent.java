package com.example.dagger2example.dagger;

import com.example.dagger2example.MainActivity;
import com.example.dagger2example.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    //Constructor Injection
    Car getCar();

    //Field Injection
    void inject(MainActivity mainActivity);

//    @Subcomponent.Builder
//    interface Builder {
//
//        @BindsInstance
//        Builder horsePower(@HorsePower int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);
//
//        CarComponent build();
//    }

    @Subcomponent.Factory
    interface Factory {
        CarComponent create(@BindsInstance @HorsePower int horsePower,
                            @BindsInstance @Named("engineCapacity") int engineCapacity);
    }
}
