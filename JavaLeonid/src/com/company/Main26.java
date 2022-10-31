package com.company;

import java.util.ArrayList;

public class Main26 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Audi");
        cars.add("Toyota");

        System.out.println(cars);
        System.out.println(cars.get(1));
        System.out.println(cars.size());
        cars.set(0, "BMW");
        System.out.println(cars);
        cars.remove(2);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);

    }
}
