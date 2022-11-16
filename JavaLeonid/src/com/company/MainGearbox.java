package com.company;

public class MainGearbox extends MainCar2 {
    public String GearboxType;

    MainGearbox(String mark, String model, String GearboxType){
        super(mark, model);
        this.GearboxType = GearboxType;
    }
}
