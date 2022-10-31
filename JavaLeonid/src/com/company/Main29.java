package com.company;

public class Main29 {
    public static void main(String[] args) {
        int[] numbers = {34,7,694,56,353,97,1,5,945,345,234,35,955};
        int max,min;
        max=min=numbers[0];

        for(int i =0; i < numbers.length;i++) {
            if (max < numbers[i])
                max = numbers[i];

            if (min > numbers[i])
                min = numbers[i];
        }
        System.out.println("Max number in array is " + max);
        System.out.println("Min number in array is " + min);
    }
}
