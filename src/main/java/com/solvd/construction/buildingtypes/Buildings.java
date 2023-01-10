package com.solvd.construction.buildingtypes;

import com.solvd.construction.building.Building;
import com.solvd.construction.exceptions.EBuildingsException;
import com.sun.tools.javac.Main;

import java.io.IOException;
import java.util.logging.Logger;

public class Buildings {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Buildings.class));
    private int maxNumberOfFloors;
    private int maxArea;
    private static int priceOfTheBuilding;

    public Buildings() {
        
    }
    public Buildings(int maxNumberOfFloors, int maxArea) {
        this.maxNumberOfFloors = maxNumberOfFloors;
        this.maxArea = maxArea;
    }

    public Buildings(int budget) {
    }

    public static int selectBuildingPrice() throws EBuildingsException, IOException {

        LOGGER.info("Building type – " + getBuildingType());

        switch (getBuildingType()) {
            case 1 -> {
                LOGGER.info(String.valueOf(priceOfTheBuilding = Building.getPrice3()));
                break;
            }
            case 2 -> {
                LOGGER.info(String.valueOf(priceOfTheBuilding = Building.getPrice2()));
                break;
            }
            case 3 -> {
                LOGGER.info(String.valueOf(priceOfTheBuilding = Building.getPrice1()));
                break;
            }
        }
        return priceOfTheBuilding;
    }

    private static int getBuildingType() {
        return getBuildingType();
    }

    private static void setPriceOfTheBuilding(int priceOfTheBuilding) {
    }

    public static int getPriceOfTheBuilding() throws IOException, EBuildingsException {
        return selectBuildingPrice();
    }


    public static String setBuildingType() {
        return setBuildingType();
    }

    @Override
    public String toString() {
        return " Buildings{" +
                " maxNumberOfFloors=" + maxNumberOfFloors +
                ", maxArea=" + maxArea +
                '}';
    }
    }


