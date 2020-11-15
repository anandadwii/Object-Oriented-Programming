package com.pbo;

abstract class Hewan {
    //abstract method
    public abstract void suaraHewan();

    //regular method
    public void tidur(){
        System.out.println("Zzzzzz...");
    }
}

//subclass (turunan dari class HEwan)
class Ayam extends Hewan{
    public void suaraHewan(){
        System.out.println("kukuruyuukkk");
    }
}

class Kucing extends Hewan{
    public void suaraHewan(){
        //body dari abstact method
        System.out.println("miawww augggggg");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ayam ayamku = new Ayam();//object ayam
        Kucing kucingku = new Kucing();
        ayamku.suaraHewan();
        ayamku.tidur();

        kucingku.suaraHewan();
        kucingku.tidur();
    }
}
