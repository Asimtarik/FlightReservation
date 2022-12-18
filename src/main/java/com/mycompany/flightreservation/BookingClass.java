/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightreservation;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Lenovo
 */
public class BookingClass {

    public class Booking {

        private int reservationID;
        private int numberOfPassengers;
        private Passenger[] passengers;
        private String flightNumber;
        private String dateOfDeparture;
        private Seat[] reservedSeats;

        public Booking() {
        }

        public Booking(int reservationNumber, int numberOfPassengers, Passenger[] passengers, String flightNumber, String dateOfDeparture, Seat[] reservedSeats) {
            this.reservationID = reservationNumber;
            this.numberOfPassengers = numberOfPassengers;
            this.passengers = passengers;
            this.flightNumber = flightNumber;
            this.dateOfDeparture = dateOfDeparture;
            this.reservedSeats = reservedSeats;
        }

        public void setReservationNumber(int reservationNumber) {
            this.reservationID = reservationNumber;
        }

        public void setNumberOfPassengers(int numberOfPassengers) {
            this.numberOfPassengers = numberOfPassengers;
        }

        public void setPassengers(Passenger[] passengers) {
            this.passengers = passengers;
        }

        public void setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
        }

        public void setDepartureDate(int year, int month, int day) {
            SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");     //Defines the date format needed
            Calendar calendar1 = new GregorianCalendar(year, month - 1, day);   //creates a date from Calendar class   
            this.dateOfDeparture = sdf.format(calendar1.getTime());
        }

        public void setReservedSeats(Seat[] reservedSeats) {
            this.reservedSeats = reservedSeats;
        }

        public int getReservationNumber() {
            return reservationID;
        }

        public int getNumberOfPassengers() {
            return numberOfPassengers;
        }

        public void getPassengers() {

            for (int i = 0; i < passengers.length; i++) {
                System.out.println(passengers[i]);
            }

        }

        public Passenger[] getPassengersArray() {

            return passengers;
        }

        public String getFlightNumber() {
            return flightNumber;
        }

        public String getDepartureDate() {
            return dateOfDeparture;
        }

        public String[] getReservedSeats() {
            String[] reservedSeatID = new String[this.getNumberOfPassengers()];
            for (int i = 0; i < reservedSeatID.length; i++) {
                reservedSeatID[i] = reservedSeats[i].getSeatNumber();
            }
            return reservedSeatID;
        }

        @Override
        public String toString() {
            String array1 = Arrays.toString(passengers);
            String array2 = Arrays.toString(getReservedSeats());
            return reservationID + "*" + numberOfPassengers + "*" + array1 + "*" + flightNumber + "*" + dateOfDeparture + "*" + array2;
        }

    }
}
