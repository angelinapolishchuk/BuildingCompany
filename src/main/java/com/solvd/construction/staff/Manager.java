package com.solvd.construction.staff;

public class Manager extends Person{
    private String position;
    private int numberOfSubordinates;

    public Manager(String firstName, String lastName, int age, String position, int numberOfSubordinates) {
        super(firstName, lastName, age);
        this.position = position;
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
