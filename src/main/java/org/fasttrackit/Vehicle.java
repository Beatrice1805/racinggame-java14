package org.fasttrackit;

import java.time.LocalDate;
import java.util.Date;

public class Vehicle {

    // class variable
    static int totalCount;

    // instance variables
    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double traveledDistance;
    boolean running;

    public vehicle() {
        totalCount++
    }


    Date creationDate = new Date(2019, 11, 30);
    LocalDate createdDate = LocalDate.now().minusWeeks(2);
    long timestamp = 31254L;

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " is accelerating with " + speed + " for " +durationInHours + "h.");

        //local variable (declared inside a method)
        double distance= speed * durationInHours;

        traveledDistance = traveledDistance + distance;
        // same result as the statement above
      //   traveledDistance += distance;+
        System.out.println(" Total traveled distance: accelerate");
        double usedFuel = distance * mileage/ 100;
        System.out.println("Used fuel :" + usedFuel);
        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel level: " +fuelLevel);


        System.out.println("Studying class variables (static variable)...");
        Vehicle vehicle1 = new Vehicle();
        vehicle1.totalCount = 10;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.totalCount = 20;

        Vehicle.totalCount = 30;

        System.out.println("Total vehicle count from vehicle1: " + vehicle1.totalCount);
        System.out.println("Total vehicle count from vehicle2: " + vehicle2.totalCount);
        System.out.println("Total vehicle count from Vehicle class: " + Vehicle.totalCount);
        return distance;

    }

}
