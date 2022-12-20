package com.solvd.construction.materials;

import java.util.HashSet;
import java.util.Set;


public class Materials {

    private int endPriceOfMaterials;

    public Materials(int endPriceOfMaterials) {
        this.endPriceOfMaterials = endPriceOfMaterials;
    }

    public int getEndPriceOfMaterials() {

        return calculationOfTheEndPriceOfMaterials(75, 100, 50);
    }

    public void setEndPriceOfMaterials(int endPriceOfMaterials) {

        this.endPriceOfMaterials = endPriceOfMaterials;
    }


    public static Set<Materials> createMaterialsList() {
        Set<Materials> materials = new HashSet<>();
        Materials FerroconcretePlate = new Materials(100);
        Materials Stone = new Materials(50);
        Materials Wood = new Materials(75);
        materials.add(FerroconcretePlate);
        materials.add(Stone);
        materials.add(Wood);
        return materials;
    }

    public int calculationOfTheEndPriceOfMaterials(int priceOfWood, int priceOfFerroconcretePlate, int priceOfStone) {
        endPriceOfMaterials = priceOfFerroconcretePlate + priceOfStone + priceOfWood;
        return endPriceOfMaterials;
    }
}