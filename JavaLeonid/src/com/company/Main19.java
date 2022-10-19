package com.company;

public class Main19 {
    public static void main(String[] args) {
        String firstname = "Artur";
        String lastname = "Sovkunenko";
        int i = 0;
        while(true){
            if(i>9){
                break;
            }
            i++;
//            System.out.println(firstname);
            if(i==5){
                System.out.println(firstname + " " + lastname);
            }else{
                System.out.println(firstname);
            }
        }
    }
}
