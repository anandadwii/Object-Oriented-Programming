package com.pboreg.library;

import java.sql.*;
import java.time.LocalDate;

public class PasienQueries {
    String url = "jdbc:mysql://localhost:3306/doctor-appointment";
    String user = "root";
    String pass = "";

    public Connection conn;
    public PreparedStatement insertPasien;
    public PreparedStatement updatePasien;
    public PreparedStatement deletePasien;

    public PasienQueries() {
        try {
            conn = DriverManager.getConnection(url, user, pass);

            insertPasien = conn.prepareStatement("INSERT INTO pasien (Username, Password, Nama, Umur, Tanggal_lahir, Telepon, Alamat) VALUES (?, ?, ?, ?, ?, ?, ?)");
            updatePasien = conn.prepareStatement("UPDATE pasien SET Username=(?), Password=(?), Nama=(?), Umur=(?), Tanggal_lahir=(?), Telepon=(?), Alamat=(?) WHERE id=(?)");
            deletePasien = conn.prepareStatement("DELETE FROM pasien WHERE id=(?)");
        }catch (SQLException e){
            e.getMessage();
        }
    }

    public int addPasien(String username, String pass, String nama, String umur, LocalDate lahir, String telp, String alamat) {
        try{
            insertPasien.setString(1, username);
            insertPasien.setString(2, pass);
            insertPasien.setString(3, nama);
            insertPasien.setString(4, umur);
            insertPasien.setString(5, String.valueOf(lahir));
            insertPasien.setString(6, telp);
            insertPasien.setString(7, alamat);

            return insertPasien.executeUpdate();

        }catch(SQLException e){
            e.getMessage();
            return 0;
        }
    }
    
    public int upPasien(String username, String pass, String nama, String umur, LocalDate lahir, String telp, String alamat, String id ){
        try{
            updatePasien.setString(1, username);
            updatePasien.setString(2, pass);
            updatePasien.setString(3, nama);
            updatePasien.setString(4, umur);
            updatePasien.setString(5, String.valueOf(lahir));
            updatePasien.setString(6, telp);
            updatePasien.setString(7, alamat);
            updatePasien.setString(8, id);

            return updatePasien.executeUpdate();
        }catch(SQLException e){
            e.getMessage();
            return 0;
        }
    }
    
    public int delPasien(String id) {
        try{
            deletePasien.setString(1, id);

            return deletePasien.executeUpdate();
        }catch(SQLException e){
            e.getMessage();
            return 0;
        }
    }
}
