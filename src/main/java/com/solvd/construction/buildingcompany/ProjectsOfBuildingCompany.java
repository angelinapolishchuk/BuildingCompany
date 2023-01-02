package com.solvd.construction.buildingcompany;

import com.solvd.construction.building.Building;
import com.solvd.construction.buildingtypes.Buildings;
import com.solvd.construction.exceptions.EBuildingsException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Logger;

public class ProjectsOfBuildingCompany {
    private int budget;
    private int credit;
    private Building building;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(ProjectsOfBuildingCompany.class));

    public ProjectsOfBuildingCompany ( int budget, int credit,Building building){
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
        if (getBudget() < Buildings.getPriceOfBuilding()) {
            LOGGER.info("You need a credit. The sum of credit is " + getCalculationOfTheCredit());
        } else if (getBudget() > Buildings.getPriceOfBuilding()) {
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
        int priceOfTheCredit = Buildings.getPriceOfBuilding() - ProjectsOfBuildingCompany.getBudget();
        return priceOfTheCredit;
    }
    private static int getBudget() throws IOException, EBuildingsException {
        return selectBudget();
    }}

