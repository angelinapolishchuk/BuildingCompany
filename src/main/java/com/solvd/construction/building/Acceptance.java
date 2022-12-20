package com.solvd.construction.building;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Logger;

public final class Acceptance {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Acceptance.class));


    final public String accept() {
        LOGGER.info("Accepted");
        return "Accept";
    }
}