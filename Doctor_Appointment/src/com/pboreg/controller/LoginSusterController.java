package com.pboreg.controller;

import com.pboreg.library.Koneksi;
import com.pboreg.library.ScreenController;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginSusterController {
    public TextField fieldLoginUsername;
    public PasswordField fieldLoginPassword;
    public Label labelSalah;
    public AnchorPane apLoginSuster;

    Koneksi koneksi = new Koneksi();
    ScreenController sc = new ScreenController();

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
        String verifyLogin = "SELECT count(1) FROM suster WHERE Username = '"+fieldLoginUsername.getText()+"' AND Password = '"+fieldLoginPassword.getText()+"'";
        try {
            ResultSet verifyStatus = koneksi.getData(verifyLogin);

            while(verifyStatus.next()) {
                //Debug
                System.out.println("Verify = " + verifyStatus.getInt(1));
                if (verifyStatus.getInt(1) == 1){
                    labelSalah.setText("Login berhasil!");
                    System.out.println(fieldLoginUsername.getText()+" telah login ke dalam sistem");
                    sc.switchScreen("SusterInterface", "Pangkalan Data Suster", apLoginSuster);
                }else {
                    labelSalah.setText("Salah!");
                }
            }

        } catch (SQLException e){
            e.getMessage();
        }
    }

    public void buttonKembaliClick(ActionEvent actionEvent) {
       sc.switchScreen("LoginPasien", "Login Pasien", apLoginSuster);
    }
}
