/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.time.LocalDate;
import Database.DbConnection;
import Model.Flights;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ticketsearchcontroller{
    DbConnection db= new DbConnection();
    public ResultSet retrieveflights(Flights flight) throws SQLException{
        String departure = flight.getDeparture();
        String destination= flight.getDestination();
        LocalDate departuredate = LocalDate.parse(flight.getDepartureDate());
        String insertsearchquery = "select * from flights where departure= '"+departure+"' AND destination='"+destination+"' AND departure_date='"+departuredate+"'";

        ResultSet newResult;
        newResult = db.retrieve(insertsearchquery);
        return newResult;
        
    }
    
}

