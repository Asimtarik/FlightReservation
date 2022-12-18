/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightreservation;


class Seat {

    private String seatNumber;
    private boolean suitability;

    public void SeatNumber(String seatNumber) {

        if (seatNumber.length() != 0) {
            this.seatNumber = seatNumber;

        } else {
            System.out.println("Seat number is invalid.");
        }
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isSuitability() {
        return suitability;
    }

    public void setSuitability(boolean suitability) {
        this.suitability = suitability;
    }

    @Override
    public String toString() {
        return this.getSeatNumber() + "\t" + this.isSuitability();

    }
}
