/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
//                JOptionPane.showMessageDialog(null, "Database has been connected");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in the database connection " + e);
        }
    }
    public boolean addMenu(String name, String detail, String category, int price, String image){
        String query = "INSERT INTO menu_db (name, detail, category, price, image, created_at, updated_at)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        getCon();
        try(PreparedStatement prep = con.prepareStatement(query)){
            //This is straight up set on database key to inputted value
            prep.setString(1, name);
            prep.setString(2, detail);
            prep.setString(3, category);
            prep.setInt(4, price);
            //This will do try catch for error prevention and stop the program from completely stopping
            File imageFile = new File(image);
            try (FileInputStream fis = new FileInputStream(imageFile)) {
                prep.setBinaryStream(5, fis, (int) imageFile.length());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e);
                return false;
            }
            //This is the timestamp, both created_by and updated_by has same date except updated
            Timestamp time = new Timestamp(new Date().getTime());
            prep.setTimestamp(6, time);
            prep.setTimestamp(7, time);
            
            return prep.execute();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Problem in the data insertion " + e);
            return false;
        }
    }
}
