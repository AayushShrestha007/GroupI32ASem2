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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ars", "root", "sa4330156");
//            pst = con.prepareStatement("select * from user where username=? and password=?");

        } catch (Exception e) {
            System.out.println(e);
        }
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
    //ip:username,password
    //return boolean
//    public Boolean checkLogin(String uname, String pwd) {
//        try {
//
//            pst.setString(1, uname); //this replaces the 1st  "?" in the query for username
//            pst.setString(2, pwd);    //this replaces the 2st  "?" in the query for password
//            //executes the prepared statement
//            rs = pst.executeQuery();
//            if (rs.next()) {
//                System.out.print("Success");
//                //TRUE if the query founds any corresponding data
//                return true;
//            } else {
//                System.out.print("Failed");
//                
//                return false;
//            }
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            System.out.println("error while validating" + e);
//            return false;
//        }
//    }
    
    
    public static void main(String[] args){
        new DbConnection();
    }
}

