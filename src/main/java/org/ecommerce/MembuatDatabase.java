package org.ecommerce;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

//untuk membuat database
public class MembuatDatabase {
    public static void createNewDatabase(String fileName){
        String url = "jdbc:sqlite:C:/sqlite/" + fileName;
        try {
            Connection conn = DriverManager.getConnection(url);
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                //pesan ketika program atau kode berhasil dieksekusi = membuat database baru = sukses
                System.out.println("Database Berhasil Dibuat");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        createNewDatabase("db_ecommerce_elma.db");
    }
}
