package com.pboreg.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReservasiQueries {
    String url = "jdbc:mysql://localhost:3306/doctor-appointment";
    String user = "root";
    String pass = "";

    public Connection conn;
    public PreparedStatement insertReservasi;
    public PreparedStatement updateReservasi;
    public PreparedStatement deleteReservasi;

    public ReservasiQueries(){
        try {
            conn = DriverManager.getConnection(url, user, pass);

            insertReservasi = conn.prepareStatement("INSERT INTO reservasi (Dokter, Hari, Waktu, UsernamePasien) VALUES (?, ?, ?, ?)");
            updateReservasi = conn.prepareStatement("UPDATE reservasi SET Dokter=(?), Hari=(?), Waktu=(?), UsernamePasien=(?) WHERE Urutan=(?)");
            deleteReservasi = conn.prepareStatement("DELETE FROM reservasi WHERE Urutan=(?)");
        }catch (SQLException e){
            e.getMessage();
        }
    }

    public int addReservasi(String dokter, String hari, String waktu, String unamePasien) {
        try{
            insertReservasi.setString(1, dokter);
            insertReservasi.setString(2, hari);
            insertReservasi.setString(3, waktu);
            insertReservasi.setString(4, unamePasien);

            return insertReservasi.executeUpdate();
        }catch(SQLException e){
            e.getMessage();
            return 0;
        }
    }
    
    public int upReservasi(String dokter, String hari, String waktu, String unamePasien, String urutan){
        try{
            updateReservasi.setString(1, dokter);
            updateReservasi.setString(2, hari);
            updateReservasi.setString(3, waktu);
            updateReservasi.setString(4, unamePasien);
            updateReservasi.setString(5, urutan);

            return updateReservasi.executeUpdate();
        }catch(SQLException e){
            e.getMessage();
            return 0;
        }
    }
    
    public int delReservasi(String urutan) {
        try{
            deleteReservasi.setString(1, urutan);

            return deleteReservasi.executeUpdate();
        }catch(SQLException e){
            e.getMessage();
            return 0;
        }
    }
    
    
}
