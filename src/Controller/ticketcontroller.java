/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.time.LocalDate;
import Database.DbConnection;

import Model.ticket;
import Model.ticketDisplay;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public ResultSet ticketFetch(ticketDisplay td) throws SQLException {
        String uName= td.getUName();
        String useridsearchquery = "select * from user where username='"+uName+"'";
        DbConnection db3= new DbConnection();
        ResultSet newResult1= db3.retrieve(useridsearchquery);
        newResult1.next();
        String uId= newResult1.getString("user_id");
        String getTicketData="select * from ticket where user_id='"+uId+"'";
        DbConnection db4= new DbConnection();
        ResultSet ticketData=db4.retrieve(getTicketData);
        return ticketData;
               
                
            
}
    
public int deleteTicket(ticket t1) throws SQLException{
    String uName= t1.getUName();
    String useridsearchquery = "select * from user where username='"+uName+"'";
    DbConnection db1= new DbConnection();
    ResultSet newResult1= db1.retrieve(useridsearchquery);
    newResult1.next();
    String uId= newResult1.getString("user_id");
    
    String loc1 = t1.getDeparture();
    String loc2= t1.getDestination();
    String airline= t1.getAirName();
    LocalDate dDate= LocalDate.parse(t1.getDDate());
    DbConnection db = new DbConnection();
    String flightidsearchquery = "select * from flights where destination='"+loc2+"' AND departure_date='"+dDate+"' AND departure='"+loc1+"' AND airline_name='"+airline+"'";
    ResultSet newResult = db.retrieve(flightidsearchquery);
    newResult.next();
    String flightid= newResult.getString("flight_number");
    
    DbConnection db2 = new DbConnection();
    String deleteQuery = "delete from ticket where user_id='"+uId+"' and flight_number='"+flightid+"'";
    db2.manipulates(deleteQuery);
    return 0;
}
}

 
    
