package com.solvd.construction.buildingcompany;

import com.solvd.construction.building.Building;

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

    @Override
    public String toString() {
        return " ProjectsOfBuildingCompany{" +
                ", budget=" + budget +
                ", credit=" + credit +
                ", building=" + building +
                '}';
    }
}
