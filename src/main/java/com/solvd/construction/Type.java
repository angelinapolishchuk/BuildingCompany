package com.solvd.construction;

import com.solvd.construction.brigade.Brigade;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public enum Type {

    CIVIL("centric"),
    AGRICULTURAL("corridor"),
    INDUSTRIAL("sectional"), CIVIl("centric");

    String layout;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Type.class));

    Type(String layout){
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