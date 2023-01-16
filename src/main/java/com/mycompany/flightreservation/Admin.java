/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightreservation;

import java.util.ArrayList;
import com.mycompany.flightreservation.Booking;

public class Admin extends Users {
    
    
       
    public void addAirport(String airportName, int airportID, String city, String country){
        Airport airport=new Airport(airportName, airportID,  city, country);
        Booking.airports.add(airport);
        System.out.println("Airport successfully added.");
    }
    
    
    public void removeAirport(String airportName){
        for (int i = 0; i <Booking.airports.size(); i++) {
            if (airportName.equals(Booking.airports.get(i).getAirportName())) {
                Booking.airports.remove(i);
            }
             
        }
       
        
    }
    
    public void addPassenger(String userName, String password,int id,String firstName, String lastName, String adress, int cardNumber,int phoneNumber){
        Passenger passenger= new Passenger(userName,password,id,firstName,lastName,adress,cardNumber,phoneNumber);
         Booking.users.add(passenger);
            
        }
        public void removePassenger(int id){
            for (int i = 0; i <Booking.getUsersArray().size(); i++) {
            if (id==Booking.getUsersArray().get(i).getId()) {
                Booking.airports.remove(i);
            }
             
        }
       
            
            
        
}
    }

