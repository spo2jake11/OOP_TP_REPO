/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.admin.reserve.result;

import com.admin.reserve.search.SearchReserveFrame;
import com.database.connection.databaseConnection;
import java.util.Map;

/**
 *
 * @author Rocher
 */
public class SearchResultFrame extends javax.swing.JFrame {

    private String searchData;

    /**
     * Creates new form SearchResultFrame
     */
    public SearchResultFrame() {
        initComponents();
        setLocationRelativeTo(null);
        databaseConnection db = new databaseConnection();
        Map<String, String> map = db.getResult();
        resName.setText(map.get("name"));
        resEmail.setText(map.get("email"));
        resTime.setText(map.get("reserveTime"));
        resDate.setText(map.get("reserveDate"));
        resPay.setText(map.get("payment"));
        resSeat.setText(map.get("reserveSeat"));
        resStatus.setText(map.get("status"));
        resCode.setText(map.get("otp"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Backbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        resEmail = new javax.swing.JTextField();
        resName = new javax.swing.JTextField();
        resTime = new javax.swing.JTextField();
        resDate = new javax.swing.JTextField();
        resPay = new javax.swing.JTextField();
        resSeat = new javax.swing.JTextField();
        resStatus = new javax.swing.JTextField();
        resCode = new javax.swing.JTextField();
        OnTimebtn = new javax.swing.JButton();
        Cancelledbtn = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 1010, -1));

        Backbtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 96, 35));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Reserve Status: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 200, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 200, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Email: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("Email: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setText("Date of Reservation: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 200, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setText("Time of Reservation: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 200, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setText("Seat Reserved: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 200, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setText("Mode of Payment: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 200, 30));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setText("Reference Code: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 200, 30));

        resEmail.setEditable(false);
        resEmail.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(resEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 300, 30));

        resName.setEditable(false);
        resName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        resName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resNameActionPerformed(evt);
            }
        });
        getContentPane().add(resName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 300, 30));

        resTime.setEditable(false);
        resTime.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(resTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 300, 30));

        resDate.setEditable(false);
        resDate.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(resDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 300, 30));

        resPay.setEditable(false);
        resPay.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(resPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 300, 30));

        resSeat.setEditable(false);
        resSeat.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(resSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 300, 30));

        resStatus.setEditable(false);
        resStatus.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(resStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 300, 30));

        resCode.setEditable(false);
        resCode.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(resCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 300, 30));

        OnTimebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        OnTimebtn.setText("On Time");
        OnTimebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnTimebtnActionPerformed(evt);
            }
        });
        getContentPane().add(OnTimebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 130, 40));

        Cancelledbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Cancelledbtn.setText("Cancelled");
        Cancelledbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelledbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelledbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 530, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        SearchReserveFrame srf = new SearchReserveFrame();
        srf.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BackbtnActionPerformed

    private void resNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resNameActionPerformed

    private void OnTimebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnTimebtnActionPerformed
        databaseConnection.updateStatusInDatabase("On Time", resCode.getText());
        this.dispose();

    }//GEN-LAST:event_OnTimebtnActionPerformed

    private void CancelledbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelledbtnActionPerformed
        databaseConnection.updateStatusInDatabase("Cancelled", resCode.getText());
        this.dispose();
    }//GEN-LAST:event_CancelledbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchResultFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchResultFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchResultFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchResultFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchResultFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JButton Cancelledbtn;
    private javax.swing.JButton OnTimebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField resCode;
    private javax.swing.JTextField resDate;
    private javax.swing.JTextField resEmail;
    private javax.swing.JTextField resName;
    private javax.swing.JTextField resPay;
    private javax.swing.JTextField resSeat;
    private javax.swing.JTextField resStatus;
    private javax.swing.JTextField resTime;
    // End of variables declaration//GEN-END:variables

    //Update Status from Java to Database
}
