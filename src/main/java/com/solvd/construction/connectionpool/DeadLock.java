package com.solvd.construction.connectionpool;

import java.util.logging.Logger;

public class DeadLock implements Runnable{

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(DeadLock.class));

    class Object1 {
        synchronized void performingObject1(Object2 object2) {
            String name = Thread.currentThread().getName();
            LOGGER.info(name + "Enter Object1");
            try {
                Thread.sleep(1000);
            } catch(Exception e) {
                LOGGER.info("Object1 interrupted");
            }
            LOGGER.info(name + " Calling Object2.last()");
            object2.last();
        }

        synchronized void last() {
            LOGGER.info("Inside Object1.last");
        }
    }

    class Object2 {
        synchronized void performingObject2(Object1 object1) {
            String name = Thread.currentThread().getName();
            LOGGER.info(name + "Enter Object2");

            try {
                Thread.sleep(1000);
            } catch(Exception e) {
                LOGGER.info("Object2 interrupted");
            }

            LOGGER.info(name + " Calling Object1.last()");
            object1.last();
        }

        synchronized void last() {
            LOGGER.info("Inside Object2.last");
        }
    }

    Object1 object1 = new Object1();
    Object2 object2 = new Object2();

    DeadLock() {
        Thread.currentThread().setName("MainThread");
        Thread tread1 = new Thread(this, "RacingThread");
        tread1.start();

        object1.performingObject1(object2);
        LOGGER.info("Back in MainThread");
    }

    public static void main(String args[]) {
        new DeadLock();
    }

    @Override
    public void run() {
        object2.performingObject2(object1);
        LOGGER.info("RacingThread");
    }
}
