/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.User;
import Database.DbConnection;
/**
 *
 * @author dell
 */
public class signupcontroller {
    DbConnection db= new DbConnection();
    public void insertUser(User user){
        String username = user.getUsername();
        String email = user.getEmail();
        String password= user.getPassword();
        String insertQueries="insert into user(username,email,password)"+"values('"+username+"','"+email+"','"+password+"')";
        db.manipulates(insertQueries);
              
    }
}
