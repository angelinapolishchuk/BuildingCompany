package com.solvd.construction.staff;

import com.solvd.construction.exceptions.EBrigadeException;
import com.solvd.construction.exceptions.EPeopleException;

public class Person {
        private String firstName;
        private String lastName;
        private int age;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.firstName = firstName;
            this.age = age;
        }
    public int People (int age ) {
        try {
            if (age < 18) {
                throw new EPeopleException();
            }
        } catch (EPeopleException e) {
            System.out.println("Exception: значение не может быть меньше 18");
            return age;
        } finally {
            System.out.println("введите значение больше 18");
        }
        return age;
    }
    }
