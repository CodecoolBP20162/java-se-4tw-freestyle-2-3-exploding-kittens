package com.codecool.airlinemanagement;


import java.util.Date;

public abstract class Employee {
    String name;
    String phoneNumber;
    Date birthDate;
    Integer salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String phoneNumber, Date birthDate, Integer salary) {
        this(name);
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.salary = salary;
    }
}
