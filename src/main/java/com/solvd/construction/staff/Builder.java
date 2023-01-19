package com.solvd.construction.staff;

public class Builder extends Person {
    private int salary;

    public Builder(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return " Builder{" +
                ", salary =" + salary +
                '}';
    }
}
