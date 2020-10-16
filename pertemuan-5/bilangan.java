package com.pbo;

public class bilangan {
    private int a= 10;
    private int b=20;
    private int c=30;

    public int tampilkanA(){

        return this.a;
    }

    public int tampilkanB(){

        return this.b;
    }

    public int tampilkanC(){

        return this.c;
    }
    public void inputA(int nilai){
        this.a = nilai;
    }

    public void inputB(int nilai){
        this.b = nilai;
    }
    public void inputC(int nilai){
        this.c = nilai;
    }

    public int tambah(){
        int hasil = this.a + this.b + this.c;
        return hasil;
    }

    public  int kurang(){
        int hasil = this.c -  this.a;
        return hasil;
    }

    public int kali(){
        int hasil = this.a * this.b;
        return hasil;
    }

    public int bagi(){
        int hasil = this.c / this.a;
        return hasil;
    }
}
