package com.solvd.construction.request;

import com.solvd.construction.buildingtypes.CivilBuildings;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Request {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Request.class));
    private int amountOfTheRequest;
    public String acceptTheRequest() {

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int floors = scanner.nextInt();

        LOGGER.info("Type " + type);
        return type;
    }
    public int getAmountOfTheRequests() {

        return 1500000;
    }

    public void setAmountOfTheRequest(int amountOfTheRequest) {

        this.amountOfTheRequest = amountOfTheRequest;
    }
    public Request (int amountOfTheRequest) {

        this.amountOfTheRequest = amountOfTheRequest;
    }
    public static Queue<Request> createQueueList() {
        Queue<Request> requests = new PriorityQueue<>();
        Request Request1 = new Request(120000);
        Request Request2 = new Request(150000);
        Request Request3 = new Request(800000);
        requests.add(Request1);
        requests.add(Request2);
        requests.add(Request3);
        return requests;
    }
}

