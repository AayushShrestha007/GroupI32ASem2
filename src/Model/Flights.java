/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author dell
 */
public class Flights {
    private String flights_destination;
    private String flights_departure;
    private String flights_departure_date;
//    private String flights_duration;
//    private String flights_cabin_capacity;
//    private String flights_checkin_capacity;
//    private Boolean flights_refundable;
//    private String flights_airlines_name;
//    private String flights_departure_time;
//    private String flights_arrival_time;
    
//    private int flights_economy_price;
//    private int flights_business_price;
//    private String flights_flight_type;
    


public Flights( String flights_destination,
    String flights_departure,
//    String flights_duration,
//    String flights_cabin_capacity,
//    String flights_checkin_capacity,
//    Boolean flights_refundable,
//    String flights_airlines_name,
//    String flights_departure_time,
//    String flights_arrival_time,
   
//    int flights_economy_price,
//    int flights_business_price,
//    String flights_flight_type
     String flights_departure_date){
    
    this.flights_destination= flights_destination;
    this.flights_departure= flights_departure;
//    this.flights_duration=flights_duration;
//    this.flights_cabin_capacity=flights_cabin_capacity;
//    this.flights_checkin_capacity=flights_checkin_capacity;
//    this.flights_refundable=flights_refundable;
//    this.flights_airlines_name=flights_airlines_name;
//    this.flights_departure_time=flights_departure_time;
//    this.flights_arrival_time= flights_arrival_time;
    this.flights_departure_date= flights_departure_date;
//    this.flights_economy_price=flights_economy_price;
//    this.flights_business_price=flights_business_price;
//    this.flights_flight_type=flights_flight_type;
}

//setter and getter for destination
public void setDestination(String newDestination){
    this.flights_destination=newDestination;
}
public String getDestination(){
    return this.flights_destination;
}

//setter and getter for departure
public void setDeparture(String newDeparture){
    this.flights_departure=newDeparture;
}
public String getDeparture(){
    return this.flights_departure;
}

//setter and getter for departuredate
public void setDepartureDate(String newDepartureDate){
    this.flights_departure_date=newDepartureDate;
}
public String getDepartureDate(){
    return this.flights_departure_date;
}

//setter and getter for destination
//public void setDestination(String newDestination){
//    this.flights_destination=newDestination;
//}
//public String getDestination(){
//    return this.flights_destination;
//}

//setter and getter for destination
//public void setCabinCapacity(String newCabinCapacity){
//    this.flights_cabin_capacity=newCabinCapacity;
//}
//public String getCabinCapacity(){
//    return this.flights_cabin_capacity;
//}



//setter and getter for destination
//public void setDestination(String newDestination){
//    this.flights_destination=newDestination;
//}
//public String getDestination(){
//    return this.flights_destination;
//}




}