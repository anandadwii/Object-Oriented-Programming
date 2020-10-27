package com.pbo;

public class Kendaraan {
    private String merek;

    public Kendaraan(String merek){
        this.merek = merek;
    }

    protected String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }
}


