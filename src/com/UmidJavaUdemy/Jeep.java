package com.UmidJavaUdemy;

public class Jeep extends Car {
    private int roadService;

    public Jeep(int speed, int direction,  int roadService) {
        super(speed, direction, "Wrangler", "4WD", 5, 5, 6, false);
        this.roadService = roadService;
    }
    public void accelerate(int rate){
        int newSpeed = getSpeed() + rate;
        if(newSpeed == 0){
            stop();
            changeCurrentGear(1);
        }
        else if(newSpeed >0 && newSpeed <=10){
            changeCurrentGear(1);
        }
        else if(newSpeed >10 && newSpeed <=20) {
            changeCurrentGear(2);
        }
        else if(newSpeed >20 && newSpeed <=30) {
            changeCurrentGear(3);
        }
        else {
            changeCurrentGear(4);
        }
        if(newSpeed > 0){
            changeSpeed(newSpeed, getDirection());
        }
    }
}

