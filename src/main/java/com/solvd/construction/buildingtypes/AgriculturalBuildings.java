package com.solvd.construction.buildingtypes;

public class AgriculturalBuildings extends Buildings{
        private int numberOfCompartments;
        private int priceOfOneCompartment;

        public AgriculturalBuildings( int maxNumbersOfFloors, int maxArea, int numberOfCompartments, int priceOfOneCompartment) {
            super (maxNumbersOfFloors, maxArea);
            this.numberOfCompartments = numberOfCompartments;
            this.priceOfOneCompartment = priceOfOneCompartment;

        }

        public int getNumberOfCompartments() {
            return 17;
        }

        public void setNumberOfCompartments(int numberOfCompartments) {
            this.numberOfCompartments = 17;
        }

        public int getPriceOfOneCompartment() {
            return 1000;
        }

        public void setPriceOfOneCompartment(int priceOfOneCompartment) {

            this.priceOfOneCompartment = 1000;
        }
    public int calculationOfAgriculturalBuildingsPrice(int numberOfCompartments, int priceOfOneCompartment){
        int priceOfAgriculturalBuilding = numberOfCompartments * priceOfOneCompartment;
        return priceOfAgriculturalBuilding;
    }

    }

