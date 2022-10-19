package com.company;

import java.util.Arrays;

public class Razobrat_doma {
    public static void main(String[] args) {
        String[] a = {"K", "O", "Z", "Z", "G", "S", "F"};
        String[] b = new String[7];
        String temp;
        int n = a.length;
        for(int i =0; i < n/2; i++){
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            System.out.println(temp);
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
