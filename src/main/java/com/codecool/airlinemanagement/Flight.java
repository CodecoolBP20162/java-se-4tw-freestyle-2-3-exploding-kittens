package com.codecool.airlinemanagement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Random;

public class Flight {
    /**
     * <P> Class Flight</>
     * <P>Various static and instance attributes</p>
     * static int counter -- Starts at 10000, with every instance add +1, helps to set flight's id
     * enum language -- set official language of the flight, from the given options
     * int passengers -- random number of passengers between 100 and 250
     * Pilot captain -- Pilot instance
     * Pilot coPilot -- Pilot instance
     * ArrayList flightAttendants -- a list of flightAttendants
     */
    private static int counter = 100000;
    private int id;

    private Language language = Language.ENGLISH;

    private int passengers;
    private Pilot captain;
    private Pilot coPilot;
    private ArrayList<FlightAttendant> flightAttendants = new ArrayList();

    public Language getLanguage() {
        return language;
    }

    public ArrayList<FlightAttendant> getFlightAttendants() {
        return flightAttendants;
    }

    private static final Logger logger = LoggerFactory.getLogger(Flight.class);



    /**
     * <P> Flight Constructor</>
     * Creates a Flight instance with the following data and variables:
     * -sets a random number of passangers between 100-250
     * -generates an id for the flight
     * @param captain -- Pilot instance
     * @param coPilot -- Pilot instance
     *
     */
    public Flight(Pilot captain, Pilot coPilot){
        this.passengers = new Random().nextInt(151) + 100;
        this.captain = captain;
        this.coPilot = coPilot;
        generateId();
        logger.info("{} flight was created. Number of Passengers: {}.",
                this.id, Integer.toString(this.passengers));
    }

    /**
     * generateId()
     * increments id for the flight, by using static variable counter +1
     */
    private void generateId(){
        id = ++counter;
        logger.debug("Generated id {}", id);
    }

    public void addFlightAttendant(FlightAttendant flightAttendant){
        logger.info("Trying to add {} flightAttendant to flight", flightAttendant.name);
        if (this.flightAttendants.size() < 4) {
            logger.debug("Number of flightAttendants: {}", flightAttendants.size());
            this.flightAttendants.add(flightAttendant);
            logger.info("{} flightAttendant added to flight", flightAttendant.name);
        }
    }

    /**
     *isReadyToTakeOff
     * Checks that the flight if ready to take off, by inspecting the following:
     * - both the captain and the coPilot has compass;
     * - all of the flightAttendants speaks the language of the flight;
     * - the number of passengers is between 150 and 220;
     * @return a boolean
     */
    public boolean isReadyToTakeOff(){
        logger.info("Captain {} has compass: {};",
                this.captain.name, this.captain.hasCompass());
        logger.info("CoPilot {} has compass {}", this.coPilot.name, this.coPilot.hasCompass());
        logger.info("Number of passengers {}", this.passengers);
        if (captain.hasCompass() && coPilot.hasCompass() && passengers < 221) {
            for (FlightAttendant flightAttendant : flightAttendants) {
                logger.info("FlightAttendant {} speaks the following languages: {}",
                        flightAttendant.name, flightAttendant.getLanguages().toString());
                if(!flightAttendant.speaksLanguage(language)){
                    logger.debug("FlightAttendant {} doesn't speaks the official language of flight",
                            flightAttendant.name);
                    logger.info("{} flight isn't ready to take off!", this.id);
                    return false;
                }
            } logger.info("{} flight is ready to take off!", this.id);
            return true;
        } logger.info("{} flight is'nt ready to take off!", this.id);
        return false;
    }
}
