/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightreservation;

/**
 *
 * @author Lenovo
 */
public class FirstClass extends Ticket {

    boolean playstation;
    boolean unlimitedBaggage;
    int bedNumber;

    public FirstClass(int price, Airport airport, Airline airline) {
        super(500, airport, airline);

    }

    public double getTotalPriceF() {

        if (playstation) {
            super.setPrice(super.getPrice() + 150.97);
        }
        if (unlimitedBaggage) {
            super.setPrice(super.getPrice() + 200.38);
        }

        super.setPrice(super.getPrice() + (100 * bedNumber));
        
        super.setPrice(super.getPrice() + super.getAirline().getAdditionalPayment());
        super.setPrice(super.getPrice() + super.getDestination().getAdditionalPayment());

        return getPrice();
        
         
    
    }
    
    

}




