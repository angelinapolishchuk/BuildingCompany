package com.solvd.construction.staff;

public class ConstructionEngineer extends Builder{
    private double surchargeCoefficientForCE = 1.5;
    private double surchargeCE;


    public ConstructionEngineer(String firstName, String lastName, int age, int experience, double surchargeCoefficientForCE, double surchargeCE) {
        super(firstName, lastName, age, experience);
        this.surchargeCoefficientForCE = surchargeCoefficientForCE;
        this.surchargeCE = surchargeCE;
    }
    public double calculationOfTheSurcharge(Builder salary){
        surchargeCE = calculationOfSalary(12,1000) * surchargeCoefficientForCE;
        return surchargeCE;
    }
    public double getSurchargeCE() {
        return surchargeCE;
    }

    public double setSurchargeCE(int surchargeCE) {
        return surchargeCE;
    }
    public double getSurchargeCoefficientForCE() {
        return 1.5;
    }

    public double setSurchargeCoefficientForCE(double surchargeCoefficientForCE) {
        return 1.5;
    }
}

