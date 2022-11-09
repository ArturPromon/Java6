package com.company;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {188, 181, 156, 162, 173, 152, 169, 193, 185};
        int max;
        int index = 0;
        max = numbers[0];

        for(int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                index = i;
            }
        }
        System.out.println("Index of max number in array is " + index);
    }
}
