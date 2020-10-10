public class MethodVoid {
    public static void main(String[] args) {
        /*maksud dari void adalah hampa
        sehingga kita gausah bikin return
         */

        System.out.println(simple());

        fungsiVoid("apa kek");
        fungsiVoid("test");
        selamatPagi("emak");
        selamatPagi("abah");
    }

    static void selamatPagi(String nama){
        System.out.println("Selamat Pagi, "+nama);
    }
    /* fungsi tanpa kembalian
    * atau tanpa perhitungan, hanya mendelegasikan aksi
    tanpa mengambil nilai*/
     //hanya melakukan kegiatan saja
    //sama kaya fungsi yang dipanggil
    static void fungsiVoid(String input) {
        System.out.println(input);
    }
    /* fungsi atau method dengan pengembalian
    sehingga menggunakan return untuk
    mengembalikan nilainya (10.0f)
     */
    static float simple(){
        return 10.0f;
    }
}
