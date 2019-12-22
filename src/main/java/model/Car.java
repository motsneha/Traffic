package model;

import java.util.Arrays;

public class Car extends Vehicle {

    private static Car car;

    private Car(){

    }
    static {
        car = new Car();
        car.speed = 20;
        car.craterSprint = 3;
        car.favourableWeather = Arrays.asList(Weather.RAINY,Weather.SUNNY, Weather.WINDY);
    }

    public static Car getInstance(){
        if(car == null){
            car = new Car();
        }
        return car;
    }



    @Override
    public String toString() {
        return "CAR";
    }
}
