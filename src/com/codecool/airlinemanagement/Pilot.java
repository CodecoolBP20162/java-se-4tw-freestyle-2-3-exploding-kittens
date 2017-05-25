package com.codecool.airlinemanagement;


public class Pilot extends Employee {


    private boolean compass;


    public boolean isCompass() { return compass;}

    public Pilot(String name){
        super(name);
    }

    public boolean hasCompass() {
        return compass;
    }

    public void setCompass() {
        this.compass = !compass;
    }


}
