package com.solvd.construction.building;

import com.solvd.construction.CartographicObject;
import com.solvd.construction.buildingtypes.AgriculturalBuildings;
import com.solvd.construction.buildingtypes.Buildings;
import com.solvd.construction.buildingtypes.CivilBuildings;
import com.solvd.construction.buildingtypes.IndustrialBuildings;
import com.solvd.construction.staff.Builder;
import com.solvd.construction.suppliers.Suppliers;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;


public class Building implements CartographicObject {

    private LocalDate startDate;
    private LocalDate endDate;
    private int deliveryPrice;
    private List<Builder> builders;
    private List<Buildings> buildings;
    private int price;
    private String nameOfBuilding;
    private int credit;

    public Building(LocalDate startDate, LocalDate endDate, int deliveryPrice, List<Builder> builders, String nameOfBuilding, List<Buildings> buildings, int credit) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.deliveryPrice = deliveryPrice;
        this.builders = builders;
        this.nameOfBuilding = nameOfBuilding;
        this.buildings = buildings;
        this.credit = credit;
    }

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Building.class));

    public Building() {

    }

    public static int choiceOfTheBuildingPrice(String buildingType, List<Builder> builder){
        int priceOfTheBuilding = 0;
        int sumOfBuildersSalary = 0;
        for (int i = 0; i < builder.size() - 1; i++) {
            sumOfBuildersSalary += builder.get(i).getSalary();
        }
        switch (buildingType) {
             case "agricultural" -> {
                 priceOfTheBuilding = sumOfBuildersSalary + AgriculturalBuildings.getPriceOfAgriculturalBuilding() + Suppliers.getDeliveryPrice();
                 break;
             }
             case "civil" -> {
                 priceOfTheBuilding = sumOfBuildersSalary + CivilBuildings.getPriceOfCivilBuilding() + Suppliers.getDeliveryPrice();
                 break;
             }
             case "industrial" -> {
                 priceOfTheBuilding = sumOfBuildersSalary + IndustrialBuildings.getPriceOfIndustrialBuilding() + Suppliers.getDeliveryPrice();
                 break;
             }
         }
        return priceOfTheBuilding;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDeliveryPrice(int deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public int getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setBuilders(List<Builder> builders) {
        this.builders = builders;
    }

    public List<Builder> getBuilders() {
        return builders;
    }


    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getStartDate() {

        return startDate;
    }

    public LocalDate getEndDate() {

        return endDate;
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

    public List<Buildings> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Buildings> buildings) {
        this.buildings = buildings;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    @Override
    public void searchOfBuilding() {
    }

    @Override
    public void displayCartographicObject() {
    }

    @Override
    public String toString() {
        return " Building{" +
                ", startDate =" + startDate +
                ", endDate =" + endDate +
                ", deliveryPrice =" + deliveryPrice +
                ", builders =" + builders +
                ", buildings =" + buildings +
                '}';
    }
}