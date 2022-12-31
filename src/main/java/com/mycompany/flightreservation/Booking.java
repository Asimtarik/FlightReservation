/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightreservation;

import java.util.ArrayList;

public class Booking {

    static private ArrayList<Users> users = new ArrayList();
    static private ArrayList<Ticket> ticket = new ArrayList();

    static public void createAcc(String userName, String password, String firstName, String lastName, String adress, int id, int cardNumber, int phoneNumber) {
        Passenger passenger = new Passenger(userName, password, id, firstName, lastName, adress, cardNumber, phoneNumber);
        users.add(passenger);

    }

    public void setPassengers(Users user) {
        this.users.add(user);
    }

    static public ArrayList<Users> getUsersArray() {

        return users;
    }

    static public Users Login(String username, String password) {

        for (Users user : users) {
            if (user.getPassword().equals(password) && user.getUserName().equals(username)) {
                return user;

            }

        }
        return null;

    }

}
