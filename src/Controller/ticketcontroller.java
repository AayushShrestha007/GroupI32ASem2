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
   
    public String uId;
    public int insertTicket(ticket tickets) throws SQLException{
         
        String aName = tickets.getAirName();
        LocalDate dDate= LocalDate.parse(tickets.getDDate());
        String departure= tickets.getDeparture();
        String destination= tickets.getDestination();
        String uName= tickets.getUName(); 
        String flightidsearchquery = "select * from flights where airline_name= '"+aName+"' AND destination='"+destination+"' AND departure_date='"+dDate+"' AND departure='"+departure+"'";
        String useridsearchquery = "select * from user where username='"+uName+"'";
        
        ResultSet newResult;
        ResultSet newResult2;
        
        DbConnection db= new DbConnection();
        newResult = db.retrieve(flightidsearchquery);
        newResult.next();
        String flightid= newResult.getString("flight_number");
        String insertFlightIdQuery = "insert into ticket(flight_number)"+"values('"+flightid+"')";
        db.manipulates(insertFlightIdQuery);
        
        DbConnection db2= new DbConnection();
        newResult2= db2.retrieve(useridsearchquery);
        newResult2.next();
        String uId= newResult2.getString("user_id");
        String insertUIdQuery ="update ticket set user_id='"+uId+"' where flight_number='"+flightid+"'";
        db2.manipulates(insertUIdQuery);
        
       
        
        return 1;
       
        
    }
}
 
    
