package com.company;

import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        int num1, num2, result;
        boolean isTrue = true;
        Scanner scn = new Scanner(System.in);
        System.out.println("This is a game!");
        System.out.println("Game rules: First number is a secret. Sum of two numbers must be lower than 100");
        while(true) {
        num1 = (int) Math.round(Math.random() * 100);
        System.out.println("Please enter second number: ");
            num2 = scn.nextInt();
            while (isTrue) {
                if (num2 < 15) {
                    System.out.println("Second number must be bigger than 15");
                    System.out.println("Please enter second number again: ");
                    num2 = scn.nextInt();
                } else {
                    result = num1 + num2;
                    if (result < 100) {
                        System.out.println("You have won the game! Because sum of two numbers was " + result);
                    } else {
                        System.out.println("Game over! Because sum of two numbers was " + result);
                    }
                    break;
                }
            }
        }
    }
}
