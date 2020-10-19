package com.pbo;

class mahasiswa{

    //data member
    String nama;
    String NIM;

    //constructor
    mahasiswa(String nama, String NIM){
        this.nama=nama;
        this.NIM=NIM;
    }

    //method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : "+this.nama);
        System.out.println("Nim : "+this.NIM);
    }
    //setter
    void setNama(String nama){
        this.nama = nama;

    }
    //getter
    String getNama(){
        return this.nama;
    }

    String getNIM(){
        return this.NIM;
    }

    //method dengan reurn dan paramenter
    String sayHi(String halo){
        return halo +" juga, nama saya otong"+this.nama;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        mahasiswa mahasiswa1 = new mahasiswa("Dodi","2019071000");
        System.out.println(mahasiswa1.nama);
        mahasiswa1.show();
        mahasiswa1.setNama("pepet");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("ganteng");
        System.out.println(data);
    }
}
