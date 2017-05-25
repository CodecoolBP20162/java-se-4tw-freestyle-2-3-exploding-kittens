package com.codecool.airlinemanagement;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by davidkulchar on 2017.05.25..
 */
class FlightAttendantTest {

    @Test
    public void flightAttendantConstructorTest() {
        assertNotNull(new FlightAttendant("Jane Doe"));
    }

    @Test
    public void flightAttendantConstructorTest_moreArguments() {
        FlightAttendant flightAttendant = new FlightAttendant("Jane Doe", "00990022", new Date(), 5000 );
        assertNotNull(flightAttendant);
    }

    @Test
    public void addLanguagesTest(){
        FlightAttendant flightAttendant = new FlightAttendant("Jane Doe", "00990022", new Date(), 5000 );
        assertEquals(2, flightAttendant.getLanguages().size());
    }

}