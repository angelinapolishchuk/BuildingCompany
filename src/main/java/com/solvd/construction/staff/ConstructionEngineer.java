package com.solvd.construction.staff;

import com.solvd.construction.exceptions.EBuilderException;

public class ConstructionEngineer extends Builder{
    private double surchargeCoefficientForCE = 1.5;
    private double surchargeCE;


    public ConstructionEngineer(String firstName, String lastName, int age, int experience, double surchargeCoefficientForCE, double surchargeCE) throws EBuilderException {
        super(firstName, lastName, age, experience);
        this.surchargeCoefficientForCE = surchargeCoefficientForCE;
        this.surchargeCE = surchargeCE;
    }
    public double calculationOfTheSurcharge(int salary){
        surchargeCE = calculationOfSalary(12,1000) * getSurchargeCoefficientForCE(1.5) * Math.random() ;
        return surchargeCE;
    }
    public double getSurchargeCE() {
        return calculationOfTheSurcharge(1000);
    };

    public double setSurchargeCE(int surchargeCE) {
        return surchargeCE;
    }
    public double getSurchargeCoefficientForCE(double v) {
        return 1.5;
    }

    public double setSurchargeCoefficientForCE(double surchargeCoefficientForCE) {
        return 1.5;
    }
}

