package com.solvd.construction.building;

import com.solvd.construction.CartographicObject;
import com.solvd.construction.brigade.Brigade;
import com.solvd.construction.investors.Investors;
import com.solvd.construction.suppliers.Suppliers;

import java.util.Objects;

public class Building implements CartographicObject {

    private String buildingType;
    private String placeOfConstruction;
    private String materials;
    private int startDate;
    private int endDate;
    private Brigade brigade;
    private Suppliers suppliers;
    private Investors investors;

    public Building (String buildingType, String placeOfConstruction, String materials, int startDate, int endDate, Brigade brigade, Suppliers suppliers, Investors investors) {
        this.buildingType = buildingType;
        this.placeOfConstruction = placeOfConstruction;
        this.materials = materials;
        this.startDate = startDate;
        this.endDate = endDate;
        this.brigade = brigade;
        this.suppliers = suppliers;
        this.investors = investors;
    }

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

    public Brigade getBrigade() {
        return brigade;
    }
    public void setBrigade(Brigade brigade) {
        this.brigade = brigade;
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

    public void displayCartographicObject() { }

    @Override
    public String toString() {
        return "Building{" +
                ", buildingType='" + buildingType + '\'' +
                ", placeOfConstruction='" + placeOfConstruction + '\'' +
                ", materials='" + materials + '\'' +
                ", brigade='" + brigade + '\'' +
                ", suppliers='" + suppliers + '\'' +
                ", investors='" + investors + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildingType, placeOfConstruction, materials, brigade, suppliers, startDate, endDate, investors);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Building building)) return false;
        return startDate == building.startDate && endDate == building.endDate && Objects.equals(buildingType, building.buildingType) && Objects.equals(placeOfConstruction, building.placeOfConstruction) && Objects.equals(materials, building.materials) && Objects.equals(brigade, building.brigade) && Objects.equals(suppliers, building.suppliers) && Objects.equals(investors, building.investors);
    }

}