

public class Method {


    public static void main(String[] args) {

        int y,x;
        x=10;
        y=hitung(x);

        System.out.println("x = "+x+", y = "+y);

        x=20;
        y=hitung(x);

        System.out.println("x = "+x+", y = "+y);

        x=40;
        y=hitung(x);

        System.out.println("x = "+x+", y = "+y);

    }


   static int hitung(int input){
        int hasil;
        hasil=(input+2)*2;

        return hasil;
    }
}

