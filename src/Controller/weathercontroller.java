/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Database.DbConnection;
//import Model.Flights;
import Model.Weather;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.time.LocalDate;

/**
 *
 * @author 20pra
 */
public class weathercontroller {
    DbConnection db= new DbConnection();
    public ResultSet retrieveweather(Weather weather) throws SQLException{
        String location = weather.getLocation();
       //String temperature= weather.getTemperature();
//        String forecast  = weather.getForecast();
        String insertsearchquery = "select * from weather where location= '"+location+"";
        ResultSet newResult;
        newResult = db.retrieve(insertsearchquery);
        return newResult;
        
    }
    
    
    
}
