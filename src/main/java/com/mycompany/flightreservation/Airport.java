/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightreservation;

public class Airport {

    private String airportName;
    private String country;
    private String city;
    private int airportID;

    public Airport() {
        this.airportName = "";
        this.country = "";
        this.city = "";
        this.airportID = 0;
    }

    public Airport(String airportName, int airportID, String city, String country) {

        this.airportName=airportName;
        this.airportID=airportID;
        this.country=country;
        this.city=city;
       
    }

    public void setAirportName(String airportName) {
        if (airportID!= 0) {
            //this.airportID = airportID.toUpperCase();
        }
    }

    public void setCountry(String country) {
        if (country.length() != 0) {
            this.country = country;
        } else {
            System.out.println("Airline name is invalid, please try again.");
        }
    }

    public void setCity(String city) {
        if (city.length() != 0) {
            this.city = city;
        } else {
            System.out.println("City name is invalid, please try again.");
        }
    }

    public void setAirportID(int airportID) {

        if (airportID!= 0) {
            //this.airportID = airportID.toUpperCase();
        } else {
            System.out.println("Airport ID is invalid, please try again.");
        }

    }

    public String getAirportName() {
        return airportName;

    }

    public String getCountry() {
        return country;

    }

    public String getCity() {
        return city;
    }

    public int getAirportID() {
        return airportID;
    }

}
