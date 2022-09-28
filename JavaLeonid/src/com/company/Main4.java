package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int first_num;
        System.out.print("Please enter first number: ");
        first_num = scn.nextInt();



        if(first_num > 10) {
            System.out.print("You are right!");
        }
        else {
            System.out.print("First number is bigger than 10");
        }




    }
}
