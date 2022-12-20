package com.solvd.construction.suppliers;

import com.solvd.construction.building.Building;
import com.solvd.construction.materials.Materials;

import java.util.ArrayList;
import java.util.Objects;

public class Suppliers {
    private int weightOfDelivery;
    private static int deliveryPrice;

    public Suppliers(int weightOfDelivery, int deliveryPrice) {
        this.weightOfDelivery = weightOfDelivery;
        this.deliveryPrice = deliveryPrice;
    }

    public static ArrayList<Suppliers> createListOfSuppliers() {
        ArrayList<Suppliers> suppliers = new ArrayList<>();
        suppliers.add(new Suppliers(5000, 1125000));
        suppliers.add(new Suppliers(100, 22500));
        suppliers.add(new Suppliers(1100, 247500));
        return suppliers;
    }

    public int calculationOfTheDeliveryPrice(Materials endPriceOfMaterials, int weightOfDelivery) {
        deliveryPrice = weightOfDelivery * endPriceOfMaterials.calculationOfTheEndPriceOfMaterials(75, 100, 50);
        return deliveryPrice;
    }

    public int getWeightOfDelivery() {

        return 1000;
    }

    public void setWeightOfDelivery(int weightOfDelivery) {

        this.weightOfDelivery = 1000;
    }

    @Override
    public String toString() {
        return "Suppliers{" +
                ", weightOfDelivery=" + weightOfDelivery +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(weightOfDelivery);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Suppliers suppliers)) return false;
        return weightOfDelivery == suppliers.weightOfDelivery;
    }
}

