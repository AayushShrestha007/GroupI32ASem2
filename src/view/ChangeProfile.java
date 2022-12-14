/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Contraints.Constant;
import Controller.deletecontroller;
import Controller.logincontroller;
import Controller.signupcontroller;
import Database.DbConnection;

import Model.User;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ChangeProfile extends javax.swing.JFrame {
    LoginScreen l1= new LoginScreen();
    
    
    
public boolean testUserdetail(){
        String E_user = tf_E_User.getText();
        String E_email = tf_E_Email.getText();
        String E_pass = tf_E_Pass.getText();
        User u1= new User(E_user,E_email,E_pass);
        logincontroller lc= new logincontroller();
        ResultSet r = lc.testuser(u1);
        boolean iscorrect=false;
                    try {
                        if(r.next()){
                            iscorrect=true;
                            System.out.println("Correct Existing datas");                           
                        }
                        else{
                            iscorrect=false;
                            JOptionPane.showMessageDialog(null," Invalid Existig Data");
                        }
                            } catch (SQLException ex) {
                            
                            System.out.println("SQL Error"+ex);
                            }

            return iscorrect;
}


    public ChangeProfile() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf_E_Pass = new javax.swing.JTextField();
        tf_N_Email = new javax.swing.JTextField();
        tf_N_pass = new javax.swing.JTextField();
        tf_E_Email = new javax.swing.JTextField();
        tf_N_username = new javax.swing.JTextField();
        tf_E_User = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 102, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 600));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Change Profile");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 177, -1));

        btnsave.setBackground(new java.awt.Color(255, 51, 51));
        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("Change");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 110, 40));

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-user-64 (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 14, 90, 99));

        tf_E_Pass.setText("Enter Existing Password");
        tf_E_Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_E_PassActionPerformed(evt);
            }
        });
        jPanel1.add(tf_E_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 244, 240, 38));

        tf_N_Email.setText("Enter New Email");
        tf_N_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_N_EmailActionPerformed(evt);
            }
        });
        jPanel1.add(tf_N_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 240, 38));

        tf_N_pass.setText("Enter New Password");
        jPanel1.add(tf_N_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 240, 38));

        tf_E_Email.setText("Enter Existing Email");
        tf_E_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_E_EmailActionPerformed(evt);
            }
        });
        jPanel1.add(tf_E_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 244, 240, 38));

        tf_N_username.setText("Enter New Username");
        jPanel1.add(tf_N_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 240, 38));

        tf_E_User.setText("Enter Existing Username");
        jPanel1.add(tf_E_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 244, 240, 38));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(298, 71));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/icons8-male-user-64.png"))); // NOI18N
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/icons8-available-updates-64.png"))); // NOI18N
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/icons8-home-page-64.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/icons8-logout-64.png"))); // NOI18N
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jButton6)
                .addGap(0, 0, 0)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton9))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 340, -1));

        delete.setBackground(new java.awt.Color(255, 51, 51));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete User");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 543, 150, 40));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1240, 700));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, -3, 1270, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //Refresh
        setVisible(false);
        setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ChangeProfile().setVisible(true);
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        int value=JOptionPane.showConfirmDialog(null, "Are you sure you want to Logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if(value==0){
        this.dispose();
        Constant.loggedInUser = null;
        new LoginScreen().setVisible(true);   } 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void tf_E_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_E_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_E_EmailActionPerformed

    private void tf_N_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_N_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_N_EmailActionPerformed

    private void tf_E_PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_E_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_E_PassActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        String E_user = tf_E_User.getText();
        String E_email = tf_E_Email.getText();
        String E_pass = tf_E_Pass.getText();
        String N_user = tf_N_username.getText();
        String N_email = tf_N_Email.getText();
        String N_pass = tf_N_pass.getText();

        //
        if(evt.getSource()==btnsave)
        {
            if(E_user.equals("") || E_email.equals("") || E_pass.equals("") || N_user.equals("") || N_email.equals("") || N_pass.equals("") ){
                JOptionPane.showMessageDialog(null, "Please fill all the details");
            }else {
                if(testUserdetail()==false){

                    System.out.println("Invalid Existing User Data!!");
                    //when existing user data is given
                    //invalid

                }else{
                    try{

                        String query ="update user set username='"+N_user+"', email='"+N_email+"', password='"+N_pass+"' where email='"+E_email+"'";
                        Connection conn=DbConnection.connectdb();
                        PreparedStatement pst=conn.prepareStatement(query);
                        pst.execute();

                        System.out.println("User Details Updated Successfully");
                        JOptionPane.showMessageDialog(null, "User Details Updated Successfully");

                    }catch(SQLException ex){
                        System.out.println(ex);
                    }
                }

            }
            
            
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //home_page
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dbf().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton6ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        //Delete Query
            String email=tf_E_Email.getText();
            String user=tf_E_User.getText();
            String pass=tf_E_Pass.getText();
             if(evt.getSource()==delete)
        {
            if(email.equals("") || user.equals("") || pass.equals("")  ){
                JOptionPane.showMessageDialog(null, "Please fill all the details");
            
        }
            else{
          
                User u2= new User(user,email,pass);
                deletecontroller d1= new deletecontroller();
                d1.deleteUser(u2);
                JOptionPane.showMessageDialog(null,"Delete successful");
                this.setVisible(false);
                l1.setVisible(true);

            }
        }
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsave;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField tf_E_Email;
    private javax.swing.JTextField tf_E_Pass;
    private javax.swing.JTextField tf_E_User;
    private javax.swing.JTextField tf_N_Email;
    private javax.swing.JTextField tf_N_pass;
    private javax.swing.JTextField tf_N_username;
    // End of variables declaration//GEN-END:variables
}
