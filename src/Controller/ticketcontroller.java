/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.time.LocalDate;
import Database.DbConnection;
import Model.ticket;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author dell
 */
public class ticketcontroller {
    DbConnection db= new DbConnection();
    public ResultSet retrieveflightid(ticket tickets) throws SQLException{
        String aName = tickets.getAirName();
        LocalDate dDate= LocalDate.parse(tickets.getDDate());
        String departure= tickets.getDeparture();
        String destination= tickets.getDestination();
        String flightidsearchquery = "select flight_number from flights where airline_name= '"+aName+"' AND destination='"+destination+"' AND departure_date='"+dDate+"' AND departure='"+departure+"'";
        
        ResultSet newResult;
        newResult = db.retrieve(flightidsearchquery);
        return newResult;
        
    }
}
