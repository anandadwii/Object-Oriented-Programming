package com.pbo;

interface Luas{
    public void setSisi(double...sisi);
    public double getLuas();
}
class LuasSegitiga implements  Luas {
    private double alas;
    private double tinggi;

    @Override
    public void setSisi(double... sisi) {
        this.alas = sisi[0];
        this.tinggi = sisi[1];

    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double getLuas() {
        double luas = 0.5*this.alas*this.tinggi;
        return luas;

    }
}
public class LAtihan4 {
    public static void main(String[] args) {
        LuasSegitiga ls = new LuasSegitiga();
        ls.setSisi(5,10);
        System.out.println("Luas segitiga = 0.5 x "+ls.getTinggi()+" x "
                +ls.getAlas()+" = "+ls.getLuas());


    }
}
