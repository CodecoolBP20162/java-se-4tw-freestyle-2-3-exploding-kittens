package com.codecool.airlinemanagement;


import java.util.ArrayList;
import java.util.Random;

public class Flight {
    private static int counter = 0;
    private int id;
    private Language language = Language.RUSSIAN;
    private int passengers = new Random().nextInt(151) + 100;
    private Pilot captain;
    private Pilot coPilot;
    private ArrayList<FlightAttendant> flightAttendants = new ArrayList<>();

    public Flight(Pilot captain, Pilot coPilot){
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
        if (captain.hasCompass() && coPilot.hasCompass() && passengers < 220) {
            for (FlightAttendant flightAttendant : flightAttendants) {
                if(!flightAttendant.getLanguage().equals(this.language)){
                    return false;
                }
            } return true;
        } return false;
    }
}
