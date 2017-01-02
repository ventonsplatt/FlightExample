package com.company.classes;

/**
 * Created by gooch_a on 23/12/2016.
 */
public class CargoFlight extends Flight {
    int seats;
    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;

    @Override       // this tells java that there should be a corresponding method in hte base class
    int getSeats(){
        return 12;
    }

public CargoFlight(){
 };



    public void add1Package(float h, float w, float d){
        float size = h * w * d;
        if(hasCargoSapce(size)){
            usedCargoSpace += size;
        }
    }

    public float getUsedCargoSpace(){
        return usedCargoSpace;
    }


    private boolean hasSeating(){
        return passengers < getSeats();
    }

    private boolean hasCargoSapce(float size){
        return (usedCargoSpace + size) <= maxCargoSpace;
    }

    private void handleNoSpace(){
        System.out.println("No cargo space available");
    }
}
