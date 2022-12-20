package com.solvd.construction.acceptance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public final class Acceptance {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Acceptance.class));

    public static SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd.MM.yyyy");

    final public void pass() throws IOException {
        Scanner in = new Scanner(System.in);
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LOGGER.info("Enter the date of acceptance:");
        final String dateFormat2 = reader.readLine();

        LOGGER.info("Accepted" + dateFormat2);
    }

}

