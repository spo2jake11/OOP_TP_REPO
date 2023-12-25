/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class databaseConnection {
    public static Connection con = null;
    
    public static void getCon(){
        String url = "jdbc:mysql://localhost:3306/bsit2.1c";
        String user = "root";
        String password = "";
        
        try{
            con = DriverManager.getConnection(url, user, password);
            if(con != null){
                JOptionPane.showMessageDialog(null, "Database has been connected");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in the database connection " + e);
        }
    }
}
