package com.codecool.airlinemanagement;


public class Pilot extends Employee {

    private boolean compass;

    public Pilot(String name){
        this.name = name;
    }

    public boolean hasCompass() {
        return compass;
    }
    public void setCompass(boolean compass) {
        this.compass = compass;
    }


}
