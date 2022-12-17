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

        if (service) {

            super.setPrice(super.getPrice() + 47.59);

        }
        if (super.isRoundTripTicket()) {
            super.setPrice(super.getPrice() * (1.85));
        }
        super.setPrice(super.getPrice() + super.getAirline().getAdditionalPayment());
        super.setPrice(super.getPrice() + super.getDestination().getAdditionalPayment());

        return super.getPrice();
    }
}
