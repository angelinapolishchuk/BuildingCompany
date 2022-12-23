package com.solvd.construction.suppliers;

import com.solvd.construction.building.Building;
import com.solvd.construction.materials.Materials;
import com.solvd.construction.staff.Builder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Suppliers {
    private int weightOfDelivery;
    private static int deliveryPrice;
    private boolean isDelivered;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Suppliers.class));

    public Suppliers(int weightOfDelivery, int deliveryPrice, boolean isDelivered) {
        this.weightOfDelivery = weightOfDelivery;
        this.deliveryPrice = deliveryPrice;
        this.isDelivered = isDelivered;

    }


    public static ArrayList<Suppliers> createListOfSuppliers() {
        ArrayList<Suppliers> suppliers = new ArrayList<>();
        suppliers.add(new Suppliers(5000, 1125000, true));
        suppliers.add(new Suppliers(100, 22500, true));
        suppliers.add(new Suppliers(1100, 247500, true));
        return suppliers;
    }
    private boolean isDeliveredIsTrue;{
    boolean isDeliveredIsTrue = createListOfSuppliers().stream()
            .allMatch(suppliers -> suppliers.getIsDelivered() == true);
     LOGGER.info("Is delivered" + isDeliveredIsTrue);}


    public static int getDeliveryPrice() {
        return calculationOfTheDeliveryPrice(getWeightOfDelivery(),Materials.getEndPriceOfMaterials() );
    }

    public static int calculationOfTheDeliveryPrice(int endPriceOfMaterials, int weightOfDelivery) {
        deliveryPrice = getWeightOfDelivery() * Materials.getEndPriceOfMaterials();
        return deliveryPrice;
    }

    public static int getWeightOfDelivery() {

        return 1000;
    }

    public void setWeightOfDelivery(int weightOfDelivery) {

        this.weightOfDelivery = 1000;
    }
    public boolean getIsDelivered() {

        return isDelivered;
    }

    public void setIsDelivered(boolean IsDelivered) {

        this.isDelivered = isDelivered;
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

