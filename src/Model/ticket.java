/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author dell
 */
public class ticket {
    String airName;
    String departureDate;
    String departure;
    String destination;
    String uName;
    
    public ticket(String airName, String departureDate,String departure,String destination,String uName){
        this.airName= airName;
        this.departureDate= departureDate;
        this.departure = departure;
        this.destination= destination;
        this.uName= uName;
    }
    
    public void setAirName(String newAirName){
        this.airName= newAirName;
    }
    
    public String getAirName(){
        return this.airName;
    }
    
    public void setDDate(String newDDate){
        this.departureDate= newDDate;
    }
    
    public String getDDate(){
        return this.departureDate;
    }
    
    public void setDeparture(String newDeparture){
        this.departure= newDeparture;
    }
    
    public String getDeparture(){
        return this.departure;
    }
    
    public void setDestination(String newDestination){
        this.destination= newDestination;
    }
    
    public String getDestination(){
        return this.destination;
    }
    
    public void setUName(String newUName){
        this.uName= uName;
    }
    
    public String getUName(){
        return this.uName;
    }
    
}
