
//aplikasi pembuat template komunikasi ke dosen via pesan
package com.pbo;

import java.util.Scanner;


public class TugasMahasiswaRevisi {


    public static String nama(Scanner scanner)
    {
        System.out.println("Aplikasi Template maker komunikasi ke Dosen\n");
        System.out.println("silakan lengkapi informasi yang dibutuhkan\n\n");
        System.out.println("Nama : ");

        String nama = scanner.nextLine();

        return nama;
    }

    public static String nim(Scanner scanner)
    {
        System.out.println("NIM : ");
        String nim = scanner.nextLine();

        return nim;
    }
    public static String jurusan(Scanner scanner)
    {
        System.out.println("Jurusan : ");
        String jur = scanner.nextLine();

        return jur;
    }
    public static int angkatan(Scanner scanner){
        System.out.println("Angkatan : ");
        int angkatan = scanner.nextInt();

        return angkatan;
    }

    public static String salam(Scanner scanner){
        System.out.println("Salam untuk pembukan dan penutup : ");
        String salam = scanner.nextLine();

        return salam;
    }
    public static String dosen(Scanner scanner){
        System.out.println("Nama Dosen :(Pak/Bu) ");
        String dosen = scanner.nextLine();

        return dosen;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nama = nama(scanner);
        String nim = nim(scanner);
        String jurusan = jurusan(scanner);
        String salam =salam(scanner);
        String dosen = dosen(scanner);
        int angkatan = angkatan(scanner);
        System.out.println("Selamat "+salam+", "+dosen+".");
        System.out.println("Nama Saya " + nama+ " NIM "+ nim+" jurusan "+jurusan+" Angkatan "+angkatan+".");
        System.out.println("Maaf mengganggu waktunya");
        System.out.println("//masukkan pesan yang ingin disampaikan//");
        System.out.println("Terima kasih, Selamat "+salam+".");

    }





}

