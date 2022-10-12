package com.company;

import java.util.Arrays;

public class Main14 {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6,7,8,9,10,9,8,8,8,9,10};
        System.out.println(Arrays.toString(array));
        int[] array2 = {1,2,3,4,5,6};
        System.out.println(array2[5]);

        int[][] array3 = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12,13,14,15}, {0}};
        System.out.println(array3[4][0]);

        int[] array4 = new int[5];
        array4[0] = 10;
        array4[1] = 20;
        array4[2] = 30;
        array4[3] = 40;
        array4[4] = 50;

        System.out.println(Arrays.toString(array4));


        String[] cars = new String[7];

        cars[0] = "Audi";
        cars[1] = "Bmw";
        cars[2] = "MB";
        cars[3] = "MB";
        cars[4] = "MB";
        cars[5] = "MB";
        cars[6] = "MB";
        

        System.out.println(Arrays.toString(cars));


    }
}
