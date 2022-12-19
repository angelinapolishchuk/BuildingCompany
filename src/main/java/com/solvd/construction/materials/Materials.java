package com.solvd.construction.materials;

import java.util.HashSet;
import java.util.Set;

public class Materials {
        private int cost;

        public Materials(int cost){
            this.cost = cost;
        }

        public int getCost(){
            return cost;
    }

        public void setCost(int cost) {
            this.cost = cost;
    }

    public static Set<Materials> createMaterialsList(){
        Set<Materials> materials = new HashSet<>();
        Materials FerroconcretePlate = new Materials(100);
        Materials Stone = new Materials(50);
        Materials Wood = new Materials(200);
        materials.add(FerroconcretePlate);
        materials.add(Stone);
        materials.add(Wood);
        return materials;
    }
}
