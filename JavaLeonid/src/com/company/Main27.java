package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main27 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);


        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Audi");
        cars.add("Toyota");
        cars.add("Bmw");
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println(cars);

    }
}
