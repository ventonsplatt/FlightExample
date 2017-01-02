package com.company.classes;

/**
 * Created by gooch_a on 21/12/2016.
 */
public class Flight {
    /**
     * Simple class to represent an aeroplane flight population
     */
    public int passengers, flightNumber;
    int seats;
    int getSeats() {
        return 150;
    }
    private char flightClass;
    private boolean[] isSeatAvailable;
    int maxCarryOns = getSeats() * 2, totalCarryOns;

    // this is an initialisation block
    // this code will always execute when the class instance is instantiated
    {
        isSeatAvailable = new boolean[getSeats()];

        for( int i =1; i < getSeats(); i++) {
            isSeatAvailable[i] = true;
        }
    }
    // there is always a return type of a specific datatype
    // void is used when there is no return type
    // returns can be used anywhere in the method
    // return values re always a single value, but can be a primitive type, array or an object

    // constructors
    public Flight(){
    }

    public Flight(int flightNumber){
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass){
        this.flightClass = flightClass;
    }



    // getters and setters can be a verb or an action
    public void add1Passenger() {
        // add a passenger if available
        if (hasSeating()) {
            passengers += 1;
         }
        else
            handleTooMany();

    }



    private boolean hasSeating(){// separate method for checking if there are any seats

        return passengers < getSeats(); // returns true if seats are available
    }

    private boolean hasSeating(int count){ //overloaded to check if multiple passengers can be added

        return (passengers + count) < getSeats(); // returns true if seats are available
    }

    public void addPassengers(Passenger... list){ //this ellipse ststs that there will be a varying array of passenger references
                                                    // this notation can only be used with the last parameter in a list
        if (hasSeating(list.length)){
            passengers += list.length;
        }
        else{
            handleNoFreeSeats();
        }
    }

    public void remove1Passenger() {
        // remove a passenger if some passengers exist
        if (passengers != 0)
            passengers -= 1;
        else
            handleNoFreeSeats();

        return;
    }

    public int getPassengerNumbers() {
        return passengers;
    }

    public int getFreeSeats() {
        // freeSeats is local only to this method
        int freeSeats = 0;
        if (passengers < getSeats()) //
            freeSeats = getSeats() - passengers;
        return freeSeats;
    }

    public Flight mergeFlights(Flight F1, Flight F2) {
        if (F2.passengers > F1.getFreeSeats()) {
            // return error
            handleNoFreeSeats();
        }
        else {
            F1.passengers = F1.passengers + F2.passengers;
            F2.passengers = 0;
            System.out.println("Flights merged successfully");
            System.out.println("Total seats used:" + F1.passengers);

        }
        return F1;
    }

    private void handleTooMany(){
        // what happens when there are no free seats
        System.out.println("No free seats on this flight");
        return;
    }

    private void handleNoFreeSeats(){
        // what happens when there are no free seats
        System.out.println("No free seats on this flight");
        return;
    }



}



