package com.company;

import java.util.Arrays;

public class Main15 {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,35,345,345,435,5,543,5,35,45,34,34,53,5,345,35,345,35,345,324,234,234,234,234,234};
        System.out.println(Arrays.toString(array));
        array[27] = 0;
        for(int i = 0; i< array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
}
