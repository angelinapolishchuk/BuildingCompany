package com.solvd.construction.materials;

import java.util.HashSet;
import java.util.Set;

public class FerroconcretePlate extends Materials{
    private int plateLengths;
    private int plateWidths;

    public FerroconcretePlate (int plateLengths, int plateWidths, int cost) {
        super(cost);
        plateLengths = 5000;
        plateWidths = 1500;
    }

    public int getPlateLengths() {

        return plateLengths;
    }

    public void setPlateLengths(int plateLengths) {

        this.plateLengths = plateLengths;
    }

    public int getPlateWidths() {

        return plateWidths;
    }

    public void setPlateWidths(int plateWidths) {

        this.plateWidths = plateWidths;
    }

    public static Set<FerroconcretePlate> createFerroconcretePlateList(){
        Set<FerroconcretePlate> ferroconcretePlates = new HashSet<>();
        FerroconcretePlate FerroconcretePlate1 = new FerroconcretePlate(5000, 1500, 100);
        FerroconcretePlate FerroconcretePlate2 = new FerroconcretePlate(4000, 1000, 80);
        FerroconcretePlate FerroconcretePlate3 = new FerroconcretePlate(3000, 1000, 65);
        ferroconcretePlates.add(FerroconcretePlate1);
        ferroconcretePlates.add(FerroconcretePlate2);
        ferroconcretePlates.add(FerroconcretePlate3);
        return ferroconcretePlates;
    }
}

