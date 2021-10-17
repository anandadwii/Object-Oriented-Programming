package com.pboreg.library;

import java.time.LocalDate;

public class Pasien {
    private String idPasien;
    private String unamePasien;
    private String passPasien;
    private String namaPasien;
    private String umurPasien;
    private String alamatPasien;
    private String tlpPasien;
    private LocalDate tglPasien;

    // Constructor
    public  Pasien(String idPasien,
                   String unamePasien,
                   String passPasien,
                   String namaPasien,
                   String umurPasien,
                   String alamatPasien,
                   LocalDate tglPasien,
                   String tlpPasien) {
        this.idPasien = idPasien;
        this.unamePasien = unamePasien;
        this.passPasien = passPasien;
        this.namaPasien = namaPasien;
        this.umurPasien = umurPasien;
        this.alamatPasien = alamatPasien;
        this.tglPasien = tglPasien;
        this.tlpPasien = tlpPasien;
    }

    // Setter dan Getter
    public String getIdPasien() {
        return idPasien;
    }

    public void setIdPasien(String idPasien) {
        this.idPasien = idPasien;
    }

    public String getUnamePasien() {
        return unamePasien;
    }

    public void setUnamePasien(String unamePasien) {
        this.unamePasien = unamePasien;
    }

    public String getPassPasien() {
        return passPasien;
    }

    public void setPassPasien(String passPasien) {
        this.passPasien = passPasien;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public String getUmurPasien() {
        return umurPasien;
    }

    public void setUmurPasien(String umurPasien) {
        this.umurPasien = umurPasien;
    }

    public String getAlamatPasien() {
        return alamatPasien;
    }

    public void setAlamatPasien(String alamatPasien) {
        this.alamatPasien = alamatPasien;
    }

    public String getTlpPasien() {
        return tlpPasien;
    }

    public void setTlpPasien(String tlpPasien) {
        this.tlpPasien = tlpPasien;
    }

    public LocalDate getTglPasien() {
        return tglPasien;
    }

    public void setTglPasien(LocalDate tglPasien) {
        this.tglPasien = tglPasien;
    }
}
