package com.codecool.airlinemanagement;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by davidkulchar on 2017.05.25..
 */
class PilotTest {

    @Test
    public void pilotConstructorTest() {
        assertNotNull(new Pilot("John Doe"));
    }

    @Test
    public void pilotConstructorTest_moreArguments() {
        Pilot pilot = new Pilot("John Doe", "00990022", new Date(), 5000 );
        assertNotNull(pilot);
    }

    @Test
    public void pilotHasCompass_withoutSettingUp() {
        Pilot pilot = new Pilot("John Doe", "00990022", new Date(), 5000 );
        assertFalse(pilot.hasCompass());
    }

    @Test
    public void pilotSetCompass() {
        Pilot pilot = new Pilot("John Doe", "00990022", new Date(), 5000 );
        pilot.setCompass();
        assertTrue(pilot.hasCompass());
    }
}