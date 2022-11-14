package com.company;

public class Phones {
    public static void main(String[] args) {
        //Create Object
        PhonesDemo IPhone = new PhonesDemo();
        PhonesDemo Samsung = new PhonesDemo();
        PhonesDemo Xiaomi = new PhonesDemo("Xiaomi AA",499 ,128);
        PhonesDemo LG = new PhonesDemo("LG BB", 399, 32);

        PhonesDemo2 Nokia = new PhonesDemo2();
        PhonesDemo2 Motorola = new PhonesDemo2("Motorola R5H", 49, 2);
        PhonesDemo2 StreetPhone = new PhonesDemo2("StreetPhone GGlass", 1);

        PhonesDemo3 Huawei = new PhonesDemo3("Huawei XP400", 379, 64, "Android", "Intelcore");
        // Object values
        IPhone.model = "IPhone XR";
        IPhone.price = 899;
        Samsung.model = "Samsung S20";
        Samsung.price = 799;
        Nokia.model = "Nokia 3310";
        Nokia.price = 99;
        Nokia.memory = 256;
        //Console out
        System.out.println(IPhone.model + " " + IPhone.price + "$ " + IPhone.memory + "GB");
        System.out.println(Samsung.model + " " + Samsung.price + "$ " + Samsung.memory+ "GB");
        System.out.println(Xiaomi.model + " " + Xiaomi.price + "$ " + Xiaomi.memory2+ "GB");
        System.out.println(LG.model + " " + LG.price + "$ " + LG.memory2+ "GB");
        System.out.println(Nokia.model + " " + Nokia.price + "$ " + Nokia.memory+ "MB");
        System.out.println(Motorola.model + " " + Motorola.price + "$ " + Motorola.memory+ "GB");
        System.out.println(StreetPhone.model + " " + StreetPhone.price + "$ ");
        System.out.println(Nokia.Calling("Calling +372 53026563"));
        System.out.println(Huawei.model + " " + Huawei.price + "$ " + Huawei.memory+ "GB " + Huawei.system + " " + Huawei.cpu
        );

    }
}
