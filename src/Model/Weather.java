/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class Weather {
    private String weather_location;
    //private String weather_temperature;
    //private String weather_forecast;
  

public Weather( String weather_location ){
    
    this.weather_location= weather_location;
//    this.weather_temperature= weather_temperature;
////    
//    this.weather_forecast= weather_forecast;
//    
}
public void setLocation(String newLocation){
    this.weather_location=newLocation;
}
public String getLocation(){
    return this.weather_location;
    
}
//public void setTemperature(String newTemperature){
//    this.weather_temperature=newTemperature;
//}
//public String getTemperature(){
//    return this.weather_temperature;
//}
//
//public void setForecast(String newForecast){
//    this.weather_forecast=newForecast;
//}
//public String getForecast(){
//    return this.weather_forecast;
//}
//
//




}
