/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package signup;

/**
 *
 * @author chaud
 */
import java.sql.*;

    
public class DbConnection {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    DbConnection() {
        try {

            //MAKE SURE YOU KEEP THE mysql_connector.jar file in java/lib folder
            //ALSO SET THE CLASSPATH
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb", "root", "Prapti@1");
            pst = con.prepareStatement("select * from user where username=? and password=?");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //ip:username,password
    //return boolean
    public Boolean checkLogin(String uname, String pwd) {
        try {

            pst.setString(1, uname); //this replaces the 1st  "?" in the query for username
            pst.setString(2, pwd);    //this replaces the 2st  "?" in the query for password
            //executes the prepared statement
            rs = pst.executeQuery();
            if (rs.next()) {
                System.out.print("Success");
                //TRUE if the query founds any corresponding data
                return true;
            } else {
                System.out.print("Failed");

                return false;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating" + e);
            return false;
        }
    }
    public static void main(String[] args){
        new DbConnection();
    }
public class SIGNUP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
