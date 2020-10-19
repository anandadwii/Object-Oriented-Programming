package com.pbo;

public class Classku {
    //atribute
    public int x = 5; //attribut  dapat diakses secara langsung dari luar class
            int y =15; // attribut dapat diakses dari luas class Classku/ masih 1 paket di com.pbo
    private int z =20; //attribut tidak dapat diakes dari luar Classku

    //method untuk mengakses private luar Class
    public int tampilkanZ() {
        return this.z;
    }
}
