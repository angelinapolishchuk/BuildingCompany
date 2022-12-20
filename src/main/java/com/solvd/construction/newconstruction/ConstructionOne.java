package com.solvd.construction.newconstruction;

import com.solvd.construction.Type;
import com.solvd.construction.buildingtypes.Buildings;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ConstructionOne {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(ConstructionOne.class));
    public void Build() {
        Building b1 = new Building("Toy Factory For Kids", Type.INDUSTRIAL);
        System.out.printf (b1.name, b1.buildingType);
        switch (b1.buildingType){
            case INDUSTRIAL:
                System.out.println("Industrial Building");
                break;
            case CIVIL:
                System.out.println("Civil Building");
                break;
            case AGRICULTURAL:
                System.out.println("Agricultural Building");
                break;
        }
        LOGGER.info(String.valueOf(Type.INDUSTRIAL.ordinal()));
    }
    class Building{
        String name;
        Type buildingType;
        int numberOfFloors;

        Building(String name, Type buildingType, int numberOfFloors){
            this.buildingType = buildingType;
            this.name = name;
            this.numberOfFloors = numberOfFloors;
        }

        public Building(String toy_factory_for_kids, com.solvd.construction.Type industrial) {
        }

        enum Type {
            CIVIL,
            AGRICULTURAL,
            INDUSTRIAL
        }
    }
}