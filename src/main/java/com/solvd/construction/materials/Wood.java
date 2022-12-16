package com.solvd.construction.materials;

public class Wood {
    private String typeOfWood;
    private int amountOfWood;

    public Wood (String typeOfWood, int amountOfWood) {
        this.typeOfWood = typeOfWood;
        this.amountOfWood = amountOfWood;
    }

    public String getTypeOfWood() {

        return typeOfWood;
    }

    public void setTypeOfWood(String typeOfWood) {

        this.typeOfWood = typeOfWood;
    }

    public int getAmountOfWood() {

        return amountOfWood;
    }

    public void setAmountOfWood(int amountOfWood) {

        this.amountOfWood = amountOfWood;
    }
}

