package com.company;

public class MainInterface2 {
    public static void main(String[] args) {
        ArrayInterface2 object = new MyInterface2();
        System.out.println(object.Add(5));
        System.out.println(object.Add(10));
        System.out.println(object.Add(15));
        System.out.println(object.Add(20));

        System.out.println(object.Get(2));
    }
}
