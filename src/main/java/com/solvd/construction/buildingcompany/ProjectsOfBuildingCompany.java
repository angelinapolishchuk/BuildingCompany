package com.solvd.construction.buildingcompany;

import com.solvd.construction.building.Building;
import com.solvd.construction.buildingtypes.Buildings;
import com.solvd.construction.exceptions.EBuildingsException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;


import static com.solvd.construction.buildingtypes.Buildings.getPriceOfTheBuilding;

public class ProjectsOfBuildingCompany {
    private int budget;
    private int credit;
    private Building building;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(ProjectsOfBuildingCompany.class));

    public ProjectsOfBuildingCompany() {
    }
    public ProjectsOfBuildingCompany(int budget, int credit, Building building) {
        this.credit = credit;
        this.budget = budget;
        this.building = building;
    }



    public static int selectBudget() throws IOException, EBuildingsException {
        Scanner sc = new Scanner(System.in);
        LOGGER.info("Enter your budget: ");
        final String budget = sc.nextLine();
        LOGGER.info("Your budget – " + budget);
        return getBudget();
    }

    public static int getSelectBudget() throws IOException, EBuildingsException {
        return getBudget();
    }

    public static int getCalculationTheCredit() {
        return getCalculationOfTheCredit();
    }

    public int calculationTheCredit() throws IOException, EBuildingsException {
        if (getBudget() < getPriceOfTheBuilding()) {
            LOGGER.info("You need a credit. The sum of credit is " + getCalculationOfTheCredit());
        } else if (getBudget() > getPriceOfTheBuilding()) {
            LOGGER.info("You don't need a credit and can build your building. Rest sum is " + getCalculationOfTheCredit());
        }
        return getCalculationOfTheCredit();
    }


    private static int getCalculationOfTheCredit() {
        return getPriceOfTheCredit();
    }

    private static int getPriceOfTheCredit() {
        return getCalculationOfTheCredit();
    }

    public int calculationOfTheCredit() throws IOException, EBuildingsException {
        int priceOfTheCredit = getPriceOfTheBuilding() - ProjectsOfBuildingCompany.getBudget();
        return priceOfTheCredit;
    }

    private static int getBudget() throws IOException, EBuildingsException {
        return selectBudget();
    }
    Buildings Agricultural1 = new Buildings(20,1000);
    Buildings Civil1 = new Buildings(3,5000);
    Buildings Industrial1 = new Buildings(1, 100);
    public String createListOfBuildings(){
        ArrayList<Buildings> buildings = new ArrayList<>();
        buildings.add(Agricultural1);
        buildings.add(Civil1);
        buildings.add(Industrial1);
        return buildings.toString();
    }
    @Override
    public String toString() {
        return " ProjectsOfBuildingCompany{" +
                ", budget=" + budget +
                ", credit=" + credit +
                ", building=" + building +
                '}';
    }
}
