package com.solvd.construction.materials;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;


public abstract class Materials {

    private static int endPriceOfMaterials;

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Materials.class));

    public Materials(int endPriceOfMaterials) {
        this.endPriceOfMaterials = endPriceOfMaterials;
    }

    public int getEndPriceOfMaterials() {

        return endPriceOfMaterials;
    }

    public void setEndPriceOfMaterials(int endPriceOfMaterials) {

        this.endPriceOfMaterials = endPriceOfMaterials;
    }

    public abstract int calculationOfTheEndPriceOfMaterials();

    Map<String, Integer> materialsAndSuppliers = new HashMap<>(){
        {
            materialsAndSuppliers.put("Stone", 374);
            materialsAndSuppliers.put("Wood", 463);
            materialsAndSuppliers.put("FerroconcretePlate", 544);
            LOGGER.info("Map materialsAndSuppliers" + materialsAndSuppliers);
        }};

}