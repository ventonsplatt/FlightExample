package com.company.classes;

import java.util.SplittableRandom;

/**
 * Created by gooch_a on 22/12/2016.
 */
public class Passenger {

    private boolean reservedSeat;
    private String seatReservation;


    // this is an exercise in constructors
    public Passenger(){
        // empty constructor
        reservedSeat = false;
        seatReservation = "";
    }

    public Passenger(boolean reservedSeat){
        this.reservedSeat = reservedSeat;
    }

    public Passenger(boolean reservedSeat, String seatReservation){
       this(reservedSeat);                    // this calls the constructor with the reservedSeat parameter
        this.seatReservation = seatReservation;
    }

    // getters and setters


    public void unsetReservedSeat(){
        reservedSeat = false;
        seatReservation = "";
    }

    public boolean getReservedSeat(){
        return reservedSeat;
    }

    public String getSeatReservation(){
        return seatReservation;
    }

    public void setSeatReservation(String seatReservation){
        this.reservedSeat = true;
        this.seatReservation = seatReservation;
    }


public void handleIncorrectCombo(){
        System.out.println("You must name a seat when making a reservation");
        this.reservedSeat = false;
        return;
}


}
