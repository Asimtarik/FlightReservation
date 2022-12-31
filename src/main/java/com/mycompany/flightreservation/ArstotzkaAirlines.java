/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flightreservation;

import com.mycompany.flightreservation.Booking;
import java.util.Scanner;

public class ArstotzkaAirlines {

    private static Users account;
    private static String accountType;

    private static Scanner sc = new Scanner(System.in);

    private static void Register() {

        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        System.out.print("Firstname: ");
        String firstName = sc.nextLine();

        System.out.print("Lastname: ");
        String lastName = sc.nextLine();

        System.out.print("Adress: ");
        String adress = sc.nextLine();

        System.out.print("ID: ");
        int id = sc.nextInt();

        System.out.print("Card Number: ");
        int cardNumber = sc.nextInt();

        System.out.print("Phone Number: ");
        int phoneNumber = sc.nextInt();

        Booking.createAcc(username, password, firstName, lastName, adress, id, cardNumber, phoneNumber);

    }

    private static void Login() {
        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        account = Booking.Login(username, password);
        if (account != null) {
            userInterface();
        } else {
            System.out.println("Invalid username or password!!!");
        }
    }

    public static void main(String[] args) {

        Admin admin = new Admin();
        admin.setId(0);
        admin.setUserName("Asim");
        admin.setPassword("asd");

        Booking.getUsersArray().add(admin);
        Login();
    }

    public static void userInterface() {
        try {
            while (true) {
                int input;
                if (account instanceof Admin) {

                    Admin adminAccount = (Admin) account;

                    System.out.println("""
                                   Press 1 to add or remove Airport
                                   Press 2 to change ticket price
                                   Press 3 to add or remove passenger
                                   Press 4 to log out""");
                    input = sc.nextInt();

                    switch (input) {

                        case 1:
                            System.out.println("""
                                               Press 1 to add new Airport
                                               Press 2 to remove Airport""");
                            input = sc.nextInt();

                            switch (input) {

                                case 1:
                                    System.out.print("Airport Name: ");
                                    String airportName = sc.nextLine();
                                    airportName = sc.nextLine();
                                    System.out.print("Airport ID: ");
                                    int airportID = sc.nextInt();

                                    System.out.print("City: ");
                                    String city = sc.nextLine();

                                    System.out.print("Country: ");
                                    String country = sc.nextLine();

                                    adminAccount.addAirport(airportName, airportID, city, country);

                                    continue;

                                case 2:
                                    System.out.println("Please type airport name.");
                                    String removeAirport = sc.nextLine();
                                    adminAccount.removeAirport(removeAirport);

                                    continue;

                                default:
                                    System.out.println("Invalid number!!! Please try again.");
                                    continue;
                            }

                        case 2:
                            System.out.println("""
                                               Press 1 to change EconomyClass ticket price.
                                               Press 2 to change BusinessClass ticket price.
                                               Press 3 to change FirstCalss ticket price.
                                                  """);
                            input = sc.nextInt();

                            switch (input) {

                                case 1:
                                    System.out.println("""
                                                       Please enter new price.
                                                         """);
                                    int newPriceEco = sc.nextInt();

                                    EconomyClass.defaultPrice = newPriceEco;

                                    continue;

                                case 2:
                                    System.out.println("""
                                                       Please enter new price.
                                                         """);
                                    int newPriceBusiness = sc.nextInt();

                                    BusinessClass.defaultPrice = newPriceBusiness;

                                    continue;

                                case 3:
                                    System.out.println("""
                                                       Please enter new price.
                                                         """);
                                    int newPriceFirst = sc.nextInt();

                                    FirstClass.defaultPrice = newPriceFirst;

                                    continue;

                                default:
                                    System.out.println("Invalid number!!! Please try again.");
                                    continue;
                            }

                        case 3:
                            System.out.println("""
                                               Press 1 to add new passenger.
                                               Press 2 to remove passenger.""");
                            input = sc.nextInt();
                            switch (input) {
                                case 1:
                                    System.out.print("Username: ");
                                    String username = sc.nextLine();

                                    System.out.print("Password: ");
                                    String password = sc.nextLine();

                                    System.out.print("Firstname: ");
                                    String firstName = sc.nextLine();

                                    System.out.print("Lastname: ");
                                    String lastName = sc.nextLine();

                                    System.out.print("Adress: ");
                                    String adress = sc.nextLine();

                                    System.out.print("ID: ");
                                    int id = sc.nextInt();

                                    System.out.print("Card Number: ");
                                    int cardNumber = sc.nextInt();

                                    System.out.print("Phone Number: ");
                                    int phoneNumber = sc.nextInt();

                                    adminAccount.addPassenger(username, password, id, firstName, lastName, adress, cardNumber, phoneNumber);
                                    continue;

                                case 2:
                                    System.out.println("Please type passenger id.");
                                    int removePassenger = sc.nextInt();
                                    adminAccount.removePassenger(removePassenger);

                                    continue;
                                default:
                                    System.out.println("Invalid number!!! Please try again.");
                                    continue;

                            }

                        case 4:
                            account = null;
                            adminAccount = null;

                            Login();
                            return;

                        default:
                            System.out.println("Invalid number!!! Please try again.");

                    }

                } else {

                }

            }

        } catch (Exception e) {
            System.out.println("Unexpected error occured!!!");
            e.printStackTrace();
            Login();
        }
    }

}
