package com.solvd.construction.materials;

import java.util.HashSet;
import java.util.Set;

public class FerroconcretePlate extends Materials{
    private int plateLengths;
    private int plateWidths;
    private static int priceOfFeroconcretePlate;


    public FerroconcretePlate (int plateLengths, int plateWidths, int endPriceOfMaterials, int priceOfFeroconcretePlate) {
        super(endPriceOfMaterials);
        this.plateLengths = plateLengths;
        this.plateWidths = plateWidths;
        this.priceOfFeroconcretePlate = priceOfFeroconcretePlate;
    }

    public int getPlateLengths() {

        return 4000;
    }

    public void setPriceOfFeroconcretePlate(int priceOfFeroconcretePlate) {

        this.priceOfFeroconcretePlate = 100;
    }
    public int getPriceOfFeroconcretePlate(int i) {

        return 100;
    }

    public void setPlateLengths(int plateLengths) {

        this.plateLengths = 4000;
    }

    public int getPlateWidths() {

        return 1000;
    }

    public void setPlateWidths(int plateWidths) {

        this.plateWidths = 1000;
    }

    public static Set<FerroconcretePlate> createFerroconcretePlateList(){
        Set<FerroconcretePlate> ferroconcretePlates = new HashSet<>();
        FerroconcretePlate FerroconcretePlate1 = new FerroconcretePlate(5000, 1500, 900, 100);
        FerroconcretePlate FerroconcretePlate2 = new FerroconcretePlate(4000, 1000, 800,100);
        FerroconcretePlate FerroconcretePlate3 = new FerroconcretePlate(3000, 1000, 650,100);
        ferroconcretePlates.add(FerroconcretePlate1);
        ferroconcretePlates.add(FerroconcretePlate2);
        ferroconcretePlates.add(FerroconcretePlate3);
        return ferroconcretePlates;
    }
}

