package com.codecool.airlinemanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FlightAttendant extends Employee {
    private static final Logger logger = LoggerFactory.getLogger(FlightAttendant.class);

    public Set<Language> getLanguages() {
        return languages;
    }

    /**
     * <P>FlightAttendant -- extends Employee</P>
     * Implements name form its superclass
     * <P>Other attributes:</P>
     * Set languages -- list of languages //enum// the given FlightAttendant speaks
     */
    private Set<Language> languages;

    /**
     *<p> FlightAttendant Constructor</p>
     * @param name - sets by its superclass
     * adds two random languages to the FlightAttendants languages list
     */
    public FlightAttendant(String name){
        super(name);
        addLanguages();
    }

    /**
     * <p>addLanguages</p>
     * adds two random language to its instances set
     * */
    private void addLanguages() {
        this.languages.add(Language.randomLanguage());
        logger.info("{} language added to flightAttendant {}", this.languages.toString(), this.name);
        while (languages.size() != 2) {
            Language secondary = Language.randomLanguage();
            logger.debug("Trying to add {} language added to flightAttendant {}", secondary, this.name);
            languages.add(secondary);
            }
        logger.info("{} flightAttended speaks the following languages {}",
                this.name, this.languages.toString()
        );
        }


    /**
     * speaskLanguage()
     *  checks if the given flightAttendant languages set contains the given language
     * @param lang - Language //enum//
     * @return boolean
     */
    public boolean speaksLanguage(Language lang) {
        logger.debug("Checking if {} flightAttendant speaks the following language: {}.",
        this.name, lang);
        return languages.contains(lang);
    }

}
