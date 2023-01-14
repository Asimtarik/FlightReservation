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
        String username = sc.next();

        System.out.print("Password: ");
        String password = sc.next();

        account = Booking.Login(username, password);
        if (account != null) {
            userInterface();
        } else {
            System.out.println("Invalid username or password!!!");
            Login();
        }
    }

    public static void main(String[] args) {
        int input;
        Admin admin = new Admin();
        admin.setId(0);
        admin.setUserName("Asim");
        admin.setPassword("asd");

        Passenger passenger = new Passenger("Asim", "Tarik", 4, "Asim", "Kutluer", "İstanbul", 1, 2);

        Booking.getUsersArray().add(admin);
        Booking.getUsersArray().add(passenger);
        Login();

        System.out.println("""
                             1- Press 1 to Login.
                             2- Press 2 to Register.
                  """);
        input = sc.nextInt();

        switch (input) {

            case 1:
                Login();

            case 2:
                Register();

        }

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
                                    city = sc.nextLine();
                                    System.out.print("Country: ");
                                    String country = sc.nextLine();

                                    adminAccount.addAirport(airportName, airportID, city, country);

                                    continue;

                                case 2:
                                    System.out.println("Please type airport name.");
                                    String removeAirport = sc.nextLine();
                                    removeAirport = sc.nextLine();
                                    adminAccount.removeAirport(removeAirport);
                                    System.out.println("Airport deleted successfully");

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
                                    System.out.println("Default Price changed successfully.");
                                    continue;

                                case 2:
                                    System.out.println("""
                                                       Please enter new price.
                                                         """);
                                    int newPriceBusiness = sc.nextInt();

                                    BusinessClass.defaultPrice = newPriceBusiness;
                                    System.out.println("Default Price changed successfully.");
                                    continue;

                                case 3:
                                    System.out.println("""
                                                       Please enter new price.
                                                         """);
                                    int newPriceFirst = sc.nextInt();

                                    FirstClass.defaultPrice = newPriceFirst;
                                    System.out.println("Default Price changed successfully.");

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
                                    username = sc.nextLine();

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
                                    System.out.println("New passenger registered.");
                                    continue;

                                case 2:
                                    System.out.println("Please type passenger id.");
                                    int removePassenger = sc.nextInt();
                                    adminAccount.removePassenger(removePassenger);
                                    System.out.println("Passenger deleted.");
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
                            Login();

                    }

                } else if (account instanceof Passenger) {

                    Passenger passengerAccount = (Passenger) account;
                    System.out.println("""
                                   Press 1 to create new reservation.
                                   Press 2 to list reservations.
                                   Press 3 to log out""");
                    input = sc.nextInt();

                    switch (input) {

                        case 1:
                            Booking.ListAirport();

                            System.out.print("Choose airport: ");
                            input = sc.nextInt();
                            Airport airport = Booking.airports.get(input - 1);
                            System.out.println("Is it round trip ticket? Press 1-Yes 2-No");
                            input = sc.nextInt();

                            boolean isRoundTripTicket = (input == 1);

                            System.out.println("Please enter seat number");

                            int seatnumber = sc.nextInt();

                            System.out.println("""
                                               Press 1 to choose Economyclass ticket.
                                               Press 2 to choose Businessclass ticket.
                                               Press 3 to choose FirstClass ticket.
                                               """);
                            input = sc.nextInt();
                            switch (input) {

                                case 1:

                                    boolean service = (input == 1);

                                    EconomyClass economyClass = passengerAccount.CreateEcoClassReservation(airport, isRoundTripTicket, seatnumber, service);
                                    economyClass.setPrice(economyClass.getTotalPriceE());
                                    System.out.println("Price: " + economyClass.getPrice());

                                    System.out.println("Do you confirm? Press 1-Yes 2-No");
                                    input = sc.nextInt();

                                    boolean choice = (input == 1);
                                    if (choice) {
                                        passengerAccount.getTicket().add(economyClass);
                                        break;
                                    }
                                case 2:

                                    System.out.println("Is luxury service included? Press 1-Yes 2-No");
                                    input = sc.nextInt();

                                    boolean luxuryservice = (input == 1);
                                    System.out.println("Is meetingroom included? Press 1-Yes 2-No");
                                    input = sc.nextInt();

                                    boolean meetingroom = (input == 1);
                                    BusinessClass businessClass = passengerAccount.CreateBusinessClassReservation(airport, isRoundTripTicket, seatnumber, luxuryservice, meetingroom);

                                    System.out.println("Price: " + businessClass.getTotalPriceB());

                                    System.out.println("Do you confirm? Press 1-Yes 2-No");
                                    input = sc.nextInt();

                                    boolean choice1 = (input == 1);
                                    if (choice1) {
                                        passengerAccount.getTicket().add(businessClass);
                                        break;
                                    }
                                case 3:

                                    System.out.println("Is playstation included? Press 1-Yes 2-No");
                                    input = sc.nextInt();

                                    boolean playstation = (input == 1);
                                    System.out.println("Is unlimited baggage included? Press 1-Yes 2-No");
                                    input = sc.nextInt();

                                    boolean unlimitedBaggage = (input == 1);
                                    System.out.println("Please enter the bed count.");
                                    int bedNumber = sc.nextInt();
                                    FirstClass firstClass = passengerAccount.CreateFirstClassReservation(airport, isRoundTripTicket, seatnumber, playstation, unlimitedBaggage, bedNumber);
                                    System.out.println("Price: " + firstClass.getTotalPriceF());

                                    System.out.println("Do you confirm? Press 1-Yes 2-No");
                                    input = sc.nextInt();

                                    boolean choice2 = (input == 1);
                                    if (choice2) {
                                        passengerAccount.getTicket().add(firstClass);
                                        break;
                                    }
                            }
                        case 2:
                            passengerAccount.listReservations();

                        case 3:
                            account = null;
                            passengerAccount = null;

                            Login();
                            return;

                        default:
                            System.out.println("Invalid number!!! Please try again.");

                    }

                }

            }

        } catch (Exception e) {
            System.out.println("Unexpected error occured!!!");
            e.printStackTrace();
            Login();
        }
    }

}
