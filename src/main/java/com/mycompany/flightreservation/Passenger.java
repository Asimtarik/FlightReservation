/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.flightreservation;

import java.util.ArrayList;

public class Passenger extends Users{

   

    private String firstName;
    private String lastName;
    private String adress;
    private int cardNumber;
    private int phoneNumber;
    private ArrayList<Ticket> ticket = new ArrayList();
    
    
   public Passenger(String userName, String password,int id,String firstName, String lastName, String adress, int cardNumber,int phoneNumber){
        super.setUserName(userName);
        super.setPassword(password);
        super.setId(id);
        this.firstName=firstName;
        this.lastName=lastName;
        this.adress=adress;
        this.cardNumber=cardNumber;
        this.phoneNumber=phoneNumber;
    
    }
   public EconomyClass CreateEcoClassReservation(Airport airport,boolean roundtripticket, int seatnumber, boolean service ){
       
       EconomyClass ecoticket= new EconomyClass(airport);
       ecoticket.setPassenger(this);
       ecoticket.setRoundTripTicket(roundtripticket);
       ecoticket.setSeatNumber(seatnumber);
       ecoticket.setService(service);
       
       return ecoticket;
   }
    public BusinessClass CreateBusinessClassReservation(Airport airport,boolean roundtripticket, int seatnumber, boolean luxuryservice, boolean meetingroom ){
       
      BusinessClass businessticket= new BusinessClass(airport); 
       businessticket.setPassenger(this);
       businessticket.setRoundTripTicket(roundtripticket);
       businessticket.setSeatNumber(seatnumber);
       businessticket.setLuxuryservice(luxuryservice);
       businessticket.setMeetingroom(meetingroom);
        return businessticket;
   }
     public FirstClass CreateFirstClassReservation(Airport airport,boolean roundtripticket, int seatnumber,
             boolean playstation,boolean unlimitedBaggage,int bedNumber  ){
       
      FirstClass firstclassticket= new FirstClass(airport);
       firstclassticket.setPassenger(this);
       firstclassticket.setRoundTripTicket(roundtripticket);
       firstclassticket.setSeatNumber(seatnumber);
       firstclassticket.setPlaystation(playstation);
       firstclassticket.setUnlimitedBaggage(unlimitedBaggage);
       firstclassticket.setBedNumber(bedNumber);
       return firstclassticket;
       
       
   }
     public void listReservations(){
         for (Ticket ticket1 : getTicket()) {
             System.out.println("airport name: "+ ticket1.getAirport().getAirportName());
             System.out.println("country: "+ticket1.getAirport().getCountry());
             System.out.println("city: "+ ticket1.getAirport().getCity());
             System.out.println("airport ID: "+ ticket1.getAirport().getAirportID());
             System.out.println("First name: "+ ticket1.getPassenger().getFirstName()+"Last name: "+ ticket1.getPassenger().getLastName() );
             System.out.println("Price: "+ ticket1.getPrice());
             System.out.println("Round Trip Ticket: "+ ticket1.isRoundTripTicket());
             System.out.println("Additional Services: ");
             
             if(ticket1 instanceof EconomyClass){
                 EconomyClass ecoticket=(EconomyClass)ticket1;
                 
                 System.out.println("Services: "+ ecoticket.isService());
                 
             }
             else if(ticket1 instanceof BusinessClass){
                 BusinessClass businessticket=(BusinessClass)ticket1;
                 
                 System.out.println("Luxury services: "+ businessticket.isLuxuryservice());
                 System.out.println("Meeting room: "+ businessticket.isMeetingroom());
                 
             }else if(ticket1 instanceof FirstClass){
                 FirstClass firstclassticket=(FirstClass)ticket1;
                 System.out.println("Playstation: "+ firstclassticket.isPlaystation());
                 System.out.println("Unlimited Baggage: "+ firstclassticket.isUnlimitedBaggage());
                 System.out.println("Bed Count: "+ firstclassticket.getBedNumber());
             }
             
             System.out.println("");
             
         }
         
         
     }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;

    }

    public String getAdress() {
        return adress;
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

    public void setCardNumber(int cardNumber) {

        this.cardNumber = cardNumber;
    }

    public void setPhoneNumber(int phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the ticket
     */
    public ArrayList<Ticket> getTicket() {
        return ticket;
    }

}
