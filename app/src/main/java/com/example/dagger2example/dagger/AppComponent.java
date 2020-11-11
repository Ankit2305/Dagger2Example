package com.example.dagger2example.dagger;

import com.example.dagger2example.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    CarComponent.Factory getCarComponentFactory();

    @Component.Factory
    interface Factory {
        AppComponent create(DriverModule driverModule);
    }
}
