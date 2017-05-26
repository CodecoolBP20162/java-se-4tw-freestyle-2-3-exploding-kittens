package com.codecool.airlinemanagement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class FlightTest {

    @Test
    void isReadyToTakeOff_SpeaksLanguageFalse() {
        com.codecool.airlinemanagement.Pilot captain = new com.codecool.airlinemanagement.Pilot("Captain Morgan");
        Pilot coPilot = new Pilot("Co-pilot Stan");
        captain.setCompass();
        coPilot.setCompass();
        FlightAttendant faLucy = mock(FlightAttendant.class);

        Flight newFlight = new Flight(captain, coPilot);
        when(faLucy.speaksLanguage(newFlight.getLanguage())).thenReturn(false);

        assertFalse(newFlight.isReadyToTakeOff());
    }

    @Test
    void isReadyToTakeOff_true() {
        Pilot captain = new Pilot("Captain Morgan");
        Pilot coPilot = new Pilot("Co-pilot Stan");
        captain.setCompass();
        coPilot.setCompass();

        FlightAttendant faLucy = mock(FlightAttendant.class);
        Flight newFlight = new Flight(captain, coPilot);
        when(faLucy.speaksLanguage(newFlight.getLanguage())).thenReturn(true);
        newFlight.addFlightAttendant(faLucy);


        assertTrue(newFlight.isReadyToTakeOff());
    }

    @Test
    void isAddFlightAttendant_WorksFine(){
        Pilot captain = new Pilot("Captain Morgan");
        Pilot coPilot = new Pilot("Co-pilot Stan");
        FlightAttendant fa_Lucy = new FlightAttendant("Lucy");

        Flight flight = new Flight(captain, coPilot);
        flight.addFlightAttendant(fa_Lucy);
        assertEquals(flight.getFlightAttendants().size(), 1);
    }

}