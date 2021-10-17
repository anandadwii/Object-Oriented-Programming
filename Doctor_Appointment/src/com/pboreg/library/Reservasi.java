package com.pboreg.library;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class Reservasi {
    private String reservasiUrutanList;
    private String reservasiDokterList;
    private String reservasiHariList;
    private String reservasiWaktuList;
    private String reservasiUnameList;

    public Reservasi(String reservasiUrutanList, String reservasiDokterList, String reservasiHariList, String reservasiWaktuList, String reservasiUnameList) {
        this.reservasiUrutanList = reservasiUrutanList;
        this.reservasiDokterList = reservasiDokterList;
        this.reservasiHariList = reservasiHariList;
        this.reservasiWaktuList = reservasiWaktuList;
        this.reservasiUnameList = reservasiUnameList;
    }

    public String getReservasiUrutanList() {
        return reservasiUrutanList;
    }

    public void setReservasiUrutanList(String reservasiUrutanList) {
        this.reservasiUrutanList = reservasiUrutanList;
    }

    public String getReservasiDokterList() {
        return reservasiDokterList;
    }

    public void setReservasiDokterList(String reservasiDokterList) {
        this.reservasiDokterList = reservasiDokterList;
    }

    public String getReservasiHariList() {
        return reservasiHariList;
    }

    public void setReservasiHariList(String reservasiHariList) {
        this.reservasiHariList = reservasiHariList;
    }

    public String getReservasiWaktuList() {
        return reservasiWaktuList;
    }

    public void setReservasiWaktuList(String reservasiWaktuList) {
        this.reservasiWaktuList = reservasiWaktuList;
    }

    public String getReservasiUnameList() {
        return reservasiUnameList;
    }

    public void setReservasiUnameList(String reservasiUnameList) {
        this.reservasiUnameList = reservasiUnameList;
    }
}
