/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.database.connection;

import com.admin.reserve.result.SearchResultFrame;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileWriter;
import java.io.PrintWriter;
/**
 *
 * @author Admin
 */
public class databaseConnection {
    static Map<String, String> results = new HashMap<>();
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
                        results.put("name", resultSet.getString("name"));
                        results.put("email", resultSet.getString("email"));
                        results.put("reserveDate", resultSet.getString("reserve_date"));
                        results.put("reserveTime", resultSet.getString("reserve_time"));
                        results.put("reserveSeat", resultSet.getString("seat_taken"));
                        results.put("payment", resultSet.getString("payment_mode"));
                        results.put("otp", resultSet.getString("reserve_code"));
                        results.put("status", resultSet.getString("status"));

                        SearchResultFrame srf = new SearchResultFrame();
                        srf.setVisible(true);
                        
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
    public Map<String, String> getResult(){
        return results;
    }
    public static boolean addMenu(String name, String detail, String category, String price){
        String query = "INSERT INTO menu_db (name, detail, category, price, image, created_at, updated_at) VALUES(?, ?, ?, ?, ?, ?, ?)";
        getCon();
        try(PreparedStatement prep = con.prepareStatement(query)){
            prep.setString(1, name);
            prep.setString(2, detail);
            prep.setString(3, category);
            prep.setInt(4, Integer.parseInt(price));
            prep.setString(5, "Nothing");
            
            Timestamp time = new Timestamp(new Date().getTime());
            prep.setTimestamp(6, time);
            prep.setTimestamp(7, time);
            
            int result = prep.executeUpdate();
            return result > 0;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
    // Method to fetch archived reservations
    public static void fetchArchivedReservations() {
        try {
            // Use the connection details from databaseConnection class
            getCon();

            String folderPath = "C:\\Users\\Admin\\Documents\\Github Repositories\\GithubRepo\\OOP_TP_REPO\\Archived Reservations";

            // Construct the query for fetching archived reservations
            String query = "SELECT * FROM reservation_db";  // Replace 'your_archived_table' with your actual table name

            try (PreparedStatement statement = con.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {

                // Create the folder if it doesn't exist
                File folder = new File(folderPath);
                if (!folder.exists()) {
                folder.mkdirs();  // This creates both the folder and any necessary parent folders
                }

                String filePath = folderPath + File.separator + "archived_reservations.txt";

                // Create a FileWriter to write to a text file
                try (FileWriter fileWriter = new FileWriter(filePath);
                     PrintWriter printWriter = new PrintWriter(fileWriter)) {

                    // Execute the query
                    while (resultSet.next()) {
                        // Process each archived reservation
                        Map<String, String> results = new HashMap<>();
                        results.put("name", resultSet.getString("name"));
                        results.put("email", resultSet.getString("email"));
                        results.put("seat_taken", resultSet.getString("seat_taken"));
                        results.put("reserve_date", resultSet.getString("reserve_date"));
                        results.put("reserve_time", resultSet.getString("reserve_time"));
                        results.put("status", resultSet.getString("status"));
                        results.put("pament_mode", resultSet.getString("payment_mode"));
                        results.put("reserve_code", resultSet.getString("reserve_code"));
                        results.put("created_at",resultSet.getString("created_at"));
                        results.put("updated_at", resultSet.getString("updated_at"));
                        printWriter.println(results.toString());
                    }

                    JOptionPane.showMessageDialog(null, "Archived Reservations exported to archived_reservations.txt");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
