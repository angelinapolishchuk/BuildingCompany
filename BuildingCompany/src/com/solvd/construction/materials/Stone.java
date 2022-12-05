package com.solvd.construction.materials;

public class Stone {
    private static String typeOfStone;
    private static int maxWeight;

    public Stone(String typeOfStone, int maxWeight) {
        this.typeOfStone = typeOfStone;
        this.maxWeight = maxWeight;

    }

    public static void main(String[] args) {
        Stone stone = new Stone("Marble", 500);
        System.out.println(Stone.typeOfStone);
        System.out.println(Stone.maxWeight);

    }

}
