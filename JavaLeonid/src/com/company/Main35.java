package com.company;

public class Main35 {
    public static void main(String[] args) {
        try{
            int[] numbers = {1,2,3};
//            int num = 5;
//            int num2 = num/0;
//            System.out.println(num2);
            System.out.println(numbers[2]);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("hello");
            int num = 100;
            System.out.println(num);
        }


    }
}
