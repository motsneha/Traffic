package io;

import factory.VehicleFactory;
import model.Orbit;
import model.Vehicle;
import model.Weather;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Please provide the complete path to input file for the the program to run");
            return;
        }
        String inputFileName = args[0];

        try {
            Path path = Paths.get(inputFileName);

            List<String> lines = Files.lines(path).collect(Collectors.toList());
            Orbit orbit1;
            Orbit orbit2;
            for (String input : lines) {
                String[] params = input.split(" ");
                if(params.length == 3) {
                    String weather = params[0];

                    float speed = Float.parseFloat(params[1]);
                    float speed2 = Float.parseFloat(params[2]);

                    orbit1 = new Orbit(20, 18, speed);
                    orbit2 = new Orbit(10, 20, speed2);

                    Weather weatherEnum = Weather.valueOf(weather);
                    String result = "";

                    calculateTimeForAllOrbits(orbit1, orbit2, weatherEnum);

                    if(orbit1.getTime() <= orbit2.getTime()){
                            result = orbit1.getVehicle() + " ORBIT1";
                        }else {
                            result = orbit2.getVehicle() + " ORBIT2";
                        }
                        System.out.println(result);
                }
                else{
                    System.out.println("Skipping the incomplete input" + params);
                }
            }

        } catch (IOException e) {
            System.out.println("Unable to read fileName = [" + inputFileName + "]");
            throw new RuntimeException(e);
        }
    }

    public static void calculateTimeForAllOrbits(Orbit orbit1, Orbit orbit2, Weather weatherEnum) {

        for (Vehicle vehicle : VehicleFactory.getAllVehicles(weatherEnum)) {

            orbit1.calculateTimeToCompleteTheOrbit(vehicle, weatherEnum);

            orbit2.calculateTimeToCompleteTheOrbit(vehicle, weatherEnum);

        }
    }
}
