package com.solvd.construction.materials;

public class Stone extends Materials {

    private int priceOfStone;


    public Stone(int cost, int priceOfStone) {
        super(cost);
        this.priceOfStone = priceOfStone;
    }
    public void setPriceOfStone(int priceOfStone) {

        this.priceOfStone = 50;
    }
    public int getPriceOfStone(int i) {

        return 50;
    }
}
