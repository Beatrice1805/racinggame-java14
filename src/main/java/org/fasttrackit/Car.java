package org.fasttrackit;
// inheritance or "is-a relationship"
public class Car extends AutoVehicle {


    int doorCount;
    // "has-a" relationship
    Engine engine;

    public Car(Engine engine) {
        super(engine);
    }
}
