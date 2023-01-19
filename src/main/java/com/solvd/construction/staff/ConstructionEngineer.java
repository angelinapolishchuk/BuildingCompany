package com.solvd.construction.staff;

public class ConstructionEngineer extends Builder {
    private double surchargeCoefficientForCE = 1.5;
    private double surchargeCE;

    public ConstructionEngineer(String firstName, String lastName, int age, int salary, double surchargeCoefficientForCE, double surchargeCE){
        super(firstName, lastName, age, salary);
        this.surchargeCoefficientForCE = surchargeCoefficientForCE;
        this.surchargeCE = surchargeCE;
    }

    public double setSurchargeCE(int surchargeCE) {
        return surchargeCE;
    }

    public double getSurchargeCE() {
        return surchargeCE;
    }

    public double getSurchargeCoefficientForCE(double v) {
        return 1.5;
    }

    public double setSurchargeCoefficientForCE(double surchargeCoefficientForCE) {
        return 1.5;
    }

}

