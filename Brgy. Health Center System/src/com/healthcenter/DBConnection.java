package com.healthcenter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    private final String DRIVE = "com.mysql.cj.jdbc.Driver";
    public Connection sql_conn;
    public PreparedStatement ps;
    public ResultSet rs;
        
    public void connect() {
        try {
            Class.forName(DRIVE);
            sql_conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcareproviderdb?useSSL=false","SudoDotDev","101802");
            
            if(sql_conn != null) {
                System.out.println("Connected Successfully!");
            } else {
                System.out.println("Not connected");
            }
        }
        
        catch(SQLException i) {
            JOptionPane.showMessageDialog(null, "Database error : " + i.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        catch(Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}

