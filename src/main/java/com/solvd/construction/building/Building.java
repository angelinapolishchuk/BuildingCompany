package com.solvd.construction.building;

import com.solvd.construction.CartographicObject;
import com.solvd.construction.acceptance.Acceptance;
import com.solvd.construction.investors.Investors;
import com.solvd.construction.suppliers.Suppliers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Building implements CartographicObject {

    private String buildingType;
    private String placeOfConstruction;
    private String materials;
    private int startDate;
    private int endDate;
    private Suppliers suppliers;
    private Investors investors;

    public Building (String buildingType, String placeOfConstruction, String materials, int startDate, int endDate, Suppliers suppliers, Investors investors) {
        this.buildingType = buildingType;
        this.placeOfConstruction = placeOfConstruction;
        this.materials = materials;
        this.startDate = startDate;
        this.endDate = endDate;
        this.suppliers = suppliers;
        this.investors = investors;
    }
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Building.class));

    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");


    public String getBuildingType() {

        return buildingType;
    }

    public void setBuildingType(String buildingType) {

        this.buildingType = buildingType;
    }

    public String getPlaceOfConstruction() {

        return placeOfConstruction;
    }

    public void setPlaceOfConstruction(String placeOfConstruction) {

        this.placeOfConstruction = placeOfConstruction;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {

        this.materials = materials;
    }

    public int getStartDate() {

        return startDate;
    }

    public void setStartDate(int startDate) {

        this.startDate = startDate;
    }

    public int getEndDate() {

        return endDate;
    }

    public void setEndDate(int endDate) {

        this.endDate = endDate;
    }

    public Suppliers getSuppliers() {
        return suppliers;
    }
    public void setSuppliers(Suppliers suppliers) {
        this.suppliers = suppliers;
    }
    public Investors getInvestors() {
        return investors;
    }
    public void setInvestors(Investors investors) {
        this.investors = investors;
    }

    @Override
    public void searchOfBuilding() { }

    public void displayCartographicObject() { }

    @Override
    public String toString() {
        return "Building{" +
                ", buildingType='" + buildingType + '\'' +
                ", placeOfConstruction='" + placeOfConstruction + '\'' +
                ", materials='" + materials + '\'' +
                ", suppliers='" + suppliers + '\'' +
                ", investors='" + investors + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildingType, placeOfConstruction, materials, suppliers, startDate, endDate, investors);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Building building)) return false;
        return startDate == building.startDate && endDate == building.endDate && Objects.equals(buildingType, building.buildingType) && Objects.equals(placeOfConstruction, building.placeOfConstruction) && Objects.equals(materials, building.materials) && Objects.equals(suppliers, building.suppliers) && Objects.equals(investors, building.investors);
    }

}