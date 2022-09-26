package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num, num2, result;
        System.out.println("Please enter first number: ");
        num = scn.nextInt();
        System.out.println("Please enter second number: ");
        num2 = scn.nextInt();
        result = num % num2;
        System.out.print("Sum of two numbers is: " + result);
    }
}
