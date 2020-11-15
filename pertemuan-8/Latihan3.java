package com.pbo;



abstract class HitungLuas2 {
    protected double sisi1;
    protected double sisi2;
    public HitungLuas2(){
        this.sisi1 = 0;
        this.sisi2 = 0;
    }
    public HitungLuas2(double sisi1) {
        this.sisi1 = sisi1;
    }
    public HitungLuas2(double sisi1, double sisi2) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }
    public abstract double getLuas();

    public double getS1() {
        return sisi1;
    }

    public double getS2() {
        return sisi2;
    }
}
class Segitiga3 extends HitungLuas2{
    public Segitiga3(double s1, double s2){
        super(s1,s2);
    }
    public double getLuas() {
        double luas = 0.5 * this.sisi1 * this.sisi2;
        return luas;
    }
}
class Lingkaran3 extends HitungLuas2{
    public Lingkaran3(double s1){
        super(s1);
    }
    public double getLuas(){
        double r = this.sisi1/2;
        double luas = 3.14 * r * r;
        return luas;
    }
}
public class Latihan3 {
    public static void main(String[] args) {
        Segitiga3 oSegi = new Segitiga3(5,2);
        System.out.println("Luas Segitiga = 0.5 x " +
                oSegi.getS1() + " x " +
                oSegi.getS2() + " = " + oSegi.getLuas());

        Lingkaran3 oLingk = new Lingkaran3(10);
        System.out.println("Luas Lingkaran = " + oLingk.getLuas());
    }
}
