package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int first_num;
        System.out.print("Please enter first number: ");
        first_num = scn.nextInt();

        switch(first_num){
            case 10:
                System.out.print("Num is 10");
                break;
            case 15:
                System.out.print("Num is 15");
                break;
            case 20:
                System.out.print("Num is 20");
                break;
            default:
                System.out.print("Num is some number");
        }
    }


}
