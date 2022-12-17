/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.flightreservation;

public class Passenger {

    private String firstName;
    private String lastName;
    private String adress;
    private int id;
    private int cardNumber;
    private int phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;

    }

    public String getAdress() {
        return adress;
    }

    public int getId() {

        return id;

    }

    public int getCardNumber() {

        return cardNumber;
    }

    public int phoneNumber() {

        return phoneNumber;

    }

    public void setFirstName(String firstName) {
        if (firstName.length() != 0) {
            this.firstName = firstName;

        }
    }

    public void setLastName(String lastName) {
        if (lastName.length() != 0) {
            this.lastName = lastName;

        }
    }

    public void setAdress(String adress) {
        if (adress.length() != 0) {
            this.adress = adress;
        }
    }

    public void setId(int id) {

        this.id = id;

    }

    public void setCardNumber(int cardNumber) {

        this.cardNumber = cardNumber;
    }

    public void setPhoneNumber(int phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

}
