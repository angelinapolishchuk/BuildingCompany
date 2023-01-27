package com.solvd.construction.reflection;

import com.solvd.construction.building.Building;

import java.lang.reflect.*;
import java.util.Arrays;

import java.util.logging.Logger;

public class Reflection {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Reflection.class));

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
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

        try {
            boolean b1 = building.isInstance(new Building());
            LOGGER.info(b1 + "\n");
            boolean b2 = building.isInstance(new Building());
            LOGGER.info(b1 + "\n");
        }
        catch (Throwable e) {
            LOGGER.info(String.valueOf(e));
        }

        Field nameOfBuilding = Class.class.getDeclaredField("SUMMER");
        nameOfBuilding.setAccessible(true);
        LOGGER.info("Old value: " + nameOfBuilding.get(nameOfBuilding));
        nameOfBuilding.set(building, "WINTER");
        LOGGER.info("New value: " + nameOfBuilding.get(nameOfBuilding) + "\n");

        Method[] methods = Class.class.getDeclaredMethods();
        Arrays.stream(methods).forEach(method ->
                LOGGER.info("\n Return type: " + method.getReturnType()
                        + "\n Modifiers: " + Modifier.toString(method.getModifiers())
                        + "\n Method name: " + method.getName()
                        + "\n Input parameters: " + Arrays.toString(method.getParameters()) + "\n")
        );

        Method method = Class.class.getDeclaredMethod("getBuildingOptions");
        LOGGER.info(method.invoke(building).toString());
        Method method1 = Class.class.getDeclaredMethod("Type", Type.class);
        LOGGER.info(method1.invoke(building, Type.class).toString());
    }
}


