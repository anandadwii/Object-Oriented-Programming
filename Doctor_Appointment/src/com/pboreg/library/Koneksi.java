package com.pboreg.library;

import java.sql.*;

public class Koneksi {
    //buat attribut untuk koneksi
    public Connection conn;

    //buat deklarasi attribut untuk statement
    private Statement st;

    //definisikan username, password, dan alamat server mysql
    // jangan lupa balikin default credential sebelum kirim source code!
    public Koneksi(){
        try{
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/doctor-appointment?Ser";

            conn= DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            System.out.println("Error : "+e.getMessage());
        }
    }
    public Connection databaseLink;
    public Connection getConn(){
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost:3306/doctor-appointment";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url,user,pass);
        }catch (Exception e){

        }
        return databaseLink;
    }
    // untuk Input data, Edit data, hapus data
    public int manipulasiData(String query){
        try {
            st = conn.createStatement();
            return st.executeUpdate(query);
        } catch (SQLException e){
            System.out.println("Error: "+e.getMessage());
            return 0;
        }
    }

    //untuk menampilkan data
    public ResultSet getData(String query){
        try{
            st = conn.createStatement();
            return st.executeQuery(query);
        }catch (SQLException e){
            System.out.println("Error: "+e.getMessage());
            return null;
        }
    }
}
