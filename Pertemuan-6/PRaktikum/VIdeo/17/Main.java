package com.pbo;

        public class Main {
            public static void main(String[] args) {
                // overloading pada constructor
                Player playera = new Player("Udin");
                Player playerb = new Player();
                Player playerc = new Player();
                Player playerd = new Player("Sabal");


                playera.show();
                playerb.show();
                playerc.show();
                playerd.show();


                // overloading methods
                int a = Matematika.tambah(4, 23);
                System.out.println(a);
                double b = Matematika.tambah(18, 0.69);
                System.out.println(b);
            }
        }
