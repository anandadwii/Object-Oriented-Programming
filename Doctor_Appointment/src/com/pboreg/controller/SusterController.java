package com.pboreg.controller;

import com.pboreg.library.Koneksi;
import com.pboreg.library.Pasien;
import com.pboreg.library.PasienQueries;
import com.pboreg.library.Reservasi;
import com.pboreg.library.ReservasiQueries;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import java.sql.ResultSet;
import java.time.LocalDate;

public class SusterController {
    public AnchorPane apSusterInterface;

    public TextField dialogIdPasien;
    public TextField dialogUname;
    public TextField dialogPass;
    public TextField dialogNama;
    public TextField dialogUmur;
    public DatePicker dialogTgl;
    public TextField dialogAlamat;
    public TextField dialogTlp;


    public TextField dialogUrutanReservasi;
    public TextField dialogDokterReservasi;
    public TextField dialogTglReservasi;
    public TextField dialogWaktuReservasi;
    public TextField dialogUnameReservasi;

    @FXML
    private TabPane tabPaneSuster;

    @FXML
    private Tab tabPasien;

    @FXML
    private Tab tabReservasi;

    @FXML
    private TableView<Reservasi> tableViewReservasi;

    @FXML
    private TableColumn<Reservasi, String> reservasiUrutanList;

    @FXML
    private TableColumn<Reservasi, String> reservasiDokterList;

    @FXML
    private TableColumn<Reservasi, String> reservasiHariList;

    @FXML
    private TableColumn<Reservasi, String> reservasiWaktuList;

    @FXML
    private TableColumn<Reservasi, String> reservasiUnameList;

    @FXML
    private TableView<Pasien> tableViewPasien;

    @FXML
    private TableColumn<Pasien, String> idPasien;

    @FXML
    private TableColumn<Pasien, String> unamePasien;

    @FXML
    private TableColumn<Pasien, String> passPasien;

    @FXML
    private TableColumn<Pasien, String> namaPasien;

    @FXML
    private TableColumn<Pasien, String> umurPasien;

    @FXML
    private TableColumn<Pasien, String> alamatPasien;

    @FXML
    private TableColumn<Pasien, LocalDate> tglPasien;

    @FXML
    private TableColumn<Pasien, String> tlpPasien;

    Koneksi koneksi = new Koneksi();
    PasienQueries pQuery = new PasienQueries();
    ReservasiQueries rQuery = new ReservasiQueries();

    public SusterController() {
    }

    @FXML
    public void initialize() {
        tampilTablePasien();
        tampilTableReservasi();

        tableViewPasien.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) -> displayPasien(newValue));
        tableViewReservasi.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) -> displayReservasi(newValue));
    }

    public void displayPasien(Pasien pasien) {
        if (pasien != null) {
            dialogIdPasien.setText(String.valueOf(pasien.getIdPasien()));
            dialogUname.setText(String.valueOf(pasien.getUnamePasien()));
            dialogPass.setText(String.valueOf(pasien.getPassPasien()));
            dialogNama.setText(String.valueOf(pasien.getNamaPasien()));
            dialogUmur.setText(String.valueOf(pasien.getUmurPasien()));
            dialogTgl.setValue(pasien.getTglPasien());
            dialogAlamat.setText(String.valueOf(pasien.getAlamatPasien()));
            dialogTlp.setText(String.valueOf(pasien.getTlpPasien()));
        } else {
            dialogIdPasien.clear();
            dialogUname.clear();
            dialogPass.clear();
            dialogNama.clear();
            dialogUmur.clear();
            dialogAlamat.clear();
            dialogTlp.clear();
        }
    }

    public void displayReservasi(Reservasi reservasi) {
        if (reservasi != null) {
            dialogUrutanReservasi.setText(String.valueOf(reservasi.getReservasiUrutanList()));
            dialogDokterReservasi.setText(String.valueOf(reservasi.getReservasiDokterList()));
            dialogTglReservasi.setText(String.valueOf(reservasi.getReservasiHariList()));
            dialogWaktuReservasi.setText(String.valueOf(reservasi.getReservasiWaktuList()));
            dialogUnameReservasi.setText(String.valueOf(reservasi.getReservasiUnameList()));
        } else {
            dialogUrutanReservasi.clear();
            dialogDokterReservasi.clear();
            dialogTglReservasi.clear();
            dialogWaktuReservasi.clear();
            dialogUnameReservasi.clear();
        }
    }

    private void displayAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public ObservableList<Pasien> getTablePasien() {
        ObservableList<Pasien> dataPasien = FXCollections.observableArrayList();

        try {
            String query = "SELECT * FROM pasien";
            ResultSet rs = koneksi.getData(query);
            Pasien pasien;

            while(rs.next()) {
                pasien = new Pasien(rs.getString("id"), rs.getString("Username"), rs.getString("Password"), rs.getString("Nama"), rs.getString("Umur"), rs.getString("Alamat"), rs.getDate("Tanggal_lahir").toLocalDate(), rs.getString("Telepon"));
                dataPasien.add(pasien);
            }
        } catch (Exception err) {
            err.printStackTrace();
        }
        return dataPasien;
    }

    public void tampilTablePasien() {
        try {
            ObservableList<Pasien> tabelPasien = getTablePasien();

            idPasien.setCellValueFactory(new PropertyValueFactory<>("idPasien"));
            unamePasien.setCellValueFactory(new PropertyValueFactory<>("unamePasien"));
            passPasien.setCellValueFactory(new PropertyValueFactory<>("passPasien"));
            namaPasien.setCellValueFactory(new PropertyValueFactory<>("namaPasien"));
            umurPasien.setCellValueFactory(new PropertyValueFactory<>("umurPasien"));
            alamatPasien.setCellValueFactory(new PropertyValueFactory<>("alamatPasien"));
            tglPasien.setCellValueFactory(new PropertyValueFactory<>("tglPasien"));
            tlpPasien.setCellValueFactory(new PropertyValueFactory<>("tlpPasien"));

            tableViewPasien.setItems(tabelPasien);
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    public ObservableList<Reservasi> getTableReservasi() {
        ObservableList<Reservasi> dataReservasi = FXCollections.observableArrayList();

        try {
            String query = "SELECT * FROM reservasi";
            ResultSet rs = koneksi.getData(query);
            Reservasi reservasi;

            while(rs.next()) {
                reservasi = new Reservasi(rs.getString("Urutan"),
                        rs.getString("Dokter"),
                        rs.getString("Hari"),
                        rs.getString("Waktu"),
                        rs.getString("UsernamePasien"));
                dataReservasi.add(reservasi);
            }
        } catch (Exception err) {
            err.printStackTrace();
        }
        return dataReservasi;
    }

    public void tampilTableReservasi() {
        try {
            ObservableList<Reservasi> tabelReservasi = getTableReservasi();

            reservasiUrutanList.setCellValueFactory(new PropertyValueFactory<>("reservasiUrutanList"));
            reservasiDokterList.setCellValueFactory(new PropertyValueFactory<>("reservasiDokterList"));
            reservasiHariList.setCellValueFactory(new PropertyValueFactory<>("reservasiHariList"));
            reservasiWaktuList.setCellValueFactory(new PropertyValueFactory<>("reservasiWaktuList"));
            reservasiUnameList.setCellValueFactory(new PropertyValueFactory<>("reservasiUnameList"));

            tableViewReservasi.setItems(tabelReservasi);
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
    
    @FXML
    private void onClickTambah(ActionEvent actionEvent) {
        if (tabPaneSuster.getSelectionModel().getSelectedIndex() == 0) {
            int result = pQuery.addPasien(String.valueOf(dialogUname.getText()),
                    String.valueOf(dialogPass.getText()),
                    String.valueOf(dialogNama.getText()),
                    String.valueOf(dialogUmur.getText()),
                    LocalDate.from(dialogTgl.getValue()),
                    String.valueOf(dialogAlamat.getText()),
                    String.valueOf(dialogTlp.getText()));
            if (result == 1) {
                displayAlert(Alert.AlertType.INFORMATION, "Tambah Pasien", "Tambah pasien berhasil!");
                tampilTablePasien();
            } else {
                displayAlert(Alert.AlertType.ERROR, "Tambah Pasien", "Tambah pasien gagal!");
            }
        } else if (tabPaneSuster.getSelectionModel().getSelectedIndex() == 1 ) {
            int result = rQuery.addReservasi(String.valueOf(dialogDokterReservasi.getText()),
                    String.valueOf(dialogTglReservasi.getText()),
                    String.valueOf(dialogWaktuReservasi.getText()),
                    String.valueOf(dialogUnameReservasi.getText()));
            if (result == 1) {
                displayAlert(Alert.AlertType.INFORMATION, "Tambah Reservasi", "Tambah reservasi berhasil!");
                tampilTableReservasi();
            } else {
                displayAlert(Alert.AlertType.ERROR, "Tambah Reservasi", "Tambah reservasi gagal!");
            }
        }
    }

    @FXML
    private void onClickEdit(ActionEvent actionEvent) {
        if (tabPaneSuster.getSelectionModel().getSelectedIndex() == 0) {
            int result = pQuery.upPasien(String.valueOf(dialogUname.getText()),
                    String.valueOf(dialogPass.getText()),
                    String.valueOf(dialogNama.getText()),
                    String.valueOf(dialogUmur.getText()),
                    LocalDate.from(dialogTgl.getValue()),
                    String.valueOf(dialogAlamat.getText()),
                    String.valueOf(dialogTlp.getText()),
                    String.valueOf((dialogIdPasien.getText())));
            if (result == 1) {
                displayAlert(Alert.AlertType.INFORMATION, "Edit Pasien", "Edit pasien berhasil!");
                tampilTablePasien();
            } else {
                displayAlert(Alert.AlertType.ERROR, "Edit Pasien", "Edit pasien gagal!");
            }
        } else if (tabPaneSuster.getSelectionModel().getSelectedIndex() == 1 ) {
            int result = rQuery.upReservasi(String.valueOf(dialogDokterReservasi.getText()),
                    String.valueOf(dialogTglReservasi.getText()),
                    String.valueOf(dialogWaktuReservasi.getText()),
                    String.valueOf(dialogUnameReservasi.getText()),
                    String.valueOf(dialogUrutanReservasi.getText()));
            if (result == 1) {
                displayAlert(Alert.AlertType.INFORMATION, "Edit Reservasi", "Edit reservasi berhasil!");
                tampilTableReservasi();
            } else {
                displayAlert(Alert.AlertType.ERROR, "Edit Reservasi", "Edit reservasi gagal!");
            }
        }
    }

    @FXML
    private void onClickHapus(ActionEvent actionEvent) {
        if (tabPaneSuster.getSelectionModel().getSelectedIndex() == 0) {
            int result = pQuery.delPasien(dialogIdPasien.getText());
            if (result == 1) {
                displayAlert(Alert.AlertType.INFORMATION, "Hapus Pasien", "Hapus pasien berhasil!");
                tampilTablePasien();
            } else {
                displayAlert(Alert.AlertType.ERROR, "Hapus Pasien", "Hapus pasien gagal!");
            }
        } else if (tabPaneSuster.getSelectionModel().getSelectedIndex() == 1 ) {
            int result = rQuery.delReservasi(dialogUrutanReservasi.getText());
            if (result == 1) {
                displayAlert(Alert.AlertType.INFORMATION, "Hapus Reservasi", "Hapus reservasi berhasil!");
                tampilTableReservasi();
            } else {
                displayAlert(Alert.AlertType.ERROR, "Hapus Reservasi", "Hapus reservasi gagal!");
            }
        }
    }

    public void onClickRefresh(ActionEvent actionEvent) {
        tampilTablePasien();
        tampilTableReservasi();
    }
}
