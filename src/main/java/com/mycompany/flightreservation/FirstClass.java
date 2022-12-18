/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightreservation;


public class FirstClass extends Ticket {

    boolean playstation;
    boolean unlimitedBaggage;
    int bedNumber;

    public FirstClass(int price, Airport airport, Airline airline) {
        super(500, airport, airline);

    }

    public double getTotalPriceF() {
        double additionalPayment = 0;
        if (playstation) {
            additionalPayment += 150.97;
        }
        if (unlimitedBaggage) {
            additionalPayment += 200.38;
        }

        additionalPayment += (100 * bedNumber);

        additionalPayment += super.getAirline().getAdditionalPayment();
        additionalPayment += super.getDestination().getAdditionalPayment();
        super.setPrice(getPrice() + additionalPayment);

        return getPrice();

    }

}
