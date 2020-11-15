package com.pbo;
import java.util.Scanner;

abstract class bentuk{
    //abstract method
    abstract void luas();

}

class Segitiga extends bentuk{
    int alas;
    int tinggi;
    double luas;


    public void setAlas(int alas) {
        this.alas = alas;
    }


    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void luas(){
        luas = alas*tinggi*0.5;
        System.out.println("luas Segitiga adalah 0.5 x "+alas+"cm x cm"+tinggi+" = "+luas+"cm^2");

    }

}

class Lingkaran extends bentuk{
    int diameter;
    double luas;
    double pi;


    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public void luas(){
        if (diameter % 7 == 0){
            pi=(double)22/7;
        }
        else{
            pi=3.14;
        }
        luas=pi*(((double)diameter/2)*((double)diameter/2));
        System.out.println("luas Lingkaran adalah pi x "+diameter+"cm^2 = "+luas+"cm^2");
    }


}
class message{
    void sawer(){
        System.out.println("Go-Pay : 14045");
        System.out.println("Dana : 0821-xxxx-xxxx");
        System.out.println("trakteer : trakteer.id/devBangun");
    }
    void compliments(){
        System.out.println("terima kasih telah memakai aplikasi kami, silakan donasi agar dev semangat xixixi");
    }
}
public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();
        message message = new message();

        int alas;
        int tinggi;
        int diameter;
        int n=0;
        int pilih;

        while (n<5){
            System.out.println("\nselamat datang di kalkulator khusus lingkaran dan segitiga");
            System.out.println("\n\nmenu :");
            System.out.println("1. hitung lingkaran");
            System.out.println("2. hitung segitiga");
            System.out.println("3. donasi ke developer gan!");
            System.out.println("4. keluar");

            System.out.print("silakan masukkan pilihan  ");
            pilih=input.nextInt();
            switch (pilih) {
                case 1 -> {
                    System.out.println("hitung luas lingkaran");
                    System.out.print("masukkan diameter = ");
                    diameter = input.nextInt();
                    lingkaran.setDiameter(diameter);
                    lingkaran.luas();
                }
                case 2 -> {
                    System.out.println("hitung luas segitiga ");
                    System.out.print("masukkan alas = ");
                    alas = input.nextInt();
                    segitiga.setAlas(alas);
                    System.out.print("masukkan tinggi = ");
                    tinggi = input.nextInt();
                    segitiga.setTinggi(tinggi);
                    segitiga.luas();
                }
                case 3 -> {
                    message.sawer();
                    return;
                }
                case 4 -> {
                    message.compliments();
                    return;
                }
            }
            n++;
        }






    }
}
