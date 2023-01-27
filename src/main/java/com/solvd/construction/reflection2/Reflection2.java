package com.solvd.construction.reflection2;

import com.solvd.construction.building.Building;

import java.lang.reflect.*;
import java.util.logging.Logger;

public class Reflection2 {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Reflection2.class));

    public static void main(String args[]){
        try {
            Class building = Class.forName("com.solvd.construction.building.Building");
            Method m[] = building.getDeclaredMethods();
            for (int i = 0; i < m.length; i++)
                LOGGER.info(m[i].toString());

            boolean building1 = building.isInstance(new Building());
            LOGGER.info(String.valueOf(building1));
            boolean building2 = building.isInstance(new Building());
            LOGGER.info(String.valueOf(building2));

            Method methlist[] = building.getDeclaredMethods();
            for (int i = 0; i < methlist.length; i++) {
                Method m2 = methlist[i];
                LOGGER.info("name = " + m2.getName());
                LOGGER.info("decl class = " + m2.getDeclaringClass());
                Class pvec[] = m2.getParameterTypes();
                for (int j = 0; j < pvec.length; j++)
                    LOGGER.info(" param #" + j + " " + pvec[j]);
                Class evec[] = m2.getExceptionTypes();
                for (int j = 0; j < evec.length; j++)
                    LOGGER.info("exc #" + j + " " + evec[j]);
                LOGGER.info("return type = " + m2.getReturnType());
                LOGGER.info("-----");

                Constructor ctorlist[] = building.getDeclaredConstructors();
                for (int a = 0; a < ctorlist.length; a++) {
                    Constructor ct = ctorlist[a];
                    LOGGER.info("name = " + ct.getName());
                    LOGGER.info("decl class = " + ct.getDeclaringClass());
                    Class pve[] = ct.getParameterTypes();
                    for (int j = 0; j < pve.length; j++)
                        LOGGER.info("param #" + j + " " + pve[j]);
                    Class eve[] = ct.getExceptionTypes();
                    for (int j = 0; j < eve.length; j++)
                        LOGGER.info("exc #" + j + " " + eve[j]);
                    LOGGER.info("-----");

                    Field fieldlist[] = building.getDeclaredFields();
                    for (int с = 0; с < fieldlist.length; с++) {
                        Field fld = fieldlist[с];
                        LOGGER.info("name = " + fld.getName());
                        LOGGER.info("decl class = " + fld.getDeclaringClass());
                        LOGGER.info("type = " + fld.getType());
                        int mod = fld.getModifiers();
                        LOGGER.info("modifiers = " + Modifier.toString(mod));
                        LOGGER.info("-----");

                        Object arglist[] = new Object[2];
                        arglist[0] = new Building();
                        arglist[1] = new Building();
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    }
