/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UTS
 */
package Database;
import java.sql.*;
public class DbConnection {
    Connection con;
    Statement stm;
//    PreparedStatement pst;
    ResultSet rs;
    

    public DbConnection() {
        try {

            //MAKE SURE YOU KEEP THE mysql_connector.jar file in java/lib folder
            //ALSO SET THE CLASSPATH
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ars", "root", "Nepal2014!");
//            pst = con.prepareStatement("select * from user where username=? and password=?");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static Connection connectdb(){
        try{Class.forName("com.mysql.cj.jdbc.Driver");
           
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ars", "root", "Nepal2014!");
            
            if(con!=null){
                System.out.println("Successfully connected to database");
                return con;
            }
            
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Not connected");
            
        }
        return null;
        
    }


    public int manipulates (String queries){
        int value=0;
        try{
            
            stm = con.createStatement();
            value = stm.executeUpdate(queries);
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return value;
    }
    
    
    public ResultSet retrieve(String query){

        try {
            stm = con.createStatement();
            rs = stm.executeQuery(query);
            

        }catch (SQLException e){

            e.printStackTrace();

        }

        return rs;

    }
    
    
    public static void main(String[] args){
        DbConnection.connectdb();
    }
}

