package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        int[] numbers;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter length of an array: ");
        int length = scn.nextInt();
        numbers = new int[length];
        for(int i = 0; i< numbers.length; i++){
            System.out.print("numbers[" + i + "] = ");
            numbers[i] = scn.nextInt();
        }
        System.out.print(Arrays.toString(numbers));
    }
}
