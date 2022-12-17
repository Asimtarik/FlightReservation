/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightreservation;

public class EconomyClass extends Ticket {

    boolean service;

    public EconomyClass(Airport airport, Airline airline) {
        super(150, airport, airline);
    }

    public double getTotalPriceE() {
        double additionalPayment = 0;
        if (service) {

            additionalPayment += 47.59;

        }
        additionalPayment += super.getAirline().getAdditionalPayment();
        additionalPayment += super.getDestination().getAdditionalPayment();
        super.setPrice(getPrice() + additionalPayment);

        if (super.isRoundTripTicket()) {
            super.setPrice(super.getPrice() * (1.85));
        }

        return super.getPrice();
    }
}
