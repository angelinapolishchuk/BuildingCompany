package com.solvd.construction.buildingtypes;

public class IndustrialBuildings extends Buildings{
    private int ceilingHeight;
    private int numberOfExists;

    public IndustrialBuildings (String buildingLayout, int maxNumbersOfFloors, int maxArea, int ceilingHeight, int numberOfExists) {
        super(buildingLayout, maxNumbersOfFloors, maxArea);
        this.ceilingHeight = ceilingHeight;
        this.numberOfExists = numberOfExists;

    }

    public int getCeilingHeight() {

        return ceilingHeight;
    }

    public void setCeilingHeight(int ceilingHeight) {

        this.ceilingHeight = ceilingHeight;
    }

    public int getNumberOfExists() {

        return numberOfExists;
    }

    public void setNumberOfExists(int numberOfExists) {

        this.numberOfExists = numberOfExists;
    }

    @Override
    public void displayBuildingsInformation(){

    }

}
