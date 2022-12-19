package com.solvd.construction.staff;

import java.util.LinkedList;

public class Builder extends Person{
        private String qualification;

        public Builder(String firstName, String lastName, int age, String qualification) {
            super(firstName, lastName, age);
            this.qualification = qualification;
        }

        public String getQualification() {
            return qualification;
        }

        public void setQualification(String qualification) {
            this.qualification = qualification;
    }
    public static LinkedList<Builder> createBuilderList() {
        LinkedList<Builder> builders = new LinkedList<>();
        Builder builder1 = new Builder("Павел", "Петров", 22, "инженер-строитель");
        Builder builder2 = new Builder("Самвел", "Петриков", 25, "инженер-строитель");
        Builder builder3 = new Builder("Пётр", "Сидоров", 32, "техник-строитель");
        builders.add (builder1);
        builders.add (builder2);
        builders.add (builder3);
        return builders;
    }
}
