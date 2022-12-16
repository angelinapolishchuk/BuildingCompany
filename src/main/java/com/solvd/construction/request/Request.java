package com.solvd.construction.request;

import com.solvd.construction.buildingtypes.CivilBuildings;

import java.util.Scanner;

public class Request {
    private int amountOfTheRequest;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int floors = scanner.nextInt();

        System.out.println("Type " + type);
        System.out.println("Floors " + floors);
    }
    public int getAmountOfTheRequests() {

        return amountOfTheRequest;
    }

    public void setAmountOfTheRequest(int amountOfTheRequest) {

        this.amountOfTheRequest = amountOfTheRequest;
    }
    public Request (int amountOfTheRequest) {
        this.amountOfTheRequest = amountOfTheRequest;
    }
}

