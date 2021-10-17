package com.pboreg.controller;

import com.pboreg.library.ScreenController;
import com.pboreg.library.credStore;
import com.pboreg.library.Koneksi;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.ResourceBundle;

public class BookingController extends credStore implements Initializable {

    public AnchorPane apBooking;
    public ChoiceBox pilDokter;
    public DatePicker datePick;
    public ChoiceBox pilWaktu;
    public Button BookingButton;
    public Label bookingMessage;

    private Koneksi koneksi = new Koneksi();
    ScreenController sc = new ScreenController();


    public void validateBooking(){
        String pilihdokter = String.valueOf(pilDokter.getSelectionModel().getSelectedItem());

        String pilihwaktu = String.valueOf(pilWaktu.getSelectionModel().getSelectedItem());
        LocalDate pilihhari = datePick.getValue();

        String query = "INSERT INTO reservasi (Dokter, Hari, Waktu, UsernamePasien) VALUES ('"+pilihdokter+"', '"+pilihhari+"','"+pilihwaktu+"', '"+getUnamePasien()+"')";
        int hasil = koneksi.manipulasiData(query);
        if (hasil==1) {
            System.out.println("Data telah dimasukkan ke Server");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Reservasi berhasil, mohon tunggu kabar dari suster!");
            alert.showAndWait();
            sc.switchScreen("LoginPasien", "Login Pasien", apBooking);
        }
    }


    public void buttonBookingOnClick(MouseEvent mouseEvent) {
        if (pilDokter.getSelectionModel().isEmpty()==false && pilWaktu.getSelectionModel().isEmpty()==false){
            System.out.println(getUnamePasien());
            validateBooking();
        }else{
            bookingMessage.setText("Isi Dengan Lengkap!");
        }
    }



    public void pilihDokterOnClick(MouseEvent mouseEvent) {
        pilDokter.getItems();
    }

    public void pilihWaktuOnClick(MouseEvent mouseEvent) {
        pilWaktu.getItems();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for (String d :Arrays.asList("drg. Nurhadidjah Z, Sp.Perio", "drg. Sandra AR Gultom, SpKG", "drg. Bernard Mahfouz, SpKG")) {
            pilDokter.getItems().add(d);

        }

        for (String w : Arrays.asList("10.00-11.30", "12.30-14.00", "15.00-17.00", "19.00-20.30", "21.00-22.00")) {
            pilWaktu.getItems().add(w);

        }
    }
}
