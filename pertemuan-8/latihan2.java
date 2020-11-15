package com.pbo;
abstract class hitungLuas{
    protected double sisi1;
    protected double sisi2;

    public hitungLuas(){
        this.sisi1=0;
        this.sisi2=0;
    }

    public void setSisi(double sisi1){
        this.sisi1=sisi1;
    }
    public void setSisi(double sisi1, double sisi2){
        this.sisi1=sisi1;
        this.sisi2=sisi2;
    }
    public double getSisi1(){
        return sisi1;
    }
    public double getSisi2(){
        return sisi2;
    }
    public abstract double getLuas();
}

class Segitiga1 extends hitungLuas {
    public double getLuas(){
        double luas = 0.5*this.sisi1*this.sisi2;
        return luas;
    }
}
class Lingkaran1 extends hitungLuas{
    public double getLuas(){
        double r = this.sisi1/2;
        double luas = 3.14*r*r;
        return luas;
    }
}
public class latihan2 {
    public static void main(String[] args) {
        Segitiga1 oSegitiga = new Segitiga1();
        oSegitiga.setSisi(5,2);
        System.out.println("Luas segitiga = 0.5 x "+oSegitiga.getSisi1()+" x "
                +oSegitiga.getSisi2()+" = "+oSegitiga.getLuas());

        Lingkaran1 oLing = new Lingkaran1();
        oLing.setSisi(10);
        System.out.println("Luas Lingkaran = "+oLing.getLuas());

    }
}
