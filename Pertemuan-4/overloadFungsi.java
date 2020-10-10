
import java.util.*;

public class overloadFungsi {
    public static void main(String[] args) {

        int hasilInteger;
        hasilInteger=tambah(4,5);
        printAngka(hasilInteger);

        hasilInteger=tambah(11,12,13);
        printAngka(hasilInteger);


        float hasilFloat;
        hasilFloat=tambah(4.0f,4.1f);
        printAngka(hasilFloat);

        hasilFloat=tambah(4,4.8f);
        printAngka(hasilFloat);

        hasilFloat=tambah(4.9f,4);
        printAngka(hasilFloat);

        printAngka(10);
        printAngka(10.5f);
        printAngka(10.7d);

    }
    private static float tambah(float angkaFloat1, int angkaInt2){
        return angkaFloat1+angkaInt2;
    }
    private static float tambah(int angkaInt1, float angkaFloat2){
        return angkaInt1+angkaFloat2;
    }
    private static float tambah(float angkaFloat1, float angkaFloat2){
        return angkaFloat1+angkaFloat2;
    }
    private static int tambah(int angkaInt1, int angkaInt2, int angkaInt3){
        return angkaInt1 + angkaInt2 + angkaInt3;
    }

    private static int tambah(int angkaInt1, int angkaInt2){
        return angkaInt1 + angkaInt2;
    }

    private static void printAngka(int angkaInteger){
        System.out.println("angka ini adalah integer dengan nilai = "+angkaInteger);
    }

    private static void printAngka(float angkaFloat){
        System.out.println("angka ini adalah float dengan nilai = "+angkaFloat);
    }

    private static void printAngka(double angkaDouble){
        System.out.println("angka ini adalah float dengan nilai = "+angkaDouble);
    }
}
