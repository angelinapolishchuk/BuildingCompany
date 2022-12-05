package com.solvd.construction.investors;

import com.solvd.construction.suppliers.Suppliers;

import java.util.Objects;

public class Investors {
    private String typeOfInvestment;
    private int investmentAmount;

    public Investors (String typeOfInvestment, int investmentAmount) {
        this.typeOfInvestment = typeOfInvestment;
        this.investmentAmount = investmentAmount;
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

    @Override
    public String toString() {
        return "Investors{" +
                ", typeOfInvestment='" + typeOfInvestment + '\'' +
                ", investmentAmount=" + investmentAmount +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfInvestment, investmentAmount);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Investors investors)) return false;
        return investmentAmount == investors.investmentAmount && Objects.equals(typeOfInvestment, investors.typeOfInvestment);
    }

}

