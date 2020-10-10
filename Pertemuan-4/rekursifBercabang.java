import java.util.*;
import java.lang.String;

public class rekursifBercabang {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("masukkan nilai n = ");
        int nilai=inputUser.nextInt();
        int nilai_fibonnaci = fibonnaci(5,"atas");
        System.out.println("nilai fibonnaci ke-"+nilai+"adalah "+nilai_fibonnaci);

    }

    public static int fibonnaci(int n, String daun){
        System.out.println("daun "+daun);
        System.out.println("fiblonnaci ke-"+n);
        if(n==1||n==0){
            return n;
        }
        return fibonnaci(n-1,"kiri")+fibonnaci(n-2,"kanan");
    }
}
