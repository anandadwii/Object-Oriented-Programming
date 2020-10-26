//aplikasi penghitung gaji
package com.pbo;
import java.util.Scanner;
class Orang{

    //inisialisasi variabel untuk class orang
    private String _nama;

    //constructor untuk class orang
    public Orang(){
        this._nama="";
    }

    //get dan set variable di class Orang
    public String getNama(){
        return this._nama;
    }
    public void setNama(String newName){
        this._nama=newName;
    }
}
class Pegawai extends Orang{

    //inisialisasi variabel untuk class pegawai
    private String NIP;
    private int golongan;
    private int jamKerja;

    //constructor untuk class pegawai extend class Orang
    Pegawai(){
        this.NIP="";
        this.golongan=0;
        this.jamKerja=0;
    }
    //set dan get variabel class pegawai
    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public int getJamKerja() {
        return jamKerja;
    }
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    //kode untuk menghitung gaji
    public void gaji(){
        //inisialisasi variabel di method gaji
        double gaji;
        int gajiPokok=0;
        int tunjangan=0;
        int gajiLembur;
        int lembur=0;
        //pengondisian golongan
        if(golongan==1){
            gajiPokok = 1486500;
            tunjangan = 250000;
        }
        else if(golongan==2){
            gajiPokok = 1926000;
            tunjangan = 300000;
        }
        else if(golongan==3){
            gajiPokok=2456700;
            tunjangan=350000;
        }
        else if(golongan==4) {
            gajiPokok = 2899500;
            tunjangan = 400000;
        }
        else{
            System.out.println("input yang anda masukkan salah");
        }
        //akumulasi gaji berdasarkan golongan dan jam lembur
        System.out.println("Gaji Pokok = Rp." + gajiPokok);
        System.out.println("Tunjangan = Rp." + tunjangan);
        System.out.println("======================================");
        gaji = gajiPokok + tunjangan;
        System.out.println("Gaji sebelum pajak 0.5% = Rp." + gaji);
        gaji = gaji * 0.95;
        System.out.println("gaji setelah pajak 0.5% = Rp." + gaji);
        System.out.println("======================================");

        //perhitungan jam lembur
        if (jamKerja >173){
            lembur = jamKerja - 173;
        }

        System.out.println("jam lembur = " + lembur + " jam");
        gajiLembur = lembur * 20000;
        System.out.println("Gaji lembur = Rp." + gajiLembur);
        gaji = gaji + gajiLembur;
        System.out.println("\nGaji Total = Rp." + gaji);
    }
}
//driver  main program
public class Main {

    public static void main(String[] args) {
        // write your code here

        Pegawai peg = new Pegawai();
        Scanner input = new Scanner(System.in);

        //inisialisasi
        String nama;
        String NIP;
        int golongan;
        int jamKerja;

        //kode untuk input data
        System.out.print("masukkan nama : ");
        nama = input.nextLine();
        peg.setNama(nama);
        System.out.print("masukkan NIP : ");
        NIP = input.next();
        peg.setNIP(NIP);
        System.out.print("masukkan Golongan Pekerja : ");
        golongan = input.nextInt();
        peg.setGolongan(golongan);
        System.out.print("jam kerja sebulan : ");
        jamKerja = input.nextInt();
        peg.setJamKerja(jamKerja);

        //kode untuk output
        System.out.println("==========================================");
        System.out.println("NIP : "+peg.getNIP());
        System.out.println("Golongan Pekerja : "+peg.getGolongan());
        System.out.println("Nama : "+peg.getNama());
        System.out.println("Jam Kerja sebulan : "+peg.getJamKerja());
        System.out.println("==========================================");
        peg.gaji();
        System.out.println("==========================================");

    }
}
