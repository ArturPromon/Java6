package com.company;

public class MainEngine extends MainCar2 {
    public String fuelType;

    MainEngine(String mark, String model, String fuelType){
        super(mark, model);
        this.fuelType = fuelType;
    }
}
