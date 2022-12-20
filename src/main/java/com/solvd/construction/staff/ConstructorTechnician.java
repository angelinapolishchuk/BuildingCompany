package com.solvd.construction.staff;

public class ConstructorTechnician extends Builder{

   private double surchargeCoefficientForCT = 1.2;
   private double surchargeCT;

    public ConstructorTechnician(String firstName, String lastName, int age, int experience, double surchargeCoefficientForCT, double surchargeCT) {
        super(firstName, lastName, age, experience);
        this.surchargeCoefficientForCT = surchargeCoefficientForCT;
        this.surchargeCT = surchargeCT;
    }
    public double calculationOfTheSurcharge(Builder salary){
        surchargeCT = calculationOfSalary(3,500) * surchargeCoefficientForCT;
        return surchargeCT;
    }
    public double getSurchargeCT() {
        return surchargeCT;
    }

    public double setSurchargeCT(int surchargeCT) {
        return surchargeCT;
    }
    public double getSurchargeCoefficientForCT() {
        return 1.2;
    }

    public double setSurchargeCoefficientForCT(double surchargeCoefficientForCT) {
        return 1.2;
    }
}
