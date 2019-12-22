package service;

import model.Orbit;
import model.Vehicle;
import model.Weather;

/**
 * The main business logic class that is a strategy to execute the time
 * calculation logic on all the vehicles permissible in the given weather
 * and return the vehicle and the fastest orbit
 */
public class TrafficService {


    private Orbit orbit1 = new Orbit(20, 18);
    private Orbit orbit2 = new Orbit(10, 20);;

    private void defineOrbits(Float orbit1Speed, Float orbit2Speed){
        orbit1.setSpeed(orbit1Speed);
        orbit2.setSpeed(orbit2Speed);
    }


    private float calculateTime(Orbit orbit, Weather weather, Vehicle vehicle) {

        float speed = Math.min(vehicle.getSpeed(), orbit.getSpeed());

        int carters = orbit.getCraters() + (weather.getCraterSpeedRate() * (orbit.getCraters() / 100));

        return (vehicle.getCraterSprint() * carters) +
                ((Float.valueOf(orbit.getDistance())/ speed) * 60);

    }

    public String findFastestVehicleOrbit(Weather weather, Float orbit1Speed, Float orbit2Speed){
        defineOrbits(orbit1Speed, orbit2Speed);
        float minTime = Float.MAX_VALUE;
        String result = "";
        for (Vehicle vehicle : VehicleFactory.getAllVehicles(weather)) {

            float orbit1Time = calculateTime(orbit1, weather, vehicle);
            float orbit2Time = calculateTime(orbit2, weather, vehicle);

            if(orbit1Time <= minTime){
                minTime = orbit1Time;
                result = vehicle + " ORBIT1";
            }
            if(orbit2Time <= minTime){
                minTime = orbit2Time;
                result = vehicle + " ORBIT2";
            }

        }
        return  result;
    }
}
