package com.solvd.construction.inputdata;

import java.util.Scanner;
import java.util.logging.Logger;

public class InputData {

    public static String buildingType;
    private static int budget;

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(InputData.class));

    public InputData() {
    }

    public static String inputOfTheBuildingType(){
        Scanner sc = new Scanner(System.in);
        LOGGER.info("Please, enter the type of building you need: ");
        try {
            buildingType = sc.next();
        } catch (NullPointerException e) {
            LOGGER.info("Error " + e + "Try again, if you haven't write a building type: ");
        }
        LOGGER.info("Check up: the type of your building is  " + buildingType);
        return buildingType;
    }

    public static int inputOfTheBudget() {
        Scanner sc = new Scanner(System.in);
        LOGGER.info("Please, enter your budget to calculate if you need a credit for the construction: ");
        budget = sc.nextInt();
            if (budget < 0) {
                LOGGER.info("Try again, if you have write incorrect budget: ");
                budget = sc.nextInt();
                throw new RuntimeException("Error ");
            }
        return budget;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }
}
