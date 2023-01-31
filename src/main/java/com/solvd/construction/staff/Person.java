package com.solvd.construction.staff;


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