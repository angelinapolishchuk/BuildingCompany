package com.solvd.construction.buildingtypes;

public abstract class Buildings {
    private String buildingLayout;
    private int maxNumberOfFloors;
    private int maxArea;

    public Buildings(String buildingLayout, int maxNumberOfFloors, int maxArea) {
        this.buildingLayout = buildingLayout;
        this.maxNumberOfFloors = maxNumberOfFloors;
        this.maxArea = maxArea;
    }

    public String getBuildingLayout() {
        return buildingLayout;
    }

    public void setBuildingLayout(String buildingLayout) {
        this.buildingLayout = buildingLayout;
    }

    public int getMaxNumberOfFloors() {
        return maxNumberOfFloors;
    }

    public void setMaxNumberOfFloors(int maxNumberOfFloors) {
        this.maxNumberOfFloors = maxNumberOfFloors;
    }

    public int getMaxArea() {
        return maxArea;
    }

    public void setMaxArea(int maxArea) {
        this.maxArea = maxArea;
    }

    public abstract void displayBuildingsInformation();
}

