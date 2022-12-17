/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightreservation;

public class Airline {

    private String airlineID;
    private String airlineName;
    private int additionalPayment;

    public Airline() {
        this.airlineID = "";
        this.airlineName = "";
    }

    public void setAirlineID(String airlineID) {

        if (airlineID.length() != 0) {
            this.airlineID = airlineID;
        } else {
            System.out.println("Airline ID is invalid, please try again.");
        }

    }

    public void setAirlineName(String airlineName) {

        if (airlineName.length() != 0) {
            this.airlineName = airlineName;
        } else {
            System.out.println("Airline name is invalid, please try again.");
        }

    }

    public void setAdditionalPayment(int additionalPayment) {
        this.additionalPayment = additionalPayment;
    }

    public String getAirlineID() {
        return airlineID;
    }

    public String getAirlineName() {
        return airlineName;
    }

 
    public int getAdditionalPayment() {
 
        return additionalPayment;
    }

}
