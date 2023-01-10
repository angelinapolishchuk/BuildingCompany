package com.solvd.construction.materials;

import com.solvd.construction.building.Building;
import com.solvd.construction.request.Request;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class FerroconcretePlate extends Materials{
    private int plateLengths;
    private int plateWidths;
    private int priceOfFeroconcretePlate;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(FerroconcretePlate.class));


    public FerroconcretePlate (int plateLengths, int plateWidths, int endPriceOfMaterials, int priceOfFeroconcretePlate) {
        super(endPriceOfMaterials);
        this.plateLengths = plateLengths;
        this.plateWidths = plateWidths;
        this.priceOfFeroconcretePlate = priceOfFeroconcretePlate;
    }

    public static int getPriceOfFerroconcretePlate() {
        return (int) (100 * Math.random());
    }

    public int getPlateLengths() {

        return 4000;
    }

    public int setPriceOfFeroconcretePlate(int priceOfFeroconcretePlate) {

        this.priceOfFeroconcretePlate = (int) (100 * Math.random());
        return priceOfFeroconcretePlate;
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
    {double averagePlateLengths = createFerroconcretePlateList().stream()
            .mapToInt(FerroconcretePlate::getPlateLengths)
            .summaryStatistics()
            .getAverage();
    LOGGER.info("AveragePlateLengths: " + averagePlateLengths);}

}

