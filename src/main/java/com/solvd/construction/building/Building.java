package com.solvd.construction.building;

import com.solvd.construction.CartographicObject;
import com.solvd.construction.buildingtypes.IndustrialBuildings;
import com.solvd.construction.materials.Materials;
import com.solvd.construction.staff.Builder;
import com.solvd.construction.suppliers.Suppliers;

import java.time.LocalDate;
import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Building implements CartographicObject {

    private IndustrialBuildings priceOfIndustrialBuilding;
    private Materials endPriceOfMaterials;
    private LocalDate startDate;
    private LocalDate endDate;
    private Suppliers deliveryPrice;

    private Builder salary;



    public Building (IndustrialBuildings priceOfIndustrialBuilding, Materials endPriceOfMaterials, LocalDate startDate, LocalDate endDate,Suppliers deliveryPrice, Builder salary) {
        this.priceOfIndustrialBuilding = priceOfIndustrialBuilding;
        this.endPriceOfMaterials = endPriceOfMaterials;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deliveryPrice = deliveryPrice;
        this.salary = salary;
    }
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Building.class));

    public int calculationOfThePrice(IndustrialBuildings priceOfIndustrialBuilding, Materials endPriceOfMaterials, Suppliers deliveryPrice, Builder salary){

        return 0;
    }

    public LocalDate calculationOfTheEndDate() {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusMonths(26);
        LOGGER.info("Start date: " + startDate + ". End date: " + endDate);
        return getEndDate(endDate);
    }


    public LocalDate getStartDate() {

        return startDate;
    }

    public LocalDate setStartDate(LocalDate startDate) {

        return startDate;
    }

    public LocalDate getEndDate(LocalDate endDate) {

        return this.endDate;
    }

    public void setEndDate(LocalDate endDate) {

        this.endDate = endDate;
    }


    @Override
    public void searchOfBuilding() { }

    public void displayCartographicObject() { }

    @Override
    public String toString() {
        return "Building{" +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, endDate);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Building building)) return false;
        return startDate == building.startDate && endDate == building.endDate;
    }

}