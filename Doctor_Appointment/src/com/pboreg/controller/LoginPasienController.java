package com.pboreg.controller;

import com.pboreg.library.credStore;
import com.pboreg.library.PasienQueries;
import com.pboreg.library.Koneksi;
import com.pboreg.library.ScreenController;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginPasienController extends credStore {

    public TextField daftarUsername;
    public TextField daftarNama;
    public TextField daftarUmur;
    public TextField daftarTelepon;
    public TextField daftarAlamat;
    public Button buttonDaftar;
    public DatePicker daftarTanggalLahir;
    public PasswordField daftarPassword;
    public Button buttonDirectDaftar;
    public AnchorPane apLogin;
    public Button buttonDirectLogin;
    public AnchorPane apDaftar;
    public TextField fieldLoginUsername;
    public PasswordField fieldLoginPassword;
    public Label labelSalah;
    public Button buttonLoginPasien;

    Koneksi koneksi = new Koneksi();
    ScreenController sc = new ScreenController();
    PasienQueries pQuery = new PasienQueries();

    private void displayAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void buttonDaftarClick(ActionEvent actionEvent) {
        int result = pQuery.addPasien(daftarUsername.getText(), daftarPassword.getText(), daftarNama.getText(), daftarUmur.getText(), daftarTanggalLahir.getValue(), daftarTelepon.getText(), daftarAlamat.getText());
        if (result == 1) {
            displayAlert(Alert.AlertType.INFORMATION, "Pendaftaran Berhasil", "Pendaftaran anda berhasil!");
        } else {
            displayAlert(Alert.AlertType.ERROR, "Pendaftaran Gagal", "Pendaftaran anda gagal!");
        }
    }

    public void buttonLoginClick(ActionEvent actionEvent) {
        // Debug
        System.out.println("UNAME = " + fieldLoginUsername.getText());
        System.out.println("PASS = " + fieldLoginPassword.getText());
        if(!fieldLoginUsername.getText().isEmpty() && !fieldLoginPassword.getText().isEmpty()){
            validateLogin();
        }else{
            labelSalah.setText("Masukkan Username dan Password!");
        }
    }

    public void validateLogin() {
        //count 1 buat return number of record yang dipilih sama query, username dan password 1 kolom 300 jadi cuma count(1)
        String verifyLogin = "SELECT count(1) FROM pasien WHERE Username = '"+fieldLoginUsername.getText()+"' AND Password = '"+fieldLoginPassword.getText()+"'";
        try {
            ResultSet verifyStatus = koneksi.getData(verifyLogin);

            while(verifyStatus.next()) {
                //Debug
                System.out.println("Verify = " + verifyStatus.getInt(1));
                if (verifyStatus.getInt(1) == 1){
                    setUnamePasien(fieldLoginUsername.getText());
                    System.out.println(unamePasien);
                    labelSalah.setText("Login berhasil!");
                    System.out.println(fieldLoginUsername.getText()+" telah login ke dalam sistem");
                    sc.switchScreen("Booking", "Reservasi Dokter", apLogin);
                }else {
                    labelSalah.setText("Salah!");
                }
            }
        } catch (SQLException e){
            e.getMessage();
        }
    }

    public void logoOnClick(MouseEvent mouseEvent) {
        sc.switchScreen("LoginSuster", "Login Suster", apLogin);
    }

    public void directDaftarOnClick(MouseEvent mouseEvent) {
        sc.switchScreen("DaftarPasien", "Daftar Pasien", apLogin);
    }

    public void directLoginOnClick(MouseEvent mouseEvent) {
        sc.switchScreen("LoginPasien", "Login Pasien", apDaftar);
    }
}
