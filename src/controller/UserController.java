package controller;

import database.DbConnection;
import models.User;
import java.sql.*;
import javax.swing.JOptionPane;


public class UserController {

    ResultSet rs;

    public int testUser(User newuser) {
              
        String username =newuser.getUsername();
        String password = newuser.getPassword();
//        User lv=new User(username,password,"");
        try {
                
                Connection conn=DbConnection.connectdb();
                String query = "Select * from user where username='"+username+"' and password='"+password+"' ";
                
                Statement smt = conn.createStatement();
                rs = smt.executeQuery(query);
                
            if(rs.next()){

                JOptionPane.showMessageDialog(null, "You have logged in successfully","Success",
                            JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(null, "Wrong password. Try again","Failed!!",
                            JOptionPane.ERROR_MESSAGE);
                
            }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                System.out.println(e);
                
                
            }
        return 0;
        
        
        
    }
    public int UpdateUser(User upddateuser) {
              
        String username =upddateuser.getUsername();
        String email = upddateuser.getEmail();
//        User lv=new User(username,null,email);
        try {
                
                Connection conn=DbConnection.connectdb();
                String query = "update user set username='"+username+"', email='"+email+"' ";
                
                PreparedStatement smt = conn.prepareStatement(query);
                smt.execute();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                System.out.println(e);
                
                
            }
        return 0;
        
        
        
    }
}