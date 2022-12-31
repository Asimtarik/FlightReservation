/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightreservation;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BusinessClass extends Ticket {
 static int defaultPrice=300;
    boolean meetingroom;
    boolean luxuryservice;

    public BusinessClass(int price, Airport airport) {
        super(defaultPrice, airport);
    }

    public double getTotalPriceB() {
        int additionalPayment = 0;
        if (meetingroom) {

            additionalPayment += 157.23;

        }
        if (luxuryservice) {

            additionalPayment += 112.49;

        }
     
        additionalPayment += super.getDestination().getAdditionalPayment();
        super.setPrice(getPrice() + additionalPayment);

        if (super.isRoundTripTicket()) {
            super.setPrice(super.getPrice() * 1.85);
        }

        return getPrice();

    }
}
    