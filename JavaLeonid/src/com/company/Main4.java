package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int first_num, a;
        System.out.print("Please enter first number: ");
        first_num = scn.nextInt();


        // &&(и)  ||(или)
        if(first_num > 10) {
            System.out.print("You are right!");
        }
        else {
            System.out.print("First number is bigger than 10");
        }

//        Если переменная а больше 5 и a меньше 10, то вывести в терминал верно(True), а
//        иначе выводим неверно(false)


    }
}
