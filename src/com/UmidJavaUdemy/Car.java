package com.UmidJavaUdemy;

public class Car extends Vehicle {
    private int wheels, doors, gears, currentGear;
    private boolean isManual;

    public Car(int speed, int direction, String name, String model, int wheels, int doors, int gears,  boolean isManual) {
        super(speed, direction, name, model);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 1;
        this.isManual = isManual;
    }

    public void changeCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear");
    }
    public void changeSpeed(int speed, int direction){
        System.out.println("Car.changeSpeed():  Speed " + speed + " direction " + direction);
        move(speed, direction);
    }

    @Override
    public void stop() {
        super.stop();
    }
}

