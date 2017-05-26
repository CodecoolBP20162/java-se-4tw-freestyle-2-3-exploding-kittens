package com.codecool.airlinemanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Date;

public abstract class Employee {

    private static final Logger logger = LoggerFactory.getLogger(Employee.class);
    /**
     * <P>Employee -- Abstract Class</P>
     * The following rules applies for the Constructors:
     * <p>Obligatory argument:</p>
     * String name -- sets the name of the given Employee;
     * <p>Non obligatory arguments:</p>
     * String phonenumber --  -||-||-;
     * Date birthDate  -- -||-||-;
     * int salary --  -||-||-;
     */
    String name;
    String phoneNumber;
    Date birthDate;
    Integer salary;

    public Employee(String name) {
        this.name = name;
        logger.info("{} employee got registered in system", this.name);
    }

    public Employee(String name, String phoneNumber, Date birthDate, Integer salary) {
        this(name);
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.salary = salary;
        logger.info("Phone number: {}; BirthDate: {};", this.phoneNumber, this.birthDate);
    }
}
