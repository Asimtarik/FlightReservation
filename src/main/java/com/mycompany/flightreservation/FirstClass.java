/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightreservation;


public class FirstClass extends Ticket {
static int defaultPrice=500;
    private boolean playstation;
    private boolean unlimitedBaggage;
    private int bedNumber;

    public FirstClass( Airport airport) {
        super(defaultPrice, airport);

    }

    public double getTotalPriceF() {
        double additionalPayment = 0;
        if (isPlaystation()) {
            additionalPayment += 150.97;
        }
        if (isUnlimitedBaggage()) {
            additionalPayment += 200.38;
        }

        additionalPayment += (100 * getBedNumber());

        
        super.setPrice(getPrice() + additionalPayment);

        return getPrice();

    }

   
    public boolean isPlaystation() {
        return playstation;
    }

    
    public void setPlaystation(boolean playstation) {
        this.playstation = playstation;
    }

   
    public boolean isUnlimitedBaggage() {
        return unlimitedBaggage;
    }

    
    public void setUnlimitedBaggage(boolean unlimitedBaggage) {
        this.unlimitedBaggage = unlimitedBaggage;
    }

    
    public int getBedNumber() {
        return bedNumber;
    }

  
    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

}
