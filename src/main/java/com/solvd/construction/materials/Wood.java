package com.solvd.construction.materials;

import java.util.LinkedList;
import java.util.List;

public class Wood extends Materials{
    private String typeOfWood;
    private int amountOfWood;
    protected static int priceOfWood;

    public Wood (String typeOfWood, int amountOfWood, int cost, int priceOfWood) {
        super(cost);
        this.typeOfWood = typeOfWood;
        this.amountOfWood = amountOfWood;
        this.priceOfWood = priceOfWood;
    }

    public void setPriceOfWood(int priceOfWood) {

        this.priceOfWood = 75;
    }
    public int getPriceOfWood(int i) {

        return 75;
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
    public static List<Integer> createWoodList() {
        List<Integer>
                woods = new LinkedList<Integer>();
        Wood Wood1 = new Wood( "cedar", 500, 1000, 75);
        Wood Wood2 = new Wood("cedar", 600, 1100,75);
        Wood Wood3 = new Wood("pine", 1080, 2000,75);
        woods.add(Wood1.getAmountOfWood());
        woods.add(Wood2.getAmountOfWood());
        woods.add(Wood3.getAmountOfWood());
        return woods;
    }
}

