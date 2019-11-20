package org.fasttrackit;

import java.time.LocalDate;
import java.util.Date;

public class Vehicle {

    // instance variables
    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double traveledDistance;
    boolean running;


    Date creationDate = new Date( year:2019, month:11, date:30)
    LocalDate createdDate = LocalDate.now().minusWeeks(2);
    long timestamp = 31254L;

}
