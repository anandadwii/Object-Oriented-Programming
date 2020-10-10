
import java.util.*;

public class LatihanFunsgiHitungGambar {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("panjang = ");
        int inputPanjang =userInput.nextInt();

        System.out.print("\nlebar = ");
        int inputLebar = userInput.nextInt();

        gambar(inputPanjang,inputLebar);
        tampilkanKelilingDanLuas(inputPanjang, inputLebar);

    }

    private static void tampilkanKelilingDanLuas(int panjang, int lebar){
        System.out.println("\nluas = "+luas(panjang,lebar));
        System.out.println("\nkeliling = "+keliling(panjang, lebar));
    }
    private static int keliling(int panjang, int lebar){
        int hasil = (panjang+lebar)*2;
        System.out.println("menghitung keliling dengan panjang = "+panjang+", lebar ="+lebar);
        return hasil;
    }

    private static int luas (int panjang, int lebar){
        int hasil = panjang*lebar;
        System.out.println("menghitung luas dengan panjang ="+panjang+", lebar = "+lebar);
        return hasil;

    }

    public static void  gambar(int panjang, int lebar){
        for(int i=0;i<lebar;i++){
            for (int j=0;j<panjang;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

}
