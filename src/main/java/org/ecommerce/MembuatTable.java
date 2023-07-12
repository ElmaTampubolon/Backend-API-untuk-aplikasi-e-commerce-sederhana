package org.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MembuatTable {

    public static void createNewTableUsers() {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/db_ecommerce_elma.db";

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS users(" +
                "id INTEGER PRIMARY KEY, " +
                "first_name VARCHAR(50) NOT NULL, " +
                "last_name VARCHAR(50) NOT NULL, " +
                "email VARCHAR(100) NOT NULL, " +
                "phone_number VARCHAR(15) NOT NULL, " +
                "type TEXT CHECK(type IN('buyer', 'seller')) NOT NULL);";

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createNewTableAddresses() {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/db_ecommerce_elma.db";

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS addresses(" +
                "user INTEGER NOT NULL, " +
                "type TEXT CHECK(type IN('office', 'home')) NOT NULL, " +
                "line1 VARCHAR(100) NOT NULL, " +
                "line2 VARCHAR(100) NULL, " +
                "city VARCHAR(100) NOT NULL, " +
                "province VARCHAR(100) NOT NULL, " +
                "postcode VARCHAR(15) NOT NULL, " +
                "FOREIGN KEY(user) REFERENCES users(id));";

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void createNewTableProducts() {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/db_ecommerce_elma.db";

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS products(" +
                "id INTEGER PRIMARY KEY AUTO INCREMENT, " +
                "seller INTEGER NOT NULL, " +
                "title VARCHAR(100) NOT NULL, " +
                "description TEXT NOT NULL, " +
                "price INTEGER NOT NULL, " +
                "stock INTEGER NOT NULL), " +
                "FOREIGN KEY(seller) REFERENCES users(id));";

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createNewTableOrders() {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/db_ecommerce_elma.db";

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS orders(" +
                "id INTEGER PRIMARY KEY AUTO INCREMENT, " +
                "buyer INTEGER NOT NULL, " +
                "note TEXT NULL, " +
                "total INTEGER NOT NULL, " +
                "discount INTEGER NULL, " +
                "is_paid TINYINT(1) NOT NULL, " +
                "FOREIGN KEY(buyer) REFERENCES users(id));";

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createNewTableOrder_Details() {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/db_ecommerce_elma.db";

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS order_details(" +
                "order INTEGER NOT NULL, " +
                "product INTEGER NOT NULL, " +
                "quantity INTEGER NOT NULL, " +
                "price INTEGER NOT NULL, " +
                "FOREIGN KEY(orders) REFERENCES orders(id), " +
                "FOREIGN KEY(product) REFERENCES product(id));";

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createNewTableReviews() {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/db_ecommerce_elma.db";

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS reviews(" +
                "order INTEGER NOT NULL, " +
                "star TINYINT(5) NOT NULL, " +
                "description TEXT NOT NULL), " +
                "FOREIGN KEY(order) REFERENCES orders(order));";

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void createNewTableProduct() {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/db_ecommerce_elma.db";

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS products(" +
                "id INTEGER PRIMARY KEY AUTO INCREMENT, " +
                "seller INTEGER NOT NULL, " +
                "title VARCHAR(100) NOT NULL, " +
                "description TEXT NOT NULL, " +
                "price INTEGER NOT NULL, " +
                "stock INTEGER NOT NULL);";

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createNewTableUsers();
        createNewTableAddresses();
        createNewTableProducts();
        createNewTableOrders();
        createNewTableOrder_Details();
    }

}