/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightreservation;

public class Airport {

    private String airportName;
    private String country;
    private String city;
    private String airportID;

    public Airport() {
        this.airportName = "";
        this.country = "";
        this.city = "";
        this.airportID = "";
    }

    public Airport(String airportName, String airportID, String city, String country) {

        this.setAirportName(airportName);
        this.setCountry(country);
        this.setCity(city);
        this.setAirportID(airportID);
    }

    public void setAirportName(String airportName) {
        if (airportID.length() != 0) {
            this.airportID = airportID.toUpperCase();
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

    public void setAirportID(String airportID) {

        if (airportID.length() != 0) {
            this.airportID = airportID.toUpperCase();
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

    public String getAirportID() {
        return airportID;
    }

}
