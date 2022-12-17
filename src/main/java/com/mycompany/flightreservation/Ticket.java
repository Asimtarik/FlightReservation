/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightreservation;

/**
 *
 * @author Lenovo
 */
public class Ticket {

    private double price;
    private int seatNumber;
    private Passenger passenger;
    private Airport airport;
    private Airline airline;
    private Destination destination;
    private boolean roundTripTicket;

    public Ticket(int price, Airport airport, Airline airline) {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public Airline getAirline() {
        return airline;
    }

    public boolean isRoundTripTicket() {
        return roundTripTicket;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public void setRoundTripTicket(boolean roundTripTicket) {
        this.roundTripTicket = roundTripTicket;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

}
