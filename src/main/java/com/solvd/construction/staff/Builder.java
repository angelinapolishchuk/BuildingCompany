package com.solvd.construction.staff;

import com.solvd.construction.exceptions.EBuilderException;

import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.stream.Stream;


public class Builder extends Person{
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Builder.class));
        final private int experience;

        public Builder(String firstName, String lastName, int age, int experience) throws EBuilderException {
            super(firstName, lastName, age);
            this.experience = experience;
        }



    public int getExperience() {
            return experience;
        }

        public int setExperience(int experience) throws EBuilderException {
            return experience;
        }
    public ArrayList<Builder> createListOfBuilders() throws EBuilderException {
        ArrayList<Builder> builders = new ArrayList<>();
        builders.add(new Builder("Павел", "Петриков", 22, setExperience(4)));
        builders.add(new Builder("Самвел", "Петриков", 25, setExperience(7)));
        builders.add(new Builder("Пётр", "Сидоров", 32, setExperience(12)));
        builders.forEach(builder -> {
            try {
                setExperience(getExperience() + 1);
            } catch (EBuilderException e) {
                throw new RuntimeException(e);
            }
        });

        for (int i = 0; i < builders.size(); i++)
            if (builders.get(i).getExperience() > builders.get(i + 1).getExperience())
                for (i = 0; i < builders.size(); i++)
                    LOGGER.info(builders.get(i).toString() + "\n");
        return builders;
    }

    Stream<Builder> chooseOfBuilders = createListOfBuilders().stream()
            .filter(c -> c.getExperience() > 1)
            .filter(c-> c.enterAge() > 18);

    double averageAge = createListOfBuilders().stream()
            .mapToInt(Builder::getAge)
            .summaryStatistics()
            .getAverage();

    {int maxFirstNameLength = createListOfBuilders().stream()
            .mapToInt((value) -> {
                return value.getFirstName().length();
            })
            .summaryStatistics()
            .getMax();
    LOGGER.info(" MaxFirstNameLength: " + maxFirstNameLength);}


    public static int calculationOfSalary(int experience, int salary){
        if (experience < 5) {
            salary = 500;
        } else if (experience > 5 && experience < 10) {
            salary = 750;
        } else if (experience > 10) {
            salary = 1000;}
        return salary;
    }
    public static int getSalary() {
        return calculationOfSalary(7, 750);
    }
}
