package com.pboreg.library;

public class Dokter {
    private String namaDokter;
    private String departemenDokter;

    // Constructor
    public Dokter(String namaDokter, String departemenDokter) {
        this.namaDokter = namaDokter;
        this.departemenDokter = departemenDokter;
    }

    // Setter dan Getter
    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public String getDepartemenDokter() {
        return departemenDokter;
    }

    public void setDepartemenDokter(String departemenDokter) {
        this.departemenDokter = departemenDokter;
    }
}