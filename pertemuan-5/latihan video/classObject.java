package com.pbo;



//class sebagai template
class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    String Fakultas;
    String univ;
    double ipk;
    int umur;
    int angkatan;
}

public class classObject {
    public static void main(String[] args) {

        //cara instansiasi, membuat objek
        Mahasiswa Mahasiswa1 = new Mahasiswa();
        Mahasiswa1.nama = "Lukman";
        Mahasiswa1.nim = "2015069001";
        Mahasiswa1.jurusan = "Teknik Mendengkur";
        Mahasiswa1.Fakultas = "Fakultas Tidur";
        Mahasiswa1.angkatan = 2015;
        Mahasiswa1.univ = "Universitas Rebahan";
        Mahasiswa1.ipk = 3.69;
        Mahasiswa1.umur = 24;

        System.out.println(Mahasiswa1.nama);
        System.out.println(Mahasiswa1.nim);
        System.out.println(Mahasiswa1.jurusan);
        System.out.println(Mahasiswa1.Fakultas);
        System.out.println(Mahasiswa1.angkatan);
        System.out.println(Mahasiswa1.univ);
        System.out.println(Mahasiswa1.ipk);
        System.out.println(Mahasiswa1.umur);

        //bikin objek baru
        Mahasiswa Mahasiswa2 = new Mahasiswa();

        Mahasiswa2.nama = "Budi";
        Mahasiswa2.nim = "2020069001";
        Mahasiswa2.jurusan = "Teknik Mendengkur";
        Mahasiswa2.Fakultas = "Fakultas Tidur";
        Mahasiswa2.univ = "Universitas Rebahan";
        Mahasiswa2.ipk = 2.69;
        Mahasiswa2.umur = 17;

        System.out.println(Mahasiswa1.nama);
        System.out.println(Mahasiswa1.nim);
        System.out.println(Mahasiswa1.jurusan);
        System.out.println(Mahasiswa1.Fakultas);
        System.out.println(Mahasiswa1.angkatan);
        System.out.println(Mahasiswa1.univ);
        System.out.println(Mahasiswa1.ipk);
        System.out.println(Mahasiswa1.umur);

    }
}
