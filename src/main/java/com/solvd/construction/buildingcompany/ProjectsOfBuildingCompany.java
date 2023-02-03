package com.solvd.construction.buildingcompany;

import com.solvd.construction.building.Building;

public class ProjectsOfBuildingCompany {
    private int budget;
    private int credit;
    private Building building;
    private String buildingType;

    public ProjectsOfBuildingCompany() {
    }

    public ProjectsOfBuildingCompany(int budget, int credit, Building building, String buildingType) {
        this.credit = credit;
        this.budget = budget;
        this.building = building;
        this.buildingType = buildingType;
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

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public String getBuildingType() {
        return buildingType;
    }

    @Override
    public String toString() {
        return " ProjectsOfBuildingCompany{" +
                ", budget=" + budget +
                ", credit=" + credit +
                ", building=" + building +
                ", buildingType=" + buildingType +
                '}';
    }
}
