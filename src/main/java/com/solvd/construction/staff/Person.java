package com.solvd.construction.staff;


import com.solvd.construction.exceptions.EFirstNameIsNuLLException;
import com.solvd.construction.exceptions.ELastNameIsNullException;

import java.util.Scanner;
import java.util.logging.Logger;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Person.class));

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String enterFirstName() {
        try {
            Scanner scanner = new Scanner(System.in);
            String firstName = scanner.nextLine();
            if (firstName == null) ;
            throw new EFirstNameIsNuLLException("Enter the last name correctly! ");
        } catch (EFirstNameIsNuLLException e) {
            LOGGER.info(e.getMessage());
        } finally {
            try {
                Scanner scanner = new Scanner(System.in);
                String firstName = scanner.nextLine();
                LOGGER.info("FirstName " + firstName);
            } finally {
                return firstName;
            }
        }
    }

    public String enterLastName() {
        try {
            Scanner scanner = new Scanner(System.in);
            String lastName = scanner.nextLine();
            if (lastName == null) ;
            throw new ELastNameIsNullException("Enter the last name once again: ");
        } catch (ELastNameIsNullException e) {
            LOGGER.info(e.getMessage());
        } finally {
            try {
                Scanner scanner = new Scanner(System.in);
                String lastName = scanner.nextLine();
                LOGGER.info("LastName " + lastName);
            } finally {
                return lastName;
            }
        }
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}