
import java.util.*;
public class latihanLoopingSederhana {
    public static void main(String[] args) {
        //program untuk menjumlahkan rentang

        int nilai_awal, nilai_akhir, total;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("masukkan nilai awal = ");
        nilai_awal = inputUser.nextInt();
        System.out.print("masukkan nilai akhir= ");
        nilai_akhir=inputUser.nextInt();
        total=0;
        while(nilai_awal<=nilai_akhir){
            total=total+nilai_awal;
            System.out.println("ditambah "+nilai_awal+" menjadi "+total);
            nilai_awal++;
        }


    }
}
