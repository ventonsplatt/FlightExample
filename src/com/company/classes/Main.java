package com.company.classes;

public class Main {

    public static void main(String[] args) {

        Flight flight1 = new Flight();

        Flight flight2 = new Flight();



        int passengers1= 0, freeSeats1=0, passengers2=0, freeSeats2=0;


        // loop through
        for (int i=0; i < 110; i++ ){

            flight1.add1Passenger();
            //System.out.println(i);
            //System.out.print("Mod:");
            //System.out.println(i %3 );

            //only add flight 2 if mod 3
             if ((i % 3) == 2){
                 flight2.add1Passenger();
             }

            passengers1 = flight1.getPassengerNumbers();
            freeSeats1 = flight1.getFreeSeats();

            passengers2 = flight2.getPassengerNumbers();
            freeSeats2 = flight2.getFreeSeats();

            // only print out every 10
            if ((i % 10) == 1111) {
                System.out.println("Passengers for flight 1 : " + passengers1);
                System.out.println("Free Seats for flight 1 : " + freeSeats1);
                System.out.println("=======================================");

                System.out.println("Passengers for flight 2 : " + passengers2);
                System.out.println("Free Seats for flight 2 : " + freeSeats2);
                System.out.println("=======================================");
            }

        }

        System.out.println("Passengers for flight 1 : " + passengers1);
        System.out.println("Free Seats for flight 1 : " + freeSeats1);
        System.out.println("=======================================");

        System.out.println("Passengers for flight 2 : " + passengers2);
        System.out.println("Free Seats for flight 2 : " + freeSeats2);
        System.out.println("=======================================");

        System.out.println("trying flight merge....");
        flight1.mergeFlights(flight1, flight2);


        passengers1 = flight1.getPassengerNumbers();
        freeSeats1 = flight1.getFreeSeats();
        passengers2 = flight2.getPassengerNumbers();
        freeSeats2 = flight2.getFreeSeats();

        System.out.println("Passengers for flight 1 : " + passengers1);
        System.out.println("Free Seats for flight 1 : " + freeSeats1);
        System.out.println("=======================================");

        System.out.println("Passengers for flight 2 : " + passengers2);
        System.out.println("Free Seats for flight 2 : " + freeSeats2);
        System.out.println("=======================================");

        // now for some passenger action

        Passenger amy = new Passenger();        // no seat reservation
        // initial conditions - blank constructor called
        System.out.println("Initial state: --------------------------");
        System.out.println(amy.getReservedSeat());
        System.out.println("--| " + amy.getSeatReservation() + " |--");
        // now just apply a reservation
        amy.setSeatReservation("B45");
        System.out.println("Seat directly reserved: --------------------------");
        System.out.println(amy.getReservedSeat());
        System.out.println("--| " + amy.getSeatReservation() + " |--");
        // now unset it
        amy.unsetReservedSeat();
        System.out.println("Seat now unreserved: --------------------------");
        System.out.println(amy.getReservedSeat());
        System.out.println("--| " + amy.getSeatReservation() + " |--");
        // now just apply a reservation
        amy.setSeatReservation("C45");
        System.out.println("Seat directly reserved: --------------------------");
        System.out.println(amy.getReservedSeat());
        System.out.println("--| " + amy.getSeatReservation() + " |--");


        // check that the initialisation block executes
        System.out.print("Free seats:");
        System.out.println(flight1.getFreeSeats());


        Passenger george = new Passenger();
        Passenger steve = new Passenger();
        Passenger gerald = new Passenger();

        Flight f = new Flight();
        f.addPassengers(george, steve, gerald);
        System.out.println("added 3 passengers in a group: --------------------------");
        // check that the initialisation block executes
        System.out.print("Free seats:");
        System.out.println(f.getFreeSeats());

        // and now with the cargo flights....
        System.out.println("cargo flights: --------------------------");
        CargoFlight cf = new CargoFlight();
        cf.add1Package(1.0f, 2.5f, 3.0f);
        cf.add1Passenger();
        System.out.println("Used Cargo Space:");
        System.out.print(cf.getUsedCargoSpace());
        System.out.println("");

        Flight g = new CargoFlight();
        // you can create a reference to a flight as a new CargoFlight
        // it will only have the
        // can only use capabilities visible to the flight class

        // can be used in following example
        Flight [] squadron  = new Flight[5];  // an array of flights
        squadron[0] = new Flight(213);
        squadron[1] = new Flight(43);
        squadron[2] = new CargoFlight();
        squadron[3] = new Flight(432);
        squadron[4] = new Flight(432);


        // overriding methods
        // the getSeats() method can be overriden to provide the class-specific variable value (e.g. to return 12 seats rather than the 150 a flight has)
        System.out.println("inherited : --------------------------");
        Flight f4 = new Flight();
        f4.add1Passenger();
        System.out.println("flight passengers: ");
        System.out.println(f4.passengers);
        System.out.println(f4.getFreeSeats());

        CargoFlight cf4 = new CargoFlight();
        cf4.add1Passenger();
        System.out.println("cargo passengers: ");
        System.out.println(cf4.passengers);
        System.out.println(cf4.getFreeSeats());

        System.out.println("changed objects : --------------------------");
        Object o = new CargoFlight();
        if (o instanceof CargoFlight) { // a way to check if there is an instance of cargoflight
            CargoFlight cf5 = (CargoFlight) o;
            for (int i = 0; i < 8; i++){
                cf5.add1Passenger();
            }
            System.out.println(cf5.passengers);
            System.out.println(cf5.getFreeSeats());
        }






    }
}
