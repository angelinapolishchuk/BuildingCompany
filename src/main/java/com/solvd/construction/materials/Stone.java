package com.solvd.construction.materials;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Stone extends Materials{
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Stone.class));
    private static String typeOfStone;
    private static int maxWeight;

    public Stone(String typeOfStone, int maxWeight, int cost) {
        super(cost);
        this.typeOfStone = typeOfStone;
        this.maxWeight = maxWeight;

    }

    public static void main(String[] args) {
        Stone stone = new Stone("Marble", 500, 250);
        LOGGER.info(Stone.typeOfStone);
        LOGGER.info(String.valueOf(Stone.maxWeight));

    }

    private static Stone daytime(String typeOfStone) {
        Stone Granite = Stone.daytime("Granite");
        return Granite;
    }
}
