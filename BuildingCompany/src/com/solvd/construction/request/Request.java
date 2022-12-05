package com.solvd.construction.request;

import java.util.Scanner;

public class Request {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int floors = scanner.nextInt();

        System.out.println("Type " + type);
        System.out.println("Floors " + floors);
    }
}

