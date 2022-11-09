package com.company;

import java.io.File;
import java.io.PrintWriter;

public class Main36 {
    public static void main(String[] args) {
        try{
            File file = new File("src/com/company/Artur.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.println("Hello my name is Artur");
            pw.println("Hello my name is Artur");
            pw.println("Hello my name is Artur");
            pw.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
