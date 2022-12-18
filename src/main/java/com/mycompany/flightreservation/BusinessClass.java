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
        int additionalPayment = 0;
        if (meetingroom) {

            additionalPayment += 157.23;

        }
        if (luxuryservice) {

            additionalPayment += 112.49;

        }
        additionalPayment += super.getAirline().getAdditionalPayment();
        additionalPayment += super.getDestination().getAdditionalPayment();
        super.setPrice(getPrice() + additionalPayment);

        if (super.isRoundTripTicket()) {
            super.setPrice(super.getPrice() * 1.85);
        }

        return getPrice();

    }

}
