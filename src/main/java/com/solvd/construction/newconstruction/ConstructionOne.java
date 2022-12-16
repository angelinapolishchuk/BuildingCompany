package com.solvd.construction.newconstruction;

import com.solvd.construction.Type;
import com.solvd.construction.buildingtypes.Buildings;

public class ConstructionOne {
    public void main(String[] args) {
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
        System.out.println(Type.INDUSTRIAL.ordinal());
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