/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.logincontroller;
import Database.DbConnection;

import Model.User;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ChangePassword extends javax.swing.JFrame {
    
    
    
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


    public ChangePassword() {
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
        tf_E_Pass = new javax.swing.JTextField();
        tf_N_pass = new javax.swing.JTextField();
        tf_E_User = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

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
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 150, -1));

        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 110, 40));

        tf_E_Pass.setText("New Password");
        tf_E_Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_E_PassActionPerformed(evt);
            }
        });
        jPanel1.add(tf_E_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 240, 38));

        tf_N_pass.setText("Confirm Password");
        tf_N_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_N_passActionPerformed(evt);
            }
        });
        jPanel1.add(tf_N_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 240, 38));

        tf_E_User.setText("Email Address");
        jPanel1.add(tf_E_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 240, 38));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Change ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 140, -1));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, -1, 1200, 700));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, -3, 1210, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void tf_N_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_N_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_N_passActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField tf_E_Pass;
    private javax.swing.JTextField tf_E_User;
    private javax.swing.JTextField tf_N_pass;
    // End of variables declaration//GEN-END:variables
}
