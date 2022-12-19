package com.solvd.construction.buildingtypes;

import com.solvd.construction.Type;
import com.solvd.construction.newconstruction.ConstructionOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public abstract class Buildings {
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Buildings.class));
    public static String buildingType = new String();
    private String buildingLayout;
    private int maxNumberOfFloors;
    private int maxArea;


    public Buildings(Type buildingLayout, int maxNumberOfFloors, int maxArea) {
        this.buildingLayout = String.valueOf(buildingLayout);
        this.maxNumberOfFloors = maxNumberOfFloors;
        this.maxArea = maxArea;
    }

    public void typeSelection() throws IOException {
        Scanner in = new Scanner(System.in);
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LOGGER.info("Choose the building type from the list of buildings types:");
        final String buildingType = reader.readLine();
        LOGGER.info("Building type – " + buildingType);
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

    public static Map<Type, Buildings> addBuildingsType() {
        return Map.of(Type.CIVIl, new Buildings(Type.CIVIl, 20, 2000) {
                    @Override
                    public void displayBuildingsInformation() {
                    }
                },
                Type.AGRICULTURAL, new Buildings(Type.AGRICULTURAL, 2, 1000) {
                    @Override
                    public void displayBuildingsInformation() {
                    }
                },
                Type.INDUSTRIAL, new Buildings(Type.INDUSTRIAL, 10, 5000) {
                    @Override
                    public void displayBuildingsInformation() {
                    }
                });
    }
}



