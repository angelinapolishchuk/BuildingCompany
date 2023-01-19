package com.solvd.construction.materials;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;


public class Materials {

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

    Map<String, Integer> materialsAndSuppliers = new HashMap<>(){
        {
            materialsAndSuppliers.put("Stone", 374);
            materialsAndSuppliers.put("Wood", 463);
            materialsAndSuppliers.put("FerroconcretePlate", 544);
            LOGGER.info("Map materialsAndSuppliers" + materialsAndSuppliers);
        }};

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
}