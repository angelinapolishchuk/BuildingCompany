package com.solvd.construction.investors;

import com.solvd.construction.exceptions.EAmountOfContributionsException;
import com.solvd.construction.suppliers.Suppliers;

import java.util.Objects;

public class Investors {
    private String typeOfInvestment;
    private int investmentAmount;
    private int numberOfContributions;

    public Investors(String typeOfInvestment, int investmentAmount, int numberOfContributions) {
        typeOfInvestment = "financial";
        investmentAmount = 10000;
        numberOfContributions = 3;
    }

    double DivNumbers(int investmentAmount, int numberOfContributions) {
        double amountOfContribution;
        try {
            amountOfContribution = investmentAmount / numberOfContributions;{
                throw new EAmountOfContributionsException();
            }
        } catch (EAmountOfContributionsException e) {

            System.out.println("Деление на 0.");
        } finally {
            amountOfContribution = 0;
        }
        return amountOfContribution;
    }

    public String getTypeOfInvestment() {

        return typeOfInvestment;
    }

    public void setTypeOfInvestment(String typeOfInvestment) {

        this.typeOfInvestment = typeOfInvestment;
    }

    public int getInvestmentAmount() {

        return investmentAmount;
    }

    public void setInvestmentAmount(int investmentAmount) {

        this.investmentAmount = investmentAmount;
    }

    public int getNumberOfContributions() {

        return numberOfContributions;
    }

    public void setNumberOfContributions(int numberOfContributions) {

        this.numberOfContributions = numberOfContributions;
    }
    @Override
    public String toString() {
        return "Investors{" +
                ", typeOfInvestment='" + typeOfInvestment + '\'' +
                ", investmentAmount=" + investmentAmount +
                ", numberOfContributions=" + numberOfContributions +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfInvestment, investmentAmount, numberOfContributions);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Investors investors)) return false;
        return investmentAmount == investors.investmentAmount && numberOfContributions == investors.numberOfContributions && Objects.equals(typeOfInvestment, investors.typeOfInvestment);
    }

}

