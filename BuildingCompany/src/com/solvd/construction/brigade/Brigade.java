package com.solvd.construction.brigade;

import com.solvd.construction.staff.Builder;
import com.solvd.construction.staff.Manager;

public class Brigade {
        private int numberOfStuff;
        private Manager manager;
        private Builder builder;

        public Brigade(int numberOfStuff, Manager manager, Builder builder) {
            this.numberOfStuff = numberOfStuff;
            this.manager = manager;
            this.builder = builder;
        }

        public int getNumberOfStuff() {
            return numberOfStuff;
        }

        public void setNumberOfStuff(int numberOfStuff) {
            this.numberOfStuff = numberOfStuff;
        }

        public Manager getManager() {
            return manager;
        }

        public void setManager(Manager manager) {
            this.manager = manager;
        }

        public Builder getBuilder() {
            return builder;
        }

        public void setBuilder(Builder builder) {
            this.builder = builder;
        }
    }
