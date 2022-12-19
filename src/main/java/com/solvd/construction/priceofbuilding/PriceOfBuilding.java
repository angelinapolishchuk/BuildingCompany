package com.solvd.construction.priceofbuilding;

import com.solvd.construction.staff.Builder;
import com.solvd.construction.staff.Manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.lang.String.valueOf;

public class PriceOfBuilding {
    String stone = "stone";
    String ferroconcretePlate = "ferroconcretePlate";
    String wood = "wood";
    public static int price;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(valueOf(PriceOfBuilding.class));

    public void calculationOfThePrice() throws IOException {
        Scanner in = new Scanner(System.in);
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LOGGER.info("Enter the number of square meters of the house:");
        final int metricArea = Integer.parseInt(reader.readLine());


        LOGGER.info("Enter the type of materials for the building:");
        Scanner inputFigure = new Scanner(System.in);
        String type = inputFigure.next();

        if (type == stone) {
            price = 50 * metricArea;
        } else if (type == ferroconcretePlate) {
            price = 100 * metricArea;
        } else if (type == wood) {
            price = 200 * metricArea;
        } else {
            LOGGER.info("You enter wrong type of materials");
        }
    }
}
