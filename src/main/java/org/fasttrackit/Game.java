package org.fasttrackit;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Track;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private Track() tracks = new Track(3);
    private List<Vehicle>


    public void start ()
    {
        System.out.println("Starting Game...");

        initializeTracks();
        displayTracks();

        Track selectedTrack= getSelectedTrackFromUser();

        initializeComeptitors();
        Vehicle[] competitors = new Vehicle[0];
        for ( Vehicle vehicle : competitors) {
            System.out.println("It's "+ vehicle.getName() + "'s turn.");

        }
        private double getAccelerationSpeedFromUser() {
        System.out.println("Please enter acceleration speed");
        Scanner scanner = new Scanner (System.in);

    }
private Track getSelectedTrackFromUser(){
        System.out.println("Please selectr track number");
        Scanner scanner = new Scanner (System.in);
        int.selectedTrackNumber
    }

        int playerCount = getPlayerCountFromUser();

        String vehicleName = getVehicleNameFromUser();

        System.out.println("Name from user: " + vehicleName);

        //enhanced for
        for(Vehicle vehicle : competitors)
            System.out.println(" It's " + vehicle.getName()+ " 's turn");
        double speed = getAccelerationSpeedFromUser();

        vehicle.accelerate(speed);
        if(vehicle.getTraveledDistance) >= selectedTrack.getLength()) {
        System.out.println(" The winner is " + vehicle.getName() + "!");
        break;
    }
    }
    private Track getSelectedTrackFromUser();{
        System.out.println("Please select track number");
        Scanner sc = new Scanner(System.in);
        int selected = sc.nextInt();
        Track selectedTrack = tracks(selected -1)
        System.out.println("Selected track is " + selectedTrack.getName());
        return selectedTrack;
    }


private void initializeComeptitors() {
    int playerCount = getPlayerCountFromUser();
    System.out.println("Number of players: "+playerCount);

    for (int i = 1; i <playerCount; i++) {
        System.out.println("Addind player "+ i);
        Vehicle vehicle = new Vehicle();
        vehicle.setName(getVehicleNameFromUser());
        vehicle.setFuelLevel((80));
        vehicle.setMaxSpeed(300);
        System.out.println("Vehicle for player " + i +": " +
                vehicle.getName() + "- Mileage");
                competitors.add(vehicle);
    }
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
