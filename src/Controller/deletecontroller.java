/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Database.DbConnection;
import Model.User;

/**
 *
 * @author dell
 */
public class deletecontroller{
    DbConnection db= new DbConnection();
    public void deleteUser(User user){
        String username = user.getUsername();
        String email = user.getEmail();
        String password= user.getPassword();
        String deleteQueries="delete from user where email='"+email+"'";
        db.manipulates(deleteQueries);
              
    }
}

    

