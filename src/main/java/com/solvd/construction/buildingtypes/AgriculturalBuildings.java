package com.solvd.construction.buildingtypes;

public class AgriculturalBuildings extends Buildings {
    private int numberOfCompartments;
    private int priceOfOneCompartment;

    public AgriculturalBuildings(int maxNumbersOfFloors, int maxArea, int numberOfCompartments, int priceOfOneCompartment) {
        super(maxNumbersOfFloors, maxArea);
        this.numberOfCompartments = numberOfCompartments;
        this.priceOfOneCompartment = priceOfOneCompartment;
    }

    public static int getNumberOfCompartments() {
        return 171;
    }

    public static int getPriceOfAgriculturalBuilding() {
        return calculationOfAgriculturalBuildingsPrice(17, 1000);
    }

    public void setNumberOfCompartments(int numberOfCompartments) {
        this.numberOfCompartments = 17;
    }

    public static int getPriceOfOneCompartment() {
        return 10000;
    }

    public void setPriceOfOneCompartment(int priceOfOneCompartment) {

        this.priceOfOneCompartment = 10000;
    }

    public static int calculationOfAgriculturalBuildingsPrice(int numberOfCompartments, int priceOfOneCompartment) {
        int priceOfAgriculturalBuilding = getNumberOfCompartments() * getPriceOfOneCompartment();
        return priceOfAgriculturalBuilding;
    }

    @Override
    public String toString() {
        return " AgriculturalBuildings{" +
                ", numberOfCompartments =" + numberOfCompartments +
                ", priceOfOneCompartment =" + priceOfOneCompartment +
                '}';
    }
}

