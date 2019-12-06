package com.UmidJavaUdemy;

public class Dog extends Animal {
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.coat = coat;
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
    }
    private int eyes, legs, tail, teeth;
    private String coat;
    private void chew(){
        System.out.println("Dogs chew");

    }

    @Override
    public void eat() {
        super.eat();
        chew();
    }
}
