package com.solvd.construction.staff;

import java.util.ArrayList;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Builder extends Person{
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Builder.class));
        final private int experience;

        public Builder(String firstName, String lastName, int age, int experience) {
            super(firstName, lastName, age);
            this.experience = experience;
        }

        public int getExperience() {
            return experience;
        }

        public int setExperience(int experience) {
            return experience;
        }
    public ArrayList<Builder> createListOfBuilders() {
        ArrayList<Builder> builders = new ArrayList<>();
        builders.add(new Builder("Павел", "Петров", 22, setExperience(3)));
        builders.add(new Builder("Самвел", "Петриков", 25, setExperience(7)));
        builders.add(new Builder("Пётр", "Сидоров", 32, setExperience(12)));

        for (int i = 0; i < builders.size(); i++)
            if (builders.get(i).getExperience() > builders.get(i + 1).getExperience())

                for (i = 0; i < builders.size(); i++)
                    LOGGER.info(builders.get(i).toString() + "\n");
        return builders;
    }
    public int calculationOfSalary(int experience, int salary){
        if (experience < 5) {
            salary = 500;
        } else if (experience > 5 && experience < 10) {
            salary = 750;
        } else if (experience > 10) {
            salary = 1000;}
        return salary;
    }
}
