package com.solvd.construction.suppliers;

import com.solvd.construction.building.Building;

import java.util.Objects;

public class Suppliers {
    private String typeOfDelivery;
    private int weightOfDelivery;

    public Suppliers (String typeOfDelivery, int weightOfDelivery) {
        this.typeOfDelivery = typeOfDelivery;
        this.weightOfDelivery = weightOfDelivery;
    }

    public String getTypeOfDelivery() {
        return typeOfDelivery;
    }

    public void setTypeOfDelivery(String typeOfDelivery) {

        this.typeOfDelivery = typeOfDelivery;
    }

    public int getWeightOfDelivery() {

        return weightOfDelivery;
    }

    public void setWeightOfDelivery(int weightOfDelivery) {

        this.weightOfDelivery = weightOfDelivery;
    }

    @Override
    public String toString() {
        return "Suppliers{" +
                ", typeOfDelivery='" + typeOfDelivery + '\'' +
                ", weightOfDelivery=" + weightOfDelivery +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfDelivery, weightOfDelivery);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Suppliers suppliers)) return false;
        return weightOfDelivery == suppliers.weightOfDelivery && Objects.equals(typeOfDelivery, suppliers.typeOfDelivery);
    }


}
