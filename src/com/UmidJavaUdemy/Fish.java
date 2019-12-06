package com.UmidJavaUdemy;

public class Fish extends Animal{
    private int gills, eyes, fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){
        System.out.println("Fish rests");
    }
    private void moveMuscles(){
        System.out.println("Fish moves muscles");
    }
    private void moveBackFin(){
        System.out.println("Fish moves back fin");
    }
    public void swim(){
        moveMuscles();
        moveBackFin();
        super.move(10);
    }
}
