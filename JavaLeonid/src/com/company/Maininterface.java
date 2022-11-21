package com.company;

public class Maininterface {
    public static void main(String[] args) {
        PrintInterface car1 = new Myinterface("Audi", "A6");
        PrintInterface bike1 = new Myinterface("Suzuki", "Z1");
        car1.printCar();
        bike1.printBike();
        ReadInterface car2 = new Myinterface();
        car2.readCar();
        ReadInterface bike2 = new Myinterface();
        bike2.readBike();
    }
}
