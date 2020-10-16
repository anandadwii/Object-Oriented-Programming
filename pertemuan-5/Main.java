package com.pbo;

public class Main {

    public static void main(String[] args) {
        Classku objku = new Classku();
        System.out.println(objku.x);
        System.out.println(objku.y);
        System.out.println(objku.tampilkanZ());
        System.out.println("\n");

        bilangan obj = new bilangan();
        System.out.println("Nilai A = "+obj.tampilkanA());
        System.out.println("Nilai B = "+obj.tampilkanB());
        System.out.println("Nilai C = "+obj.tampilkanC());


        //nilai A diinput
        obj.inputA(100);
        System.out.println("Nilai A setelah diinput = "+obj.tampilkanA());

        obj.inputB(200);
        System.out.println("Nilai B setelah diinput = "+obj.tampilkanB());

        obj.inputC(300);
        System.out.println("Nilai C setelah diinput = "+obj.tampilkanC());

        System.out.println("penjumlahan = "+obj.tambah());
        System.out.println("pengurangan ="+obj.kurang());
        System.out.println("perkalian = "+obj.kali());
        System.out.println("pembagian = "+obj.bagi());



    }
}
