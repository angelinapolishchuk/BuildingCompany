package com.solvd.construction.staff;


import com.solvd.construction.exceptions.EBuilderException;

public class ConstructorTechnician extends Builder{

   private double surchargeCoefficientForCT = 1.2;
   private double surchargeCT;

    public ConstructorTechnician(String firstName, String lastName, int age, int experience, double surchargeCoefficientForCT, double surchargeCT) throws EBuilderException {
        super(firstName, lastName, age, experience);
        this.surchargeCoefficientForCT = surchargeCoefficientForCT;
        this.surchargeCT = surchargeCT;
    }



    public double calculationOfTheSurcharge(int salary) {
        surchargeCT = calculationOfSalary(3, 500) * getSurchargeCoefficientForCT(1.2) * Math.random();
        return surchargeCT;
    }

    public double getSurchargeCT() {
        return calculationOfTheSurcharge(500);
    }

    public double setSurchargeCT(int surchargeCT) {
        return surchargeCT;
    }
    public double getSurchargeCoefficientForCT(double v) {
        return 1.2;
    }

    public double setSurchargeCoefficientForCT(double surchargeCoefficientForCT) {
        return 1.2;
    }
}
