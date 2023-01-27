package com.solvd.construction.materials;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class FerroconcretePlate extends Materials {
    private int plateLengths;
    private int plateWidths;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(FerroconcretePlate.class));

    public FerroconcretePlate(int plateLengths, int plateWidths, int endPriceOfMaterials) {
        super(endPriceOfMaterials);
        this.plateLengths = plateLengths;
        this.plateWidths = plateWidths;
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

    public Set<FerroconcretePlate> createFerroconcretePlateList() {
        Set<FerroconcretePlate> ferroconcretePlates = new HashSet<>();
        FerroconcretePlate FerroconcretePlate1 = new FerroconcretePlate(5000, 1500, 900);
        FerroconcretePlate FerroconcretePlate2 = new FerroconcretePlate(4000, 1000, 800);
        FerroconcretePlate FerroconcretePlate3 = new FerroconcretePlate(3000, 1000, 650);
        ferroconcretePlates.add(FerroconcretePlate1);
        ferroconcretePlates.add(FerroconcretePlate2);
        ferroconcretePlates.add(FerroconcretePlate3);
        return ferroconcretePlates;
    }

    {
        double averagePlateLengths = createFerroconcretePlateList().stream()
                .mapToInt(FerroconcretePlate::getPlateLengths)
                .summaryStatistics()
                .getAverage();
        LOGGER.info("AveragePlateLengths: " + averagePlateLengths);
    }

    @Override
    public int calculationOfTheEndPriceOfMaterials() {
        return 0;
    }
}

