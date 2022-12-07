/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.User;
import Database.DbConnection;
import java.sql.ResultSet;
/**
 *
 * @author dell
 */
public class logincontroller {
    DbConnection db= new DbConnection();
    public ResultSet retrieveflights(User user){
        String uname = user.getUsername();
        String password = user.getPassword();
        String searchquery = "select * from user where username='"+uname+"' AND password='"+password+"'";
        ResultSet loginresult;
        loginresult = db.retrieve(searchquery);
        return loginresult;
    }
        public ResultSet testuser(User user){
        String uname = user.getUsername();
        String password = user.getPassword();
        String email=user.getEmail();
        String searchquery = "select * from user where username='"+uname+"' AND password='"+password+"'AND email='"+email+"' ";
        ResultSet loginresult;
        loginresult = db.retrieve(searchquery);
        return loginresult;
    }
}
