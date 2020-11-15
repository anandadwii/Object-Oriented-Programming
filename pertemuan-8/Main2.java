package com.pbo;
//interface
interface mamalia{

    public void tempatTinggal();
    public void tidur();

}
interface MakhlukHidup {
    public void bernapas();
    public void bernama();
}
class Hewan1 implements mamalia, MakhlukHidup{
    @Override
    public void tempatTinggal() {
        System.out.println("tempat tinggal : air");
    }

    @Override
    public void tidur() {
        System.out.println("ZzzZzz");
    }

    @Override
    public void bernapas() {
        System.out.println("bernapas dengan paru2");
    }

    @Override
    public void bernama() {
        System.out.println("Paus");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Hewan1 paus = new Hewan1();
        paus.tempatTinggal();
        paus.tidur();
        paus.bernapas();
        paus.bernama();
    }
}
