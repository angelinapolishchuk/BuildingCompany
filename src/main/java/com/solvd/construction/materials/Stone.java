package com.solvd.construction.materials;

public class Stone extends Materials {

    private int priceOfStone;

    public Stone(int endPriceOfMaterials, int priceOfStone) {
        super(endPriceOfMaterials);
        this.priceOfStone = priceOfStone;
    }

    public void setPriceOfStone(int priceOfStone) {

        this.priceOfStone = priceOfStone;
    }

    public int getPriceOfStone() {

        return priceOfStone;
    }
}
