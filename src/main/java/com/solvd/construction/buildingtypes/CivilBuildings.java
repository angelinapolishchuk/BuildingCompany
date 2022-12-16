package com.solvd.construction.buildingtypes;

import com.solvd.construction.Type;

public class CivilBuildings extends Buildings{
    private int numberOfApartments;
    private int numberOfEntrances;

    public CivilBuildings(String buildingLayout, int maxNumbersOfFloors, int maxArea, int numberOfApartments, int numberOfEntrances) {
        super(Type.valueOf(buildingLayout), maxNumbersOfFloors, maxArea);
        this.numberOfApartments = numberOfApartments;
        this.numberOfEntrances = numberOfEntrances;

    }

    public int getNumberOfApartments() {
        return numberOfApartments;
    }

    public void setNumberOfApartments(int numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
    }

    public int getNumberOfEntrances() {
        return numberOfEntrances;
    }

    public void setNumberOfEntrances(int numberOfEntrances) {
        this.numberOfEntrances = numberOfEntrances;
    }

    @Override
    public void displayBuildingsInformation(){

    }
}
