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
    private boolean meetingroom;
    private boolean luxuryservice;

    public BusinessClass(Airport airport) {
        super(defaultPrice, airport);
    }

    public double getTotalPriceB() {
        int additionalPayment = 0;
        if (isMeetingroom()) {

            additionalPayment += 157.23;

        }
        if (isLuxuryservice()) {

            additionalPayment += 112.49;

        }
     
        additionalPayment += super.getDestination().getAdditionalPayment();
        super.setPrice(getPrice() + additionalPayment);

        if (super.isRoundTripTicket()) {
            super.setPrice(super.getPrice() * 1.85);
        }

        return getPrice();

    }

    public boolean isMeetingroom() {
        return meetingroom;
    }

    
    public void setMeetingroom(boolean meetingroom) {
        this.meetingroom = meetingroom;
    }

  
    public boolean isLuxuryservice() {
        return luxuryservice;
    }


    public void setLuxuryservice(boolean luxuryservice) {
        this.luxuryservice = luxuryservice;
    }
}
    