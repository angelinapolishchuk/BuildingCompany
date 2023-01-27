package com.solvd.construction;

import java.util.logging.Logger;

public enum Type {

    CIVIL("centric"),
    AGRICULTURAL("corridor"),
    INDUSTRIAL("sectional");

    String layout;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Type.class));

    Type(String layout) {
        this.layout = layout;
    }

    boolean hasLayout() {
        return layout != null;
    }

    public void main(String[] args) {
        for (Type type : Type.values()) {
            if (type.hasLayout()) {
                LOGGER.info(type + " has layout, it's " + type.layout);
            } else {
                LOGGER.info(type + " has no layout");
            }
        }
    }
}