package com.company;

import java.util.Arrays;

public class Main18 {
    public static void main(String[] args) {
        int[] A12 = {17,17,17,17,17,16,18,19,20,17,17,18};
        int[] B12;
        int count = 0;
        int index = 0;
        for(int i = 0; i < A12.length; i++){
            if(A12[i] >= 18){
                count++;
            }
        }
        System.out.println("Count " + count);
        B12 = new int[count];
        for(int i = 0; i< A12.length; i++){
            if(A12[i] >= 18){
                B12[index] = A12[i];
                index++;
            }
        }
        System.out.println("index " + index);
        System.out.println(Arrays.toString(A12));
        System.out.println(Arrays.toString(B12));
    }
}
