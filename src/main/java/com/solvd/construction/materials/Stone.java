package com.solvd.construction.materials;

import com.solvd.construction.exceptions.EBuildingsException;
import com.solvd.construction.exceptions.ETypeOfStoneException;

import java.io.BufferedReader;
import java.io.IOException;

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

    public void Stone(String _typeOfStone) throws ETypeOfStoneException, IOException {
        BufferedReader reader = null;
        Stone typeOfStone = Stone.daytime(reader.readLine());

        try {
            if (typeOfStone == null) {
                throw new ETypeOfStoneException();
            }

        }
        catch (ETypeOfStoneException e) {
            System.out.println("Exception:".toString());
            return;
        }
    }

    private static Stone daytime(String typeOfStone) {
        Stone Granite = Stone.daytime("Granite");
        return Granite;
    }
}
