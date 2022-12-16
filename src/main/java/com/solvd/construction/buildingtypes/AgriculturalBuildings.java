package com.solvd.construction.buildingtypes;

public class AgriculturalBuildings extends Buildings{
        private int numberOfCompartments;
        private int doorWidth;

        public AgriculturalBuildings(String buildingLayout, int maxNumbersOfFloors, int maxArea, int numberOfCompartments, int doorWidth) {
            super(buildingLayout, maxNumbersOfFloors, maxArea);
            this.numberOfCompartments = numberOfCompartments;
            this.doorWidth = doorWidth;

        }

        public int getNumberOfCompartments() {
            return numberOfCompartments;
        }

        public void setNumberOfCompartments(int numberOfCompartments) {
            this.numberOfCompartments = numberOfCompartments;
        }

        public int getDoorWidth() {
            return doorWidth;
        }

        public void setDoorWidth(int doorWidth) {

            this.doorWidth = doorWidth;
        }
        @Override
        public void displayBuildingsInformation(){

        }

    }

