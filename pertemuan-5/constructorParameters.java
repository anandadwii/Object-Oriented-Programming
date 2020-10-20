package com.pbo;


public class constructorParameters {

        int modelYear;
        String modelName;
        public constructorParameters(int year, String name){
            modelYear = year;
            modelName = name;
        }

    public static void main(String[] args) {
        constructorParameters myCar = new constructorParameters(1969,"mustang");
        System.out.println(myCar.modelYear+" "+myCar.modelName);

    }
}
