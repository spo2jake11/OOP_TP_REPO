/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_tp_resto;

import com.admin.home.AdminHomeFrame;
import com.database.connection.databaseConnection;
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
        homeObj.show();
        
        databaseConnection.getCon();
    }
    
}
