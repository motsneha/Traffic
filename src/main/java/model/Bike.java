package model;

import java.util.Arrays;

public class Bike extends Vehicle {

    private static Bike bike;

    private Bike(){

    }

   static {

        bike = new Bike();
        bike.craterSprint = 2;
        bike.speed = 10;
        bike.favourableWeather = Arrays.asList(Weather.SUNNY, Weather.WINDY);
    }
    public static Bike getInstance(){
       return bike;
    }

    @Override
    public String toString() {
        return "BIKE";
    }
}
