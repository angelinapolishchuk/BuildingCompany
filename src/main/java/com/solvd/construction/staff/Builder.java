package com.solvd.construction.staff;

import com.solvd.construction.building.Building;
import com.solvd.construction.exceptions.EBuilderException;
import com.solvd.construction.materials.Materials;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Supplier;
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

    Building AgriculturalBuilding = new Building(2000000);
    Building CivilBuilding = new Building(500000);
    Building IndustrialBuilding = new Building(1000000);
    public ArrayList<Building> createListOfBuilding(){
        ArrayList<Building> building = new ArrayList<>();
        building.add(AgriculturalBuilding);
        building.add(CivilBuilding);
        building.add(IndustrialBuilding);
        Optional<Building> any = building.stream().findAny();
        LOGGER.info((Supplier<String>) any.get());
        return building;
    }

    Materials Stone1 = new Materials(2000);
    Materials Wood1 = new Materials(3000);
    Materials FerroconcretePlate1 = new Materials(6000);
    Materials Stone2 = new Materials(5000);
    Materials Wood2 = new Materials(1000);
    Materials FerroconcretePlate2 = new Materials(8000);
    public ArrayList<Materials> createListOfMaterials(){
        ArrayList<Materials> materials = new ArrayList<>();
        materials.add(Stone1);
        materials.add(Wood1);
        materials.add(FerroconcretePlate1);
        materials.add(Stone2);
        materials.add(Wood2);
        materials.add(FerroconcretePlate2);
        Optional<Materials> any = materials.stream().findAny();
        LOGGER.info((Supplier<String>) any.get());
        return materials;
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
