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
        buildingType = sc.next();
        try {
            if (buildingType == null) {
                LOGGER.info("Try again, if you haven't write a building type: ");
            }
        } catch (NullPointerException e) {
            LOGGER.info("Error " + e);
        }
        LOGGER.info("Check up: the type of your building is  " + buildingType);
        return buildingType;
    }

    public static int inputOfTheBudget() {
        Scanner sc = new Scanner(System.in);
        LOGGER.info("Please, enter your budget to calculate if you need a credit for the construction: ");
        budget = sc.nextInt();
        try {
            if (budget < 0) {
                LOGGER.info("Try again, if you have write incorrect budget: ");
                budget = sc.nextInt();
            }
        } catch (RuntimeException e) {
            LOGGER.info("Error " + e);
        } finally {
            LOGGER.info("Check up: your budget is  " + budget);
            try {
                if (budget < 0) {
                    LOGGER.info("Try again, if you have write invalid budget: ");
                    budget = sc.nextInt();
                }
            } finally {

            }
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
