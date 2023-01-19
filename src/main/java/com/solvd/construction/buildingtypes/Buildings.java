package com.solvd.construction.buildingtypes;


public class Buildings {
    private int maxNumberOfFloors;
    private int maxArea;

    public Buildings(int maxNumberOfFloors, int maxArea) {
        this.maxNumberOfFloors = maxNumberOfFloors;
        this.maxArea = maxArea;
    }

    public int setMaxNumberOfFloors() {
        this.maxNumberOfFloors = maxNumberOfFloors;
        return maxNumberOfFloors;
    }

    public int getMaxNumberOfFloors() {

        return maxNumberOfFloors;
    }

    public int setMaxArea() {
        this.maxArea = maxArea;
        return maxArea;
    }

    public int getMaxArea() {
        return maxArea;
    }

    @Override
    public String toString() {
        return " Buildings{" +
                " maxNumberOfFloors=" + maxNumberOfFloors +
                ", maxArea=" + maxArea +
                '}';
    }
}


