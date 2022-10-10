package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args){
       int num1, num2,result;
       char sym;
       Scanner scn = new Scanner(System.in);
       System.out.print("Please enter first number: " + "\n");
       num1 = scn.nextInt();
       System.out.println("Please enter an operation(*, /, +, -): ");
       sym = scn.next().charAt(0);
       System.out.println("Please enter second number: ");
       num2 = scn.nextInt();

       if(sym != '*' && sym != '/' && sym != '+' && sym != '-'){
          System.out.println("Incorrect operation!!! Please try again!");
          System.out.println("Please enter an operation(*, /, +, -): ");
          sym = scn.next().charAt(0);
       }

      switch (sym){
          case '+':
              result = num1 + num2;
              System.out.println(result);
              break;
          case '*':
              result = num1 * num2;
              System.out.println(result);
              break;
          case '-':
              result = num1 - num2;
              System.out.println(result);
              break;
          case '/':
              result = num1 / num2;
              System.out.println(result);
              break;
      }
        System.out.println("Hello world");

    }
}
