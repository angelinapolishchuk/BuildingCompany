package com.solvd.construction.buildingtypes;

import com.solvd.construction.Type;
import com.solvd.construction.exceptions.EBuildingsException;

public abstract class Buildings {
    private String buildingLayout;
    private int maxNumberOfFloors;
    private int maxArea;


    public Buildings(Type buildingLayout, int maxNumberOfFloors, int maxArea) {
        this.buildingLayout = String.valueOf(buildingLayout);
        this.maxNumberOfFloors = maxNumberOfFloors;
        this.maxArea = maxArea;
    }

    public void Buildings(String buildingLayout) throws EBuildingsException, RuntimeException {
        try {
            for (int i = 0; i < buildingLayout.length(); i++) {
                if (Character.isDigit(buildingLayout.charAt(i))) {
                    throw new EBuildingsException();
                }
            }
        } catch (EBuildingsException e) {
            System.out.println("Exception:".toString());
            return;
        }
    }
    public String getBuildingLayout () {

        return buildingLayout;
    }

    public void setBuildingLayout (String buildingLayout){

        this.buildingLayout = buildingLayout;
    }

    public int getMaxNumberOfFloors () {
        return maxNumberOfFloors;
    }

    public void setMaxNumberOfFloors ( int maxNumberOfFloors){

        this.maxNumberOfFloors = maxNumberOfFloors;
    }

    public int getMaxArea () {
        return maxArea;
    }

    public void setMaxArea ( int maxArea){

        this.maxArea = maxArea;
    }

    public abstract void displayBuildingsInformation ();
}



