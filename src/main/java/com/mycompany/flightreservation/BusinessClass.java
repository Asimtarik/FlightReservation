/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightreservation;

/**
 *
 * @author Lenovo
 */
public class BusinessClass extends Ticket {

    boolean meetingroom;
    boolean luxuryservice;

    public BusinessClass(int price, Airport airport, Airline airline) {
        super(300, airport, airline);
    }

    public double getTotalPriceB() {

        if (meetingroom) {

            super.setPrice(super.getPrice() + 157.23);

        }
        if (luxuryservice) {

            super.setPrice(super.getPrice() + 112.49);

        }

        if (super.isRoundTripTicket()) {
            super.setPrice(super.getPrice() * 1.85);
        }
        super.setPrice(super.getPrice() + super.getAirline().getAdditionalPayment());
        super.setPrice(super.getPrice() + super.getDestination().getAdditionalPayment());
        
        return getPrice();

    }

}
