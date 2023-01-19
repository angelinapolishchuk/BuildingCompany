package com.solvd.construction.buildingcompany;

import com.solvd.construction.building.Building;
import com.solvd.construction.buildingtypes.Buildings;

import java.util.ArrayList;

import java.util.List;


public class ProjectsOfBuildingCompany {
    private int budget;
    private int credit;
    private Building building;

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

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Building getBuilding() {
        return building;
    }

    Buildings Agricultural1 = new Buildings(20, 1000);
    Buildings Civil1 = new Buildings(3, 5000);
    Buildings Industrial1 = new Buildings(1, 100);

    public List<Buildings> createListOfBuildings() {
        ArrayList<Buildings> buildings = new ArrayList<>();
        buildings.add(Agricultural1);
        buildings.add(Civil1);
        buildings.add(Industrial1);
        return buildings;
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
