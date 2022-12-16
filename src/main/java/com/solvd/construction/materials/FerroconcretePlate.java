package com.solvd.construction.materials;

public class FerroconcretePlate {
    private int plateLengths;
    private int plateWidths;

    public FerroconcretePlate (int plateLengths, int plateWidths) {
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
}

