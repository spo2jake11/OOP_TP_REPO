/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_tp_resto;

import com.admin.home.AdminHomeFrame;
import com.database.connection.databaseConnection;
import static com.database.connection.databaseConnection.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class OOP_TP_RESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AdminHomeFrame homeObj = new AdminHomeFrame();
        homeObj.setVisible(true);
        databaseConnection.getCon();
        Timestamp time = new Timestamp(new Date().getTime());
        String query = "SELECT * FROM reservation_db WHERE status = 'Waiting'";
        try (PreparedStatement statement = con.prepareStatement(query); ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                if (resultSet.getTimestamp("reserve_date").before(time)) {
                    int id = resultSet.getInt("ID");
                    setUpdate(id);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private static void setUpdate(int id) {
        String query = "UPDATE reservation_db SET status = ?, updated_at = ? WHERE ID = ?";
        Timestamp time = new Timestamp(new Date().getTime());
        try (PreparedStatement state = con.prepareStatement(query);) {
            state.setString(1, "Late");
            state.setTimestamp(2, time);
            state.setInt(3, id);
            state.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
