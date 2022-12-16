package com.solvd.construction;

public enum Type {
    CIVIL("centric"),
    AGRICULTURAL("corridor"),
    INDUSTRIAL("sectional"), CIVIl("centric");

    String layout;

    Type(String layout){
        this.layout = layout;
    }
    boolean hasLayout() {

        return layout != null;
    }
    public void main(String[] args) {
        for (Type type : Type.values()) {
            if (type.hasLayout()) {
                System.out.println(type + " has layout, it's " + type.layout);
            } else {
                System.out.println(type + " has no layout");
            }
        }
    }
}