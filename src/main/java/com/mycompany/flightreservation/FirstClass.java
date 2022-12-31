/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightreservation;


public class FirstClass extends Ticket {
static int defaultPrice=500;
    boolean playstation;
    boolean unlimitedBaggage;
    int bedNumber;

    public FirstClass(int price, Airport airport) {
        super(defaultPrice, airport);

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

        
        additionalPayment += super.getDestination().getAdditionalPayment();
        super.setPrice(getPrice() + additionalPayment);

        return getPrice();

    }

}
