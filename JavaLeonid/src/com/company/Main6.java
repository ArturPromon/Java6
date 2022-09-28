package com.company;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int date;
        System.out.print("When Happy New Year? :");
        date = scn.nextInt();

        switch(date){
            case 1:
                System.out.println("Ulala Happy New Year!");
                break;
            default:
                System.out.print("We need to work!");
        }
    }
}
