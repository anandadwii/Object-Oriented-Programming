public class overloadingLat {
    static int kalkulasi (int x, int y){
        return x + y;
    }
    static double kalkulasi (double x, double y){
        return x-y;
    }
    static String kalkulasi(String x, String y){
        String hasil = x + " "+y;
        return hasil;
    }
    static String kalkulasi (String x, int y){
        String hasil = "nama "+x+", umur "+y+" tahun";
        return hasil;
    }

    public static void main(String[] args) {
        String nilai3=kalkulasi("hendi","Hermawan");
        int nilai1 = kalkulasi(8,5);
        double nilai2 = kalkulasi(4.3,6.26);
        String nilai4 =kalkulasi("andi", 17);
        System.out.println("nilai int = "+nilai1);
        System.out.println("nilai double = "+nilai2);
        System.out.println("nilai string = "+nilai3);
        System.out.println("keterangan = "+nilai4);
    }
}
