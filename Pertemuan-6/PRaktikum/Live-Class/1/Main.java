package com.pbo;
import java.util.Scanner;
class Orang{
    private String _nama;
    //private int _umur;
    //private String goldDarah;


    //constructor
    public Orang(){
        this._nama="";
        //this._umur=0;


    }

    //public String getGoldDarah() {
   //     return goldDarah;
    //}

    //public void setGoldDarah(String goldDarah) {
     //   this.goldDarah = goldDarah;
    //}

    //get
    public String getNama(){
        return this._nama;
    }

    //method
    //set
    public void setNama(String newName){
        this._nama=newName;
    }

   // public int getUmur(){
   //     return this._umur;
    //}

    //public void setUmur(int newUmur){
   //     this._umur=newUmur;
    //}

}
class Pegawai extends Orang{
    private String NIP;
    private int golongan;
    private int jamKerja;

    Pegawai(){
        this.NIP="";
        this.golongan=0;
        this.jamKerja=0;
    }

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

    public void gaji(){
        double gaji;
        int gajiPokok;
        int tunjangan;
        int gajiLembur;
        int lembur;
        if(golongan==1){
            gajiPokok = 1486500;
            tunjangan = 250000;
            if (jamKerja <=172){
                System.out.println("Anda tidak mendapatkan uang lembur");
            }

            lembur = jamKerja-173;
            gajiLembur = lembur*20000;
            System.out.println("jam lembur ="+lembur+"jam");
            System.out.println("gaji lembur = "+gajiLembur);

            System.out.println("Gaji Pokok = Rp."+gajiPokok);
            System.out.println("Tunjangan = Rp."+tunjangan);
            gaji=gajiPokok+tunjangan;
            System.out.println("\nGaji sebelum pajak 0.5% dan lembur = Rp."+gaji);
            gaji=gaji*0.95;
            System.out.println("gaji setelah pajak 0.5% = Rp."+gaji);
            gaji=gaji+gajiLembur;
            System.out.println("\nGaji setelah pajak 0.5% dan lembur = Rp."+gaji);

        }
        else if(golongan==2){
            gajiPokok = 1926000;
            tunjangan = 300000;
            if(jamKerja<=172){
                System.out.println("Anda tidak mendapatkan uang lembur");
            }
            lembur = jamKerja-173;
            gajiLembur = lembur*20000;
            System.out.println("jam lembur ="+lembur+"jam");
            System.out.println("gaji lembur = "+gajiLembur);

            System.out.println("Gaji Pokok = Rp."+gajiPokok);
            System.out.println("Tunjangan = Rp."+tunjangan);
            gaji=gajiPokok+tunjangan;
            System.out.println("\nGaji sebelum pajak 0.5% dan lembur = Rp."+gaji);
            gaji=gaji*0.95;
            System.out.println("gaji setelah pajak 0.5% = Rp."+gaji);
            gaji=gaji+gajiLembur;
            System.out.println("\nGaji setelah pajak 0.5% dan lembur = Rp."+gaji);


        }
        else if(golongan==3){
            gajiPokok=2456700;
            tunjangan=350000;
            if(jamKerja<=172){
                System.out.println("Anda tidak mendapatkan uang lembur");
            }
            lembur = jamKerja-173;
            gajiLembur = lembur*20000;
            System.out.println("jam lembur ="+lembur+"jam");
            System.out.println("gaji lembur = "+gajiLembur);

            System.out.println("Gaji Pokok = Rp."+gajiPokok);
            System.out.println("Tunjangan = Rp."+tunjangan);
            gaji=gajiPokok+tunjangan;
            System.out.println("\nGaji sebelum pajak 0.5% dan lembur = Rp."+gaji);
            gaji=gaji*0.95;
            System.out.println("gaji setelah pajak 0.5% = Rp."+gaji);
            gaji=gaji+gajiLembur;
            System.out.println("\nGaji setelah pajak 0.5% dan lembur = Rp."+gaji);
        }
        else if(golongan==4){
            gajiPokok=2899500;
            tunjangan=400000;
            if (jamKerja<=172){
                System.out.println("Anda tidak mendapatkan uang lembur");
            }
            lembur = jamKerja-173;
            gajiLembur = lembur*20000;
            System.out.println("jam lembur ="+lembur+"jam");
            System.out.println("gaji lembur = "+gajiLembur);

            System.out.println("Gaji Pokok = Rp."+gajiPokok);
            System.out.println("Tunjangan = Rp."+tunjangan);
            gaji=gajiPokok+tunjangan;
            System.out.println("\nGaji sebelum pajak 0.5% dan lembur = Rp."+gaji);
            gaji=gaji*0.95;
            System.out.println("gaji setelah pajak 0.5% = Rp."+gaji);
            gaji=gaji+gajiLembur;
            System.out.println("\nGaji setelah pajak 0.5% dan lembur = Rp."+gaji);
        }
        else{
            System.out.println("input yang anda masukkan salah");
        }

    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        //Orang orang1 = new Orang();
        Pegawai peg = new Pegawai();
        Scanner input = new Scanner(System.in);
        String nama;
        //int umur;
        //String goldar;
        String NIP;
        int golongan;
        int jamKerja;
        System.out.print("masukkan nama : ");
        nama = input.nextLine();
        peg.setNama(nama);
        //System.out.print("masukkan golongan darah : ");
        //goldar = input.nextLine();
        //peg.setGoldDarah(goldar);
        System.out.print("masukkan NIP : ");
        NIP = input.next();
        peg.setNIP(NIP);
        System.out.print("masukkan Golongan Pekerja : ");
        golongan = input.nextInt();
        peg.setGolongan(golongan);
        //System.out.print("masukkan umur : ");
        //umur = input.nextInt();
        //peg.setUmur(umur);
        System.out.print("jam kerja sebulan : ");
        jamKerja = input.nextInt();
        peg.setJamKerja(jamKerja);
        System.out.println("==========================================");
        System.out.println("NIP : "+peg.getNIP());
        System.out.println("Golongan Pekerja : "+peg.getGolongan());
        System.out.println("Nama : "+peg.getNama());
        System.out.println("Jam Kerja sebulan : "+peg.getJamKerja());
        //System.out.println("Umur : "+peg.getUmur());
        //System.out.println("Golongan Darah : "+peg.getGoldDarah());
        System.out.println("==========================================");
        peg.gaji();
        System.out.println("==========================================");


    }
}
