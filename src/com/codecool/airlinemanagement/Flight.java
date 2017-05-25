package com.codecool.airlinemanagement;


import java.util.ArrayList;
import java.util.Random;

public class Flight {


    /**
     * <P> Class Flight</>
     * <P>Various static and instance attributes</>
     * static int counter -- Starts at 10000, with every instance add +1, helps to set flight's id
     * enum language -- set official language of the flight, from the given options
     * int passangers -- random number of passangers between 100 and 250
     * Pilot captain -- Pilot instance - sets
     */
    private static int counter = 100000;
    private int id;
    private Language language = Language.ENGLISH;
    private int passengers;
    private Pilot captain;
    private Pilot coPilot;
    private ArrayList<FlightAttendant> flightAttendants = new ArrayList<>();

    public Flight(Pilot captain, Pilot coPilot){
        this.passengers = new Random().nextInt(151) + 100
        this.captain = captain;
        this.coPilot = coPilot;
        generateId();
    }

    private void generateId(){
        id = ++counter;
    }

    public void addFlightAttendant(FlightAttendant flightAttendant){
        if (this.flightAttendants.size() < 4) {
            this.flightAttendants.add(flightAttendant);
        }
    }

    public boolean isReadyToTakeOff(){
        if (captain.hasCompass() && coPilot.hasCompass() && passengers < 221) {
            for (FlightAttendant flightAttendant : flightAttendants) {
                if(!flightAttendant.speaksLanguage(language)){
                    return false;
                }
            } return true;
        } return false;
    }
}
