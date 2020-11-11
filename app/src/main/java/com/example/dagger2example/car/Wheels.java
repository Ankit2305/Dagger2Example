package com.example.dagger2example.car;

public class Wheels {

    //Dummy third party library that can't be annotated with @Inject

    private Rims rims;
    private Tyres tyres;

    public Wheels(Rims rims, Tyres tyres) {
        this.rims = rims;
        this.tyres = tyres;
    }

}
