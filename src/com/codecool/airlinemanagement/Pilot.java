package com.codecool.airlinemanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class Pilot extends Employee {
    private static final Logger logger = LoggerFactory.getLogger(Pilot.class);
    /**
     * <p>Pilot class extends Employee</>
     *
     * has only one attribute:
     * boolean compass -- true, if the given pilot has a fancy compass
     */

    private boolean compass;

    /**
     * Pilot Constructor
     * @param name - sets the Pilots name with the help of the Emloyee superclass
     */
    public Pilot(String name){
        super(name);
        logger.info("Pilot {} got registered in system", this.name);
    }

    public Pilot(String name, String phoneNumber, Date birthDate, Integer salary) {
        super(name, phoneNumber, birthDate, salary);
        logger.info("Phone number: {}; BirthDate: {}; Salary: {}", this.phoneNumber, this.birthDate, this.salary);
    }

    /**
     * hasCompass
     * checks that the given instance has compass
     * @return boolean
     */
    public boolean hasCompass() {
        logger.debug("Pilot {} has compass: {}", this.name, compass);
        return compass;
    }

    /**
     * setCompass
     * change the value of the instances compass attribute
     */
    public void setCompass() {
        logger.info("Pilot {}'s compass set to: {}", this.name, !this.compass);
        this.compass = !compass;
    }


}
