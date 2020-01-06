package org.fasttrackit;

import org.w3c.dom.ls.LSOutput;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Track[] tracks = new Track[3];

    int[]ints = new int[10];

    public void start() {
        System.out.println("Starting game...");

        initializeTracks();
        displayTracks();

        int playerCount = getPlayerCountFromUser();
        System.out.println("Number of players: " + playerCount);

        String vehicleName = getVehicleNameFromUser();
        System.out.println("Name from user: " + vehicleName);
    }
        private void initializeTracks() {
            Track track1 = new Track();
            track1.setName("Silverstone");
            track1.setLength(4.2);

            tracks[0] = track1;

            Track track2 = new Track();
            track2.setName("Transylvania");
            track2.setLength(400.2);
            tracks[1] = track2;
        }
        private void displayTracks() {
            System.out.println("Available tracks:");

            //classic for loop
            for(int i = 0; i < tracks.length; i++){
                if(tracks[i] != null) {
                    System.out.println(
                            (i + 1)+"."+ tracks[i].getName() + " - "+ tracks[i].getLength() +"km");
                }
            }
        }
            private String getVehicleNameFromUser() {
                System.out.println("Please enter vehicle name.");
                Scanner scanner = new Scanner(System.in);
                return scanner.nextLine();


     }
         private Track[] tracks = new Track[3];
         private List<Vehicle> competitors
         private boolean winnerNotKnown = true;
         private int competitorsWithoutFuel = 0;

     List<Vehicle> competitors = new ArrayList();


    public void start() throws Exception {
        System.out.println("Starting Game...");

        initializeTracks();
        displayTracks();

        Track selectedTrack = getSelectedTrackFromUser();

        initializeComeptitors();

      while (winnerNotKnown competitorsWithoutFuel < competitors.size()) {
            System.out.println();
            System.out.println("New round");
          playOneRound(selectedTrack);
      }

        private double getAccelerationSpeedFromUser;{
            System.out.println("Please enter acceleration speed");
            try {
                Scanner scanner = new Scanner(System.in);
                return  scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("You have entered am invalid value");
                //recursion
                double speed = getAccelerationSpeedFromUser();
                return speed;
            }
                e.printStackTrace();
            }

        }
        public Track getSelectedTrackFromUser;{
            System.out.println("Please selectr track number");
            Scanner scanner = new Scanner(System.in);
            try {
                int selectedTrackNumber = scanner.nextInt();
                 selectedTrackNumber = tracks[selectedTrackNumber - 1];
                System.out.println(" Selected track in " + selectedTrack.getName();
                return selectedTrack;
            } catch (InputMismatchException e) {
                throw new RuntimeException("You have entered an invalid value.");
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new Exception(" You have selected a non-exiting track");

            }finally{
            System.out.println("Always executed");
        }




        //enhanced for
        for (Vehicle vehicle : competitors)
            System.out.println(" It's " + vehicle.getName() + " 's turn");
        double speed = getAccelerationSpeedFromUser();

        vehicle.accelerate(speed);
        if (vehicle.getTraveledDistance) >=selectedTrack.getLength()){
            System.out.println(" The winner is " + vehicle.getName() + "!");
            break;
        }
        if (vehicle.getFuelLevel() <-0
            competitorsWithoutFuel;
    }

    private Track getSelectedTrackFromUser();

    {
        System.out.println("Please select track number");
        Scanner sc = new Scanner(System.in);
        int selected = sc.nextInt();
        Track selectedTrack = tracks(selected - 1)
        System.out.println("Selected track is " + selectedTrack.getName());
        return selectedTrack;
    }
Track selectedTrack =  tracks[getSelectedTrackFromUser(-1)];)

    private void initializeComeptitors() {
        int playerCount = getPlayerCountFromUser();
        System.out.println("Number of players: " + playerCount);

        for (int i = 1; i < playerCount; i++) {
            System.out.println("Addind player " + i);
            Vehicle vehicle = new Vehicle();
            vehicle.setName(getVehicleNameFromUser());
            vehicle.setFuelLevel((80));
            vehicle.setMaxSpeed(300);
            System.out.println("Vehicle for player " + i + ": " +
                    vehicle.getName() + "- Mileage");
            competitors.add(vehicle);
        }
        }


    private String getVehicleNameFromUser() {
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
