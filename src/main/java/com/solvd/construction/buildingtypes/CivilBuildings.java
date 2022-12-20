package com.solvd.construction.buildingtypes;

import com.solvd.construction.Type;

public class CivilBuildings extends Buildings{
    private int numberOfApartments;

    public CivilBuildings(String buildingLayout, int maxNumbersOfFloors, int maxArea, int numberOfApartments) {
        super(Type.valueOf(buildingLayout), maxNumbersOfFloors, maxArea);
        this.numberOfApartments = numberOfApartments;

    }

    public int getNumberOfApartments() {
        return numberOfApartments;
    }

    public void setNumberOfApartments(int numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
    }

    @Override
    public void displayBuildingsInformation(){

    }
}
