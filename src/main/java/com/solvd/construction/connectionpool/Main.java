package com.solvd.construction.connectionpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;


public class Main {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));

    public void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(7);
        for (int i = 0; i < 10; i++) {
            MyThread myThread = new MyThread();
            executor.execute(myThread);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        LOGGER.info("Finished");
    }

    public class MyThread extends Thread {
        MyThread() {
            super("Новыйм поток");
            LOGGER.info("Создан новый поток " + this);
            start();
        }

        public void run() {
            LOGGER.info("Mой поток запущен ");

            try {
                for (int i = 0; i < 7; i++) {
                    LOGGER.info("Новый поток: " + i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                LOGGER.info("Второй поток прерван");
            }
        }
    }
}
