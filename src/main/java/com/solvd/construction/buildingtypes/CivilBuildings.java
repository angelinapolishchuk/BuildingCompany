package com.solvd.construction.buildingtypes;

public class CivilBuildings extends Buildings {
    private int numberOfApartments;
    private int priceOfOneApartment;

    public CivilBuildings(int maxNumbersOfFloors, int maxArea, int numberOfApartments, int priceOfOneApartment) {
        super(maxNumbersOfFloors, maxArea);
        this.numberOfApartments = numberOfApartments;
        this.priceOfOneApartment = priceOfOneApartment;

    }

    public int getNumberOfApartments() {
        return 235;
    }

    public void setNumberOfApartments(int numberOfApartments) {
        this.numberOfApartments = 235;
    }

    public int getPriceOfOneApartment() {
        return 30000;
    }

    public void setPriceOfOneApartment(int priceOfOneApartment) {
        this.numberOfApartments = 30000;
    }

    public static int calculationOfCivilBuildingsPrice(int numberOfApartments, int priceOfOneApartment) {
        int priceOfCivilBuilding = numberOfApartments * priceOfOneApartment;
        return priceOfCivilBuilding;
    }

    public static int getPriceOfCivilBuilding() {
        return calculationOfCivilBuildingsPrice(235, 30000);
    }

    @Override
    public String toString() {
        return " CivilBuildings{" +
                ", numberOfApartments =" + numberOfApartments +
                ", priceOfOneApartment =" + priceOfOneApartment +
                '}';
    }
}

