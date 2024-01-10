/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.admin.web.menu.create;

import com.database.connection.databaseConnection;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class MenuCreateForm extends javax.swing.JFrame {

    /**
     * Creates new form MenuCreateForm
     */
    public MenuCreateForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        menuName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuDetail = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        menuCategory = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        menuPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        imageChooser = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        menuImage = new javax.swing.JTextField();
        imageOut = new javax.swing.JLabel();
        lbldescription = new javax.swing.JLabel();
        lblmenuname1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 510));
        setPreferredSize(new java.awt.Dimension(640, 510));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setForeground(new java.awt.Color(255, 153, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Menu Name");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 25));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        menuName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        menuName.setPreferredSize(new java.awt.Dimension(250, 25));
        menuName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNameActionPerformed(evt);
            }
        });
        getContentPane().add(menuName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Description");
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 25));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        menuDetail.setColumns(15);
        menuDetail.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        menuDetail.setRows(4);
        jScrollPane1.setViewportView(menuDetail);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 260, 100));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("Category");
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 25));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        menuCategory.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        menuCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Main courses", "Appetizers", "Desserts", "Beverages" }));
        menuCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(menuCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 250, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setText("Image");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 25));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        menuPrice.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        menuPrice.setPreferredSize(new java.awt.Dimension(250, 25));
        getContentPane().add(menuPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setText("Price");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 25));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        imageChooser.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        imageChooser.setText("Choose image");
        imageChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageChooserActionPerformed(evt);
            }
        });
        getContentPane().add(imageChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 220, -1));

        backBtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        backBtn.setText("Cancel");
        backBtn.setPreferredSize(new java.awt.Dimension(150, 30));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

        createBtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        createBtn.setText("Create");
        createBtn.setPreferredSize(new java.awt.Dimension(150, 30));
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        getContentPane().add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));

        menuImage.setEditable(false);
        menuImage.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        menuImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuImageActionPerformed(evt);
            }
        });
        getContentPane().add(menuImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 220, -1));
        getContentPane().add(imageOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 100, 100));
        getContentPane().add(lbldescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 120, 30));
        getContentPane().add(lblmenuname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        String name = menuName.getText().trim();
        String detail = menuDetail.getText().trim();

        if (name.isEmpty() && detail.isEmpty()) {
        JOptionPane.showMessageDialog(null, "MenuName and Description Fields cannot be empty. Please fill in the required information.");
        
        } else if (name.isEmpty()) {
        JOptionPane.showMessageDialog(null, "MenuName Field is empty. Please fill in the necessary information.");
        
        } else if (detail.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Description Field is empty. Please fill in the necessary information.");
        
        } else {
            
        try {
        Integer.parseInt(menuPrice.getText());
        boolean status = databaseConnection.addMenu(name, detail, (String) menuCategory.getSelectedItem(), menuPrice.getText(), menuImage.getText());
        if (status) {
            JOptionPane.showMessageDialog(null, "Menu Created!!!");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Menu not created..");
        }
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Inputted value in price is not an integer.");
    }
    }
    }//GEN-LAST:event_createBtnActionPerformed

    private void menuCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCategoryActionPerformed
        
    }//GEN-LAST:event_menuCategoryActionPerformed

    private void imageChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageChooserActionPerformed
        File file = databaseConnection.imageChooser();
        menuImage.setText(file.toString());
        try {
            imageOut.setIcon(new ImageIcon(ImageIO.read(file)));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_imageChooserActionPerformed

    private void menuImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuImageActionPerformed

    }//GEN-LAST:event_menuImageActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void menuNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNameActionPerformed
        
    
    }//GEN-LAST:event_menuNameActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCreateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCreateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCreateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCreateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCreateForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton imageChooser;
    private javax.swing.JLabel imageOut;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldescription;
    private javax.swing.JLabel lblmenuname1;
    private javax.swing.JComboBox<String> menuCategory;
    private javax.swing.JTextArea menuDetail;
    private javax.swing.JTextField menuImage;
    private javax.swing.JTextField menuName;
    private javax.swing.JTextField menuPrice;
    // End of variables declaration//GEN-END:variables
}
