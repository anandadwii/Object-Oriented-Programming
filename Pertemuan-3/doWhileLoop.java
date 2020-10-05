package com.pboreg;

public class doWhileLoop {
    public static void main(String[] args) {
        int a = 0;
        boolean kondisi=true;
        System.out.println("ini adalah awal program");

        do{
            a++;
            System.out.println("do while ke-"+a);

            if (a==10){
                kondisi=false;
            }

        }
        while (kondisi);

        System.out.println("ini adalah akhir program");
    }
}
