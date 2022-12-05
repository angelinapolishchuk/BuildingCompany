package com.solvd.construction.staff;

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
}
