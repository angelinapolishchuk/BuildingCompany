package com.solvd.construction.buildingcompany;

import com.solvd.construction.building.Building;
import com.solvd.construction.buildingtypes.Buildings;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ProjectsOfBuildingCompany {
    private int budget;
    private int credit;
    private Building building;

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(ProjectsOfBuildingCompany.class));

    public ProjectsOfBuildingCompany() {
    }
    public ProjectsOfBuildingCompany(int budget, int credit, Building building) {
        this.credit = credit;
        this.budget = budget;
        this.building = building;
    }

    public void setBudget(int budget) {

        this.budget = budget;
    }
    public int getBudget() {

        return budget;
    }

    public int setCredit() {
        this.credit = credit;
        return 0;
    }

    public int getCredit(){
        return credit;
    }

    public Buildings setBuilding() {
        this.building = building;
        return null;
    }

    public Building getBuilding(){
        return building;
    }
    Buildings Agricultural1 = new Buildings(20,1000);
    Buildings Civil1 = new Buildings(3,5000);
    Buildings Industrial1 = new Buildings(1, 100);
    public String createListOfBuildings(){
        ArrayList<Buildings> buildings = new ArrayList<>();
        buildings.add(Agricultural1);
        buildings.add(Civil1);
        buildings.add(Industrial1);
        return buildings.toString();
    }

    @Override
    public String toString() {
        return " ProjectsOfBuildingCompany{" +
                ", budget=" + budget +
                ", credit=" + credit +
                ", building=" + building +
                '}';
    }
}
