package com.solvd.construction;

import com.solvd.construction.building.Building;
import com.solvd.construction.buildingcompany.ProjectsOfBuildingCompany;
import com.solvd.construction.buildingtypes.Buildings;
import com.solvd.construction.staff.Builder;
import com.solvd.construction.suppliers.Suppliers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class DataBuilder {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(DataBuilder.class));

    public DataBuilder() {
    }

    public static ProjectsOfBuildingCompany startBuilding(String buildingType, ProjectsOfBuildingCompany project1) {
        int priceOfTheBuilding = Building.choiceOfTheBuildingPrice(buildingType, project1.getBuilding().getBuilders());
        LOGGER.info("The price of your building is " + priceOfTheBuilding);
        int budget = project1.getBudget();
        if (budget < priceOfTheBuilding) {
            int credit = (priceOfTheBuilding - budget);
            LOGGER.info("You have taken out a credit for the amount of:  " + credit);
            project1.setCredit(credit);
        }
        else{
        LOGGER.info("We can start the construction. Your rest sum is " + (budget - priceOfTheBuilding));}
        Buildings acceptedBuilding = new Buildings(25, 2000);
        LOGGER.info(acceptedBuilding.toString());
        project1.setBuilding(createBuilding(buildingType));
        return project1;
    }

    public static Building createBuilding(String buildingType) {
        Building buildingOnConstruction = new Building();
        buildingOnConstruction.setBuildings(createListOfBuildings());
        LocalDate startDate = getCurrentDate();
        buildingOnConstruction.setStartDate(startDate);
        buildingOnConstruction.setEndDate(calculationOfTheEndDate(startDate));
        List<Builder> builders = createListOfBuilders();
        buildingOnConstruction.setPrice(Building.choiceOfTheBuildingPrice(buildingType, builders));
        buildingOnConstruction.setBuilders(builders);
        buildingOnConstruction.setDeliveryPrice(Suppliers.calculationOfTheDeliveryPrice());
        buildingOnConstruction.setCredit(buildingOnConstruction.getCredit());
        return buildingOnConstruction;
    }

    public static LocalDate calculationOfTheEndDate(LocalDate startDate) {
            return startDate.plusMonths(26);
    }

    public static LocalDate getCurrentDate() {

        return LocalDate.now();
    }

    public static List<Builder> createListOfBuilders() {
        ArrayList<Builder> builders = new ArrayList<>();
        builders.add(new Builder("Павел", "Петриков", 22, 1000));
        builders.add(new Builder("Самвел", "Петриков", 25, 1200));
        builders.add(new Builder("Пётр", "Сидоров", 32, 1300));
        return builders;
    }

    public static List<Buildings> createListOfBuildings() {
        ArrayList<Buildings> buildings = new ArrayList<>();
        Buildings acceptedBuilding = new Buildings(25, 2000);
        buildings.add(acceptedBuilding);
        buildings.add(new Buildings( 25, 1200));
        buildings.add(new Buildings( 32, 1300));
        return buildings;
    }
}
