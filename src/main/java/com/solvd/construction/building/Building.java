package com.solvd.construction.building;

import com.solvd.construction.CartographicObject;
import com.solvd.construction.buildingcompany.ProjectsOfBuildingCompany;
import com.solvd.construction.buildingtypes.AgriculturalBuildings;
import com.solvd.construction.buildingtypes.CivilBuildings;
import com.solvd.construction.buildingtypes.IndustrialBuildings;
import com.solvd.construction.exceptions.EBuildingsException;
import com.solvd.construction.materials.Materials;
import com.solvd.construction.staff.Builder;
import com.solvd.construction.suppliers.Suppliers;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Logger;



public class Building implements CartographicObject {

    private IndustrialBuildings priceOfIndustrialBuilding;
    private CivilBuildings priceOfCivilBuilding;
    private AgriculturalBuildings priceOfAgriculturalBuilding;
    private Materials endPriceOfMaterials;
    private static LocalDate startDate;
    private LocalDate endDate;
    private Suppliers deliveryPrice;

    private Builder salary;
    private String nameOfBuilding = "summer";

// todo лист зданий и тут тоже создаём кладём в лист и сетаем и объект в проджект оф билдинг

    public Building (AgriculturalBuildings priceOfAgriculturalBuilding, CivilBuildings priceOfCivilBuilding, IndustrialBuildings priceOfIndustrialBuilding, Materials endPriceOfMaterials, LocalDate startDate, LocalDate endDate,Suppliers deliveryPrice, Builder salary,String nameOfBuilding) {
        this.priceOfIndustrialBuilding = priceOfIndustrialBuilding;
        this.priceOfAgriculturalBuilding = priceOfAgriculturalBuilding;
        this.priceOfCivilBuilding = priceOfCivilBuilding;
        this.endPriceOfMaterials = endPriceOfMaterials;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deliveryPrice = deliveryPrice;
        this.salary = salary;
        this.nameOfBuilding = nameOfBuilding;

    }
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Building.class));

    public Building() {

    }

    public Building(int budget) {
    }

    public static int choiceOfTheBuildingPrice(String buildingType) {
        int priceOfTheBuilding=0;
        switch (buildingType) {
            case "agricultural" -> {
                priceOfTheBuilding = Builder.getSalary() + Materials.getEndPriceOfMaterials() + AgriculturalBuildings.getPriceOfAgriculturalBuilding() + Suppliers.getDeliveryPrice();;
                LOGGER.info("The price of your building is " + priceOfTheBuilding);
                break;
            }
            case "civil" -> {
                priceOfTheBuilding = Builder.getSalary() + Materials.getEndPriceOfMaterials() + CivilBuildings.getPriceOfCivilBuilding() + Suppliers.getDeliveryPrice();;
                LOGGER.info("The price of your building is " + priceOfTheBuilding);
                break;
            }
            case "industrial" -> {
                priceOfTheBuilding = Builder.getSalary() + Materials.getEndPriceOfMaterials() + IndustrialBuildings.getPriceOfIndustrialBuilding() + Suppliers.getDeliveryPrice();
                LOGGER.info("The price of your building is " + priceOfTheBuilding);
                break;
            }
        }
        return priceOfTheBuilding;
    }


    public static LocalDate calculationOfTheEndDate() {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusMonths(26);
        return endDate;
    }


    public static LocalDate getStartDate() {

        return LocalDate.now();
    }

    public LocalDate setStartDate(LocalDate startDate) {

        return startDate;
    }

    public static LocalDate getEndDate() {

        return calculationOfTheEndDate();
    }

    public void setEndDate(LocalDate endDate) {

        this.endDate = endDate;
    }
    public void setNameOfBuilding(String nameOfBuilding) {

        this.nameOfBuilding = nameOfBuilding;
    }
    public String getNameOfBuilding() {

        return nameOfBuilding;
    }

    public Building(String nameOfBuilding) {
        setNameOfBuilding(nameOfBuilding);
    }
    @Override
    public void searchOfBuilding() {

    }

    @Override
    public void displayCartographicObject() {

    }

}