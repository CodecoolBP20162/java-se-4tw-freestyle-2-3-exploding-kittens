package com.codecool.airlinemanagement;

import static org.junit.jupiter.api.Assertions.*;


class FlightTest {
    @org.junit.jupiter.api.Test
    void isReadyToTakeOff_false() {
        Pilot captain = new Pilot("Captain Morgan");
        Pilot coPilot = new Pilot("Co-pilot Stan");
        FlightAttendant flightAttendant = new FlightAttendant("Lucy", Language.SPANISH);
        Flight newFlight = new Flight(captain, coPilot);
        assertFalse(newFlight.isReadyToTakeOff());
    }

    @org.junit.jupiter.api.Test
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