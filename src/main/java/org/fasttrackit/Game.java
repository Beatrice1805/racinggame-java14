package org.fasttrackit;

import java.util.Scanner;

public class Game {

    public void start (){
        System.out.println("Starting Game...");

        int playerCount = getPlayerCountFromUser();

        String vehicleName = getVehicleNameFromUser();

        System.out.println("Name from user: " + vehicleName);
    }

    private String getVehicleNameFromUser(){
        System.out.println("Please enter vehicle name.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private int getPlayerCountFromUser() {
        System.out.println(" Please enter player count.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
