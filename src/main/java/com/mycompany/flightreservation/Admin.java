/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightreservation;

import java.util.ArrayList;


public class Admin extends Users {
    
    
   ArrayList<Airport> airports= new ArrayList(); 
    
    public void addAirport(String airportName, int airportID, String city, String country){
        Airport airport=new Airport(airportName, airportID,  city, country);
        airports.add(airport);
    }
    
    
    public void removeAirport(String airportName){
        for (int i = 0; i <airports.size(); i++) {
            if (airportName.equals(airports.get(i).getAirportName())) {
                airports.remove(i);
            }
             
        }
       
        
    }
    
    public void addPassenger(String userName, String password,int id,String firstName, String lastName, String adress, int cardNumber,int phoneNumber){
        Passenger passenger= new Passenger(userName,password,id,firstName,lastName,adress,cardNumber,phoneNumber);
            
        }
        public void removePassenger(int id){
            for (int i = 0; i <Booking.getUsersArray().size(); i++) {
            if (id==Booking.getUsersArray().get(i).getId()) {
                airports.remove(i);
            }
             
        }
       
            
            
        
}
    }

