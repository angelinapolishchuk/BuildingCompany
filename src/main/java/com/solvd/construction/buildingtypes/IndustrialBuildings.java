package com.solvd.construction.buildingtypes;

import com.solvd.construction.Type;

public class IndustrialBuildings extends Buildings{
    private int ceilingHeight;
    private int width;
    private int length;
    private int priceOfOneMetre;

    public IndustrialBuildings (String buildingLayout, int maxNumbersOfFloors, int maxArea, int ceilingHeight, int wight, int length, int priceOfOneMetre) {
        super (maxNumbersOfFloors, maxArea);
        this.ceilingHeight = ceilingHeight;
        this.width = width;
        this.length = length;
        this.priceOfOneMetre = priceOfOneMetre;
    }

    public int calculationOfThePriceOfIndustrialBuilding(int ceilingHeight, int priceOfOneMetre, int width, int length){

        int priceOfIndustrialBuilding = ceilingHeight * priceOfOneMetre * width * length;
        return priceOfIndustrialBuilding;
    }

    public int getCeilingHeight() {

        return 4;
    }

    public void setCeilingHeight(int ceilingHeight) {

        this.ceilingHeight = 4;
    }

    public int getWidth() {

        return 15;
    }

    public void setWidth(int width) {

        this.width = 15;
    }
    public int getLength() {

        return 20;
    }

    public void setLength(int length) {

        this.length = 20;
    }

    public int getPriceOfOneMetre() {

        return 1200;
    }

    public void setPriceOfOneMetre(int priceOfOneMetre) {

        this.priceOfOneMetre = 1200;
    }


}
