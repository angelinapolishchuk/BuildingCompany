package com.solvd.construction.request;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.logging.Logger;

public class Request {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Request.class));
    private int amountOfTheRequest;

    public int getAmountOfTheRequest() {

        return amountOfTheRequest;
    }

    public void setAmountOfTheRequest(int amountOfTheRequest) {

        this.amountOfTheRequest = amountOfTheRequest;
    }

    public Request(int amountOfTheRequest) {

        this.amountOfTheRequest = amountOfTheRequest;
    }

    public Queue<Request> createQueueList() {
        Queue<Request> requests = new PriorityQueue<>();
        Request Request1 = new Request(120000);
        Request Request2 = new Request(150000);
        Request Request3 = new Request(800000);
        requests.add(Request1);
        requests.add(Request2);
        requests.add(Request3);
        return requests;

    }

    {
        double calculationOfAllAmounts = createQueueList().stream()
                .mapToInt(Request::getAmountOfTheRequest)
                .summaryStatistics()
                .getSum();
        LOGGER.info("Sum of all amounts: " + calculationOfAllAmounts);
    }

}