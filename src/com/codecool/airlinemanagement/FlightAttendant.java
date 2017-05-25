package com.codecool.airlinemanagement;


public class FlightAttendant extends Employee {

    private Language language;

    public FlightAttendant(String name, Language language){
        this.name = name;
        this.language = language;
    }

    public Language getLanguage() {
        return language;
    }

}
