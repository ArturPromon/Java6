package com.company;

public class MyInterface2 implements ArrayInterface2{
    int[] a = new int[3];
    int size = 0;

    @Override
    public boolean Add(int value){
        if(size!= a.length){
            a[size] = value;
            size++;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int Get(int index){
        return a[index];
    }
}
