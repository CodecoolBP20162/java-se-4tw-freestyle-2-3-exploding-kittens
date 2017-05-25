package com.codecool.airlinemanagement;


import java.util.ArrayList;

public class FlightAttendant extends Employee {
    private ArrayList<Language> languages;

    public FlightAttendant(String name){
        super(name);
        addLanguages();
    }

    private void addLanguages() {
        this.languages.add(Language.randomLanguage());
        while (languages.size() != 2) {
            Language secondary = Language.randomLanguage();
            if (!(languages.contains(secondary))) {
                languages.add(secondary);
            }
        }
    }

    public boolean speaksLanguage(Language lang) {
        return languages.contains(lang);
    }

}
