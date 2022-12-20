package com.solvd.construction.startdate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class StartDate {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(StartDate.class));

    final public void pass() throws IOException {
        Scanner in = new Scanner(System.in);
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LOGGER.info("Enter the start date of construction:");
        final String dateFormat = reader.readLine();
        LOGGER.info("Start of construction" + dateFormat);
    }
}