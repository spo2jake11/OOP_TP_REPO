/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
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
                //Commented out the popup
                //JOptionPane.showMessageDialog(null, "Database has been connected");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in the database connection " + e);
        }
    }
    //Static method used in SearchReserveFrame
    public static void getSearchResult(String otp){
        try{
            // Use the connection details from databaseConnection class
            getCon();

            // Construct the query
            String query = "SELECT * FROM reservation_db WHERE reserve_code = ?";

            try (PreparedStatement statement = con.prepareStatement(query)) {
                
                // Set the parameter in the query
                statement.setString(1, otp);
                try (ResultSet resultSet = statement.executeQuery()){
                    
                    // Execute the query
                    if (resultSet.next()) {
                        // Reservation with the entered OTP found
                        Map<String, String> results = new HashMap<>();
                        results.put("name", resultSet.getString("name"));
                        results.put("email", resultSet.getString("email"));
                        results.put("reserveDate", resultSet.getString("reserve_date"));
                        results.put("reserveTime", resultSet.getString("reserve_time"));
                        results.put("reserveSeat", resultSet.getString("seat_taken"));
                        results.put("payment", resultSet.getString("payment_mode"));
                        results.put("otp", resultSet.getString("reserve_code"));
                        results.put("status", resultSet.getString("status"));
                        System.out.println(results.toString());
                    } else {
                        // No reservation with the entered OTP found
                        JOptionPane.showMessageDialog(null, "No reservation found.");
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
