package com.solvd.construction.buildingtypes;

import com.solvd.construction.Type;

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


    public Buildings(int maxNumberOfFloors, int maxArea) {
        this.maxNumberOfFloors = maxNumberOfFloors;
        this.maxArea = maxArea;
    }

    public String typeSelection() throws IOException {
        Scanner in = new Scanner(System.in);
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LOGGER.info("Choose the building type from the list of buildings types:");
        final String buildingType = reader.readLine();
        LOGGER.info("Building type – " + buildingType);
        return buildingType;
    }

    public IndustrialBuildings selectionOfThePrice(AgriculturalBuildings priceOfAgriculturalBuilding, CivilBuildings priceOfCivilBuilding, IndustrialBuildings priceOfIndustrialBuilding) {
        String type = "industrial";
        if (type == "agricultural") {
            AgriculturalBuildings priceOfTheBuilding = priceOfAgriculturalBuilding;
        } else if (type == "civil") {
            CivilBuildings priceOfTheBuilding = priceOfCivilBuilding;
        } else if (type == "industrial") {
            IndustrialBuildings priceOfTheBuilding = priceOfIndustrialBuilding;
            return priceOfTheBuilding;
        }
        return priceOfIndustrialBuilding;
    }
}


