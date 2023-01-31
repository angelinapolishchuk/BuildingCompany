package com.solvd.construction.building;

import com.solvd.construction.CartographicObject;
import com.solvd.construction.Type;
import com.solvd.construction.buildingtypes.AgriculturalBuildings;
import com.solvd.construction.buildingtypes.Buildings;
import com.solvd.construction.buildingtypes.CivilBuildings;
import com.solvd.construction.buildingtypes.IndustrialBuildings;
import com.solvd.construction.exceptions.EInvalidBuildersSalary;
import com.solvd.construction.staff.Builder;
import com.solvd.construction.suppliers.Suppliers;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;


public class Building implements CartographicObject {

    private LocalDate startDate;
    private LocalDate endDate;
    private List<Suppliers> suppliers;
    private List<Builder> builders;
    private Set<Buildings> buildings;
    private Map<String, Integer> materialsAndSuppliers;
    private int price;
    private String nameOfBuilding;
    private int credit;
    private String buildingType;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Building.class));

    public Building(LocalDate startDate, LocalDate endDate, List<Builder> builders, String nameOfBuilding, Set<Buildings> buildings, int credit, String buildingType, List<Suppliers> suppliers, Map<String, Integer> materialsAndSuppliers) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.builders = builders;
        this.nameOfBuilding = nameOfBuilding;
        this.buildings = buildings;
        this.credit = credit;
        this.buildingType = buildingType;
        this.suppliers = suppliers;
        this.materialsAndSuppliers = materialsAndSuppliers;
    }

    public Building() {

    }

    public static int choiceOfTheBuildingPrice(Type buildingType, List<Builder> builder, List<Suppliers> suppliers) {
        int sumOfBuildersSalary = builder.stream().map(Builder::getSalary).filter(a -> a > 900).mapToInt(a -> a).sum();
        int sumOfTheSuppliersDeliveryPrice = suppliers.stream().map(Suppliers::getDeliveryPrice).filter(a -> a < 10000).mapToInt(a -> a).sum();
        try {
            if (sumOfBuildersSalary < 3000) {
                throw new EInvalidBuildersSalary("Error");
            }
        } catch (EInvalidBuildersSalary e) {
            throw new RuntimeException(e);
        }
        finally {
            sumOfBuildersSalary = builder.stream().map(Builder::getSalary).filter(a -> a > 900).mapToInt(a -> a).sum();
            if (sumOfBuildersSalary < 3000){
                sumOfBuildersSalary = 3000 ;
            }
        }
        int priceOfTheBuilding = switch (buildingType) {
            case AGRICULTURAL -> sumOfBuildersSalary + AgriculturalBuildings.getPriceOfAgriculturalBuilding() + sumOfTheSuppliersDeliveryPrice;
            case CIVIL -> sumOfBuildersSalary + CivilBuildings.getPriceOfCivilBuilding() + sumOfTheSuppliersDeliveryPrice;
            case INDUSTRIAL -> sumOfBuildersSalary + IndustrialBuildings.getPriceOfIndustrialBuilding() + sumOfTheSuppliersDeliveryPrice;
        };
        return priceOfTheBuilding;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBuilders(List<Builder> builders) {
        this.builders = builders;
    }

    public List<Builder> getBuilders() {
        return builders;
    }

    public void setSuppliers(List<Suppliers> suppliers) {
        this.suppliers = suppliers;
    }

    public List<Suppliers> getSuppliers() {
        return suppliers;
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

    public Set<Buildings> getBuildings() {
        return buildings;
    }

    public void setBuildings(Set<Buildings> buildings) {
        this.buildings = buildings;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public void setMaterialsAndSuppliers(Map<String, Integer> materialsAndSuppliers) {
        this.materialsAndSuppliers = materialsAndSuppliers;
    }

    public Map<String, Integer> getMaterialsAndSuppliers() {
        return materialsAndSuppliers;
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
                ", buildingType = " + buildingType +
                ", startDate = " + startDate +
                ", buildings = " + buildings +
                ", builders = " + builders +
                ", suppliers = " + suppliers +
                ", materialsAndSuppliers = " + materialsAndSuppliers +
                ", endDate = " + endDate +
                '}';
    }
}