/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author dell
 */
public class User {
    private String user_userid;
    private String user_username;
    private String user_email;
    private String user_password;

public User( String user_userid,String user_username, String user_email, String user_password){
this.user_userid=user_userid;
this.user_username=user_username;
this.user_email=user_email;
this.user_password=user_password;
}

public User( String user_username, String user_email, String user_password){
this.user_username=user_username;
this.user_email=user_email;
this.user_password=user_password;
}

//setter for userId
public void setUserId(String user_userid){
    this.user_userid=user_userid;
}
  
//setter for username
public void setUsername(String newUsername){
    this.user_username=newUsername;
}
//setter for email
public void setEmail(String newEmail){
    this.user_email=newEmail;
}
//setter for password
public void setPassword(String newPassword){
    this.user_password=newPassword;
}

//getter for userId;
public String getUserId(){
    return this.user_userid;
}

//getter for username;
public String getUsername(){
    return this.user_username;
}

//getter for email;
public String getEmail(){
    return this.user_email;
}

//getter for password;
public String getPassword(){
    return this.user_password;
}


}