package com.pbo;


//without constructor
class polos{
    String dataString;
    int dataInteger;
}

//with constructor
class Perusahaan{
    String jenis;
    String nama;
    int umur;
    double valuta;

    Perusahaan(String inputJenis, String inputNama, int inputUmur, double inputValuta){
        //akan dipanggil saat objek pertama kali dibuat
        jenis = inputJenis;
        nama = inputNama;
        umur = inputUmur;
        valuta = inputValuta;
        System.out.println(jenis);
        System.out.println(nama);
        System.out.println(umur+"Tahun");
        System.out.println("$"+valuta);
    }

    //constructor with parameter


}

public class constructor {
    public static void main(String[] args) {

        Perusahaan perusahaan1 = new Perusahaan("PT","Bahagia",10,900000000);
        Perusahaan perusahaan2 = new Perusahaan("CV","Radika",2,70000000);



        polos objectPolos = new polos();
        objectPolos.dataString = "polos";
        objectPolos.dataInteger = 0;

        System.out.println(objectPolos.dataInteger);
        System.out.println(objectPolos.dataString);
    }
}
