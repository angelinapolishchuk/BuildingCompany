package com.solvd.construction.staff;

public class Director extends Person{
    private int lengthOfService;

    public Director(String firstName, String lastName, int age, int lengthOfService) {
        super(firstName, lastName, age);
        this.lengthOfService = lengthOfService;
    }

    public int getLengthOfService() {

        return lengthOfService;
    }

    public void setLengthOfService(int lengthOfService) {
        this.lengthOfService = lengthOfService;
    }
}
