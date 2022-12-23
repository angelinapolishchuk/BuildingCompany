package com.solvd.construction.buildingtypes;

import com.solvd.construction.Type;
import com.solvd.construction.exceptions.EBuildingsException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public abstract class Buildings {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Buildings.class));
    private int maxNumberOfFloors;
    private int maxArea;
    private static int priceOfTheBuilding;


    public Buildings(int maxNumberOfFloors, int maxArea) {
        this.maxNumberOfFloors = maxNumberOfFloors;
        this.maxArea = maxArea;
    }

    public static String getBuildingType() throws IOException, EBuildingsException {
        return typeSelection();
    }

    public static String typeSelection() throws EBuildingsException, IOException {
        Scanner in = new Scanner(System.in);
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LOGGER.info("Enter the type of building you need: ");
        final String buildingType = reader.readLine();
        LOGGER.info("Building type – " + buildingType);
        return buildingType;
    }

    public static int getPriceOfTheBuilding() throws IOException, EBuildingsException {
        return selectionOfThePrice(AgriculturalBuildings.getPriceOfAgriculturalBuilding(), CivilBuildings.getPriceOfCivilBuilding(),IndustrialBuildings.getPriceOfIndustrialBuilding());
    }

    public static int selectionOfThePrice(int priceOfAgriculturalBuilding, int priceOfCivilBuilding, int priceOfIndustrialBuilding) throws IOException, EBuildingsException {
        if (getBuildingType() == "agricultural") {
            priceOfTheBuilding = AgriculturalBuildings.getPriceOfAgriculturalBuilding();
        } else if (getBuildingType() == "civil") {
            priceOfTheBuilding = CivilBuildings.getPriceOfCivilBuilding();
        } else if (getBuildingType() == "industrial") {
            priceOfTheBuilding = IndustrialBuildings.getPriceOfIndustrialBuilding();
            return priceOfTheBuilding;}
        return priceOfAgriculturalBuilding;
    }
}


