package com.solvd.construction;

import com.solvd.construction.building.Building;
import com.solvd.construction.buildingcompany.ProjectsOfBuildingCompany;
import com.solvd.construction.buildingtypes.Buildings;
import com.solvd.construction.exceptions.EBudgetSizeException;
import com.solvd.construction.exceptions.ECreditSizeException;
import com.solvd.construction.staff.Builder;
import com.solvd.construction.suppliers.Suppliers;

import java.time.LocalDate;
import java.util.*;
import java.util.logging.Logger;

public final class DataBuilder {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(DataBuilder.class));

    public DataBuilder() {
    }

    public static ProjectsOfBuildingCompany startBuilding(Type buildingType, ProjectsOfBuildingCompany project1) {
        int priceOfTheBuilding = Building.choiceOfTheBuildingPrice(buildingType, project1.getBuilding().getBuilders(), project1.getBuilding().getSuppliers());
        LOGGER.info("The price of your building is " + priceOfTheBuilding);
        int budget = project1.getBudget();
        try {
            if (budget < 500000) {
                LOGGER.info("You can't construct your building. The sum of your budget is too small. See you soon!");
                System.exit(0);
                throw new EBudgetSizeException("You can't construct your building. The sum of your budget is too small.");
            }
        } catch (EBudgetSizeException e) {
            throw new RuntimeException(e);
        }
        if (budget < priceOfTheBuilding) {
            int credit = (priceOfTheBuilding - budget);
            try {
                if (credit > 1000000) {
                    LOGGER.info("You can't take a credit and construct your building. The sum is too big. See you soon!");
                    System.exit(0);
                    throw new ECreditSizeException("You can't take a credit. The sum is to big.");
                }
            } catch (ECreditSizeException e) {
                throw new RuntimeException(e);
            }
            LOGGER.info("You have taken out a credit for the amount of:  " + credit);
            project1.setCredit(credit);
        }
        else{
        LOGGER.info("We can start the construction. Your rest sum is " + (budget - priceOfTheBuilding));}
        Buildings acceptedBuilding = new Buildings(25, 2000);
        LOGGER.info(acceptedBuilding.toString());
        project1.setBuilding(createBuilding(buildingType));
        LOGGER.info("STATISTICS: ");
        LOGGER.info("AverageAgeOfTheBuilders = " +  averageAgeOfTheBuilders());
        LOGGER.info("MaxNumbersOfFloors = " +  maxNumbersOfFloors());
        LOGGER.info("SumOfTheDeliveryPrices = " +  sumOfTheDeliveryPrices());
        return project1;
    }

    public static Building createBuilding(Type buildingType) {
        Building buildingOnConstruction = new Building();
        buildingOnConstruction.setBuildings(createListOfBuildings());
        LocalDate startDate = getCurrentDate();
        buildingOnConstruction.setStartDate(startDate);
        buildingOnConstruction.setEndDate(calculationOfTheEndDate(startDate));
        List<Builder> builders = createListOfBuilders();
        List<Suppliers> suppliers = createListOfSuppliers();
        Map<String, Integer> materialsAndSuppliers = createMaterialsAndSuppliers();
        buildingOnConstruction.setPrice(Building.choiceOfTheBuildingPrice(buildingType, builders, suppliers));
        buildingOnConstruction.setBuilders(builders);
        buildingOnConstruction.setSuppliers(suppliers);
        buildingOnConstruction.setMaterialsAndSuppliers(materialsAndSuppliers);
        buildingOnConstruction.setCredit(buildingOnConstruction.getCredit());
        buildingOnConstruction.setBuildingType(String.valueOf(buildingType));
        return buildingOnConstruction;
    }

    public static LocalDate calculationOfTheEndDate(LocalDate startDate) {
            return startDate.plusMonths(26);
    }

    public static LocalDate getCurrentDate() {

        return LocalDate.now();
    }

    public static Map<String, Integer> createMaterialsAndSuppliers() {
        HashMap<String, Integer> materialsAndSuppliers = new HashMap<>();
        {
            materialsAndSuppliers.put("FerroconcretePlate", 5000);
            materialsAndSuppliers.put("Stone", 100);
            materialsAndSuppliers.put("Wood", 1100);
        }
        return materialsAndSuppliers;
    }

    public static List<Builder> createListOfBuilders() {
        ArrayList<Builder> builders = new ArrayList<>();
        builders.add(new Builder("Павел", "Петриков", 22, 1000));
        builders.add(new Builder("Самвел", "Петриков", 25, 1200));
        builders.add(new Builder("Пётр", "Сидоров", 32, 1300));
        return builders;
    }

    public static double averageAgeOfTheBuilders(){
        double averageAgeOfTheBuilders = createListOfBuilders().stream()
                .mapToInt(Builder::getAge)
                .summaryStatistics()
                .getAverage();
        return averageAgeOfTheBuilders;
    }

    public static Set<Buildings> createListOfBuildings() {
        Set<Buildings> buildings = new HashSet<>();
        Buildings acceptedBuilding = new Buildings(25, 2000);
        buildings.add(acceptedBuilding);
        buildings.add(new Buildings( 25, 1200));
        buildings.add(new Buildings( 32, 1300));
        return buildings;
    }

    public static double maxNumbersOfFloors(){
      double maxNumbersOfFloors = createListOfBuildings().stream()
                .mapToInt(Buildings::getMaxNumberOfFloors)
                .summaryStatistics()
                .getMax();
        return maxNumbersOfFloors;
    }

    public static List<Suppliers> createListOfSuppliers() {
        ArrayList<Suppliers> suppliers = new ArrayList<>();
        suppliers.add(new Suppliers(5000));
        suppliers.add(new Suppliers(100));
        suppliers.add(new Suppliers(1100));
        return suppliers;
    }

    public static double sumOfTheDeliveryPrices(){
     double sumOfTheDeliveryPrices = createListOfSuppliers().stream()
            .mapToInt(Suppliers::getDeliveryPrice)
            .summaryStatistics()
            .getSum();
        return sumOfTheDeliveryPrices;
    }
    }
