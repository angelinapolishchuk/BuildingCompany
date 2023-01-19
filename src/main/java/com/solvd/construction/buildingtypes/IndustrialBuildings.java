package com.solvd.construction.buildingtypes;

public class IndustrialBuildings extends Buildings {
    private int ceilingHeight;
    private int width;
    private int length;
    private int priceOfOneMetre;

    public IndustrialBuildings(int maxNumbersOfFloors, int maxArea, int ceilingHeight, int wight, int length, int priceOfOneMetre) {
        super(maxNumbersOfFloors, maxArea);
        this.ceilingHeight = ceilingHeight;
        this.width = width;
        this.length = length;
        this.priceOfOneMetre = priceOfOneMetre;
    }

    public static int getPriceOfIndustrialBuilding() {
        return calculationOfThePriceOfIndustrialBuilding(4, 1200, 15, 20);
    }

    public static int calculationOfThePriceOfIndustrialBuilding(int ceilingHeight, int priceOfOneMetre, int width, int length) {

        int priceOfIndustrialBuilding = getCeilingHeight() * getPriceOfOneMetre() * getWidth() * getLength();
        return priceOfIndustrialBuilding;
    }

    public static int getCeilingHeight() {
        return 4;
    }

    public void setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = 4;
    }

    public static int getWidth() {
        return 15;
    }

    public void setWidth(int width) {
        this.width = 15;
    }

    public static int getLength() {
        return 20;
    }

    public void setLength(int length) {
        this.length = 20;
    }

    public static int getPriceOfOneMetre() {
        return 1200;
    }

    public void setPriceOfOneMetre(int priceOfOneMetre) {
        this.priceOfOneMetre = 1200;
    }

    @Override
    public String toString() {
        return " IndustrialBuildings{" +
                ", ceilingHeight =" + ceilingHeight +
                ", width =" + width +
                ", length =" + length +
                ", priceOfOneMetre =" + priceOfOneMetre +
                '}';
    }

}
