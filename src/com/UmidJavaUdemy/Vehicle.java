package com.UmidJavaUdemy;
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.
public class Vehicle {
    private int speed, direction;
    private String name, model;

    public Vehicle(int speed, int direction, String name, String model) {
        this.speed = speed;
        this.direction = direction;
        this.name = name;
        this.model = model;
    }
    public void steer(int direction){
        this.direction +=direction;
        System.out.println("Vehicle.steer() at direction" + direction + " degrees");
    }
    public void move(int speed, int direction){
        this.speed = speed;
        this.direction = direction;
        System.out.println("Vehicle.move() with speed "+ this.speed + " in direction "+ this.direction);
    }

    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
    public void stop(){
        this.speed = 0;
    }
}
