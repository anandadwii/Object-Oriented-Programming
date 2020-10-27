package com.pbo;

public class mobil extends Kendaraan{
    private String model;

    public mobil(String merek, String model) {
        super(merek);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void viewdata(){
        System.out.println("Merek : "+this.getMerek());
        System.out.println("Model : "+getModel());
    }
}
