
import java.util.*;
public class FungsiRekursif {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukkan nilai = ");
        int nilai = inputUser.nextInt();
        System.out.println("anda memasukkan nilai "+nilai);

        printNilai(nilai);
        int jumlah = JumlahNilai(nilai);
        System.out.println("jumlah ="+jumlah);


        int Faktorial = Faktorial(nilai);
        System.out.println("hasil faktorial ="+Faktorial);



    }

    //fungsi rekursif
    private static int Faktorial(int parameter){
        System.out.println("parameter ="+parameter);
        if(parameter==1){
            return parameter;
        }
        return parameter * Faktorial(parameter-1);
    }

    private static int JumlahNilai(int parameter){
        System.out.println("parameter ="+parameter);
        if(parameter==1){
            return parameter;
        }
        return parameter + JumlahNilai(parameter-1);
    }
    private static void printNilai(int parameter){
        System.out.println("nilai = "+parameter);

        if (parameter==1){
            return;
        }
        parameter--;
        printNilai(parameter);
    }
}
