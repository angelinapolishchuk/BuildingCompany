package com.solvd.construction.reflection;

import com.solvd.construction.building.Building;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Set;
import java.util.logging.Logger;

import static java.lang.Class.forName;
import static java.util.Set.*;

public class Reflection {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Reflection.class));

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        Class building = Class.forName("com.solvd.construction.building.Building");

        LOGGER.info("Modifiers: " + Modifier.toString(building.getModifiers()));

        LOGGER.info(", Name of the class: " + building.getName() + "\n");

        Constructor[] constructors = building.getConstructors().clone();

        LOGGER.info(", Number of class constructors:" + constructors.length + "\n");

        for (Constructor c :
                constructors) {
            Class[] params = c.getParameterTypes();

            for (Class param :
                    params) {
                LOGGER.info(param.getName() + "\n");
            }
        }

        Field nameOfBuilding = building.getClass().getDeclaredField("nameOfBuilding");
        nameOfBuilding.setAccessible(true);
        LOGGER.info("Old value: " + nameOfBuilding.get(nameOfBuilding));
        nameOfBuilding.set(building, "Megapolis");
        LOGGER.info("New value: " + nameOfBuilding.get(nameOfBuilding) + "\n");

        Method[] methods = building.getClass().getDeclaredMethods();
        Arrays.stream(methods).forEach(method ->
                LOGGER.info("\n Return type: " + method.getReturnType()
                        + "\n Modifiers: " + Modifier.toString(method.getModifiers())
                        + "\n Method name: " + method.getName()
                        + "\n Input parameters: " + Arrays.toString(method.getParameters()) + "\n")
        );

        Method method = building.getClass().getDeclaredMethod("getBuildingOptions");
        LOGGER.info(method.invoke(building).toString());
        Method method1 = building.getClass().getDeclaredMethod("Type", Type.class);
        LOGGER.info(method1.invoke(building, Type.class).toString());
    }
}


