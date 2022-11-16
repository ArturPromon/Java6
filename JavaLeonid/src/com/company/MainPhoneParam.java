package com.company;

public class MainPhoneParam {
    class memory{
        String memory = "Switched off";

        public void notworking(){
            memory = "memory not working";
            System.out.println(memory);
        }
        public void working(){
            memory = "memory is working";
            System.out.println(memory);
        }
    }
    class cpu{
        String cpu = "Switched off";

        public void working(){
            cpu = "cpu is working";
            System.out.println(cpu);
        }
        public void notworking(){
            cpu = "cpu not working";
            System.out.println(cpu);
        }

    }
    cpu IntelCore = new cpu();
    memory Ram = new memory();
}
