public class returnValue {
    static int myMethod(int x){
        return 5 + x;
    }

    static int myMethod1(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        int nilai=myMethod(10);
        int z= myMethod1(5,3);


        System.out.println(myMethod(3));

        System.out.println(nilai);

        System.out.println(myMethod1(5, 3));
        System.out.println(z);
    }
}
