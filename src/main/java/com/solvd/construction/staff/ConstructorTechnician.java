package com.solvd.construction.staff;

public class ConstructorTechnician extends Builder {
    private double surchargeCoefficientForCT = 1.2;
    private double surchargeCT;

    public ConstructorTechnician(String firstName, String lastName, int age, int salary, double surchargeCoefficientForCT, double surchargeCT) {
        super(firstName, lastName, age, salary);
        this.surchargeCoefficientForCT = surchargeCoefficientForCT;
        this.surchargeCT = surchargeCT;
    }

    public double setSurchargeCT(int surchargeCT) {
        return surchargeCT;
    }

    public double getSurchargeCT() {
        return surchargeCT;
    }

    public double getSurchargeCoefficientForCT(double v) {
        return 1.2;
    }

    public double setSurchargeCoefficientForCT(double surchargeCoefficientForCT) {
        return 1.2;
    }
}
