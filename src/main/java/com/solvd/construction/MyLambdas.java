package com.solvd.construction;

import com.solvd.construction.building.Building;

import java.util.logging.Logger;

public class MyLambdas {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(MyLambdas.class));
    @FunctionalInterface
    public interface IFunction<T1, T2, R>{
    R apply(T1 salary1, T2 salary2);
    }

    @FunctionalInterface
    public interface IHash<T> {
        int getHash(T material);
    }

    @FunctionalInterface
    interface IDoubleFunction<R>{
        double get(R surchargeCoefficient);
    }

    public static void main(String[] args){

        IFunction<Integer, Integer, Integer> function = (salary1, salary2) -> salary1 - salary2;
        LOGGER.info(String.valueOf(function.apply(750,500)));

        IHash<Object> objectIHash = Object::hashCode;
        LOGGER.info(String.valueOf(objectIHash.getHash("FrroconcretePlate")));

        IDoubleFunction<Double> function1 = Double::doubleValue;
        LOGGER.info(String.valueOf(function1.get(1.2)));

    }
}
