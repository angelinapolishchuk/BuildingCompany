package com.solvd.construction.materials;

public final class Stone extends Materials {

    private final int priceOfStone = 200;

    public Stone(int endPriceOfMaterials) {
        super(endPriceOfMaterials);
    }

    public int getPriceOfStone() {

        return priceOfStone;
    }

    @Override
    public int calculationOfTheEndPriceOfMaterials() {
        return 0;
    }
}
