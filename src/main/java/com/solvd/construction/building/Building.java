package com.solvd.construction.building;

import com.solvd.construction.CartographicObject;
import com.solvd.construction.buildingtypes.AgriculturalBuildings;
import com.solvd.construction.buildingtypes.Buildings;
import com.solvd.construction.buildingtypes.CivilBuildings;
import com.solvd.construction.buildingtypes.IndustrialBuildings;
import com.solvd.construction.exceptions.EBuildingsException;
import com.solvd.construction.materials.Materials;
import com.solvd.construction.staff.Builder;
import com.solvd.construction.suppliers.Suppliers;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;
import java.util.logging.LogManager;
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
    private String nameOfBuilding;

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

    public static int getPrice1() throws IOException, EBuildingsException {
        return calculationOfThePrice1(IndustrialBuildings.getPriceOfIndustrialBuilding(), Materials.getEndPriceOfMaterials(), Suppliers.getDeliveryPrice(), Builder.getSalary());
    }

    public static int calculationOfThePrice1(int priceOfIndustrialBuilding, int endPriceOfMaterials, int deliveryPrice, int salary) throws IOException, EBuildingsException {
    int price1 = Builder.getSalary() + Materials.getEndPriceOfMaterials() + IndustrialBuildings.getPriceOfIndustrialBuilding() + Suppliers.getDeliveryPrice();
        return price1;
    }

    public static int getPrice2() throws IOException, EBuildingsException {
        return calculationOfThePrice2(CivilBuildings.getPriceOfCivilBuilding(), Materials.getEndPriceOfMaterials(), Suppliers.getDeliveryPrice(), Builder.getSalary());
    }

    public static int calculationOfThePrice2(int priceOfCivilBuilding, int endPriceOfMaterials, int deliveryPrice, int salary) throws IOException, EBuildingsException {
        int price2 = Builder.getSalary() + Materials.getEndPriceOfMaterials() + CivilBuildings.getPriceOfCivilBuilding() + Suppliers.getDeliveryPrice();
        return price2;
    }

    public static int getPrice3() throws IOException, EBuildingsException {
        return calculationOfThePrice3(AgriculturalBuildings.getPriceOfAgriculturalBuilding(), Materials.getEndPriceOfMaterials(), Suppliers.getDeliveryPrice(), Builder.getSalary());
    }

    public static int calculationOfThePrice3(int priceOfAgriculturalBuilding, int endPriceOfMaterials, int deliveryPrice, int salary) throws IOException, EBuildingsException {
        int price3 = Builder.getSalary() + Materials.getEndPriceOfMaterials() + AgriculturalBuildings.getPriceOfAgriculturalBuilding() + Suppliers.getDeliveryPrice();
        return price3;
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

    @Override
    public void searchOfBuilding() {

    }

    @Override
    public void displayCartographicObject() {

    }
}