package com.solvd.construction.staff;


import com.solvd.construction.exceptions.EAgeException;
import com.solvd.construction.exceptions.EFirstNameException;
import com.solvd.construction.exceptions.ELastNameException;

import java.util.Scanner;
import java.util.logging.Logger;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Person.class));

    public Person(String firstName, String lastName, int age) {
    }

    public String enterFirstName() {
        try {
            Scanner scanner = new Scanner(System.in);
            String firstName = scanner.nextLine();
            if (firstName == null) ;
            throw new EFirstNameException("Enter the last name correctly! ");
        } catch (EFirstNameException e) {
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
            throw new ELastNameException("Enter the last name once again: ");
        } catch (ELastNameException e) {
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

    public int enterAge() {
        try {
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            if (age == 0) ;
            throw new EAgeException("Enter the age once again: ");
        } catch (EAgeException e) {
            LOGGER.info(e.getMessage());
        } finally {
            try {
                Scanner scanner = new Scanner(System.in);
                String age = scanner.nextLine();
                LOGGER.info("Age " + age);
            } finally {
                return age;
            }
        }
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int setAge() {
        this.age = age;
        return age;
    }

    public String setFirstName() {
        this.firstName = firstName;
        return firstName;
    }
    public String setLastName() {
        this.lastName = lastName;
        return lastName;
    }

    public String getLastName(){
        return lastName;
    }
}