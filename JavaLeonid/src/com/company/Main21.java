package com.company;

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        Scanner scn = new Scanner(System.in);
        int index;
        System.out.println("Please enter a number of month: ");
        index = scn.nextInt();
        while(true) {
            if(index>12 || index<1){
                System.out.println("Wrong month! Please enter again: ");
                index = scn.nextInt();
            }else{
                System.out.println(months[index-1]);
                break;
            }
        }
    }
}
