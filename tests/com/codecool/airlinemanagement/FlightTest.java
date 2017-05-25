package com.codecool.airlinemanagement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FlightTest {

    @Test
    void isReadyToTakeOff_false() {
        Pilot captain = new Pilot("Captain Morgan");
        Pilot coPilot = new Pilot("Co-pilot Stan");
        FlightAttendant flightAttendant = new FlightAttendant("Lucy", Language.SPANISH);
        Flight newFlight = new Flight(captain, coPilot);
        assertFalse(newFlight.isReadyToTakeOff());
    }

    @Test
    void isReadyToTakeOff_true() {
        Pilot captain = new Pilot("Captain Morgan");
        Pilot coPilot = new Pilot("Co-pilot Stan");
        captain.setCompass(true);
        coPilot.setCompass(true);

        FlightAttendant flightAttendant = new FlightAttendant("Lucy", Language.RUSSIAN);
        Flight newFlight = new Flight(captain, coPilot);
        newFlight.addFlightAttendant(flightAttendant);

        assertTrue(newFlight.isReadyToTakeOff());
    }

}