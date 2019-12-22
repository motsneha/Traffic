package io;

import model.Weather;
import service.TrafficService;

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
            TrafficService trafficService = new TrafficService();
            for (String input : lines) {
                String[] params = input.split(" ");
                if(params.length == 3) {
                    String weather = params[0];
                    float speed = Float.parseFloat(params[1]);
                    float speed2 = Float.parseFloat(params[2]);
                    String fastestVehicleOrbit = trafficService.findFastestVehicleOrbit(Weather.valueOf(weather), speed, speed2);
                    System.out.println(fastestVehicleOrbit);
                }else{
                    System.out.println("Skipping the incomplete input" + params);
                }
            }

        } catch (IOException e) {
            System.out.println("Unable to read fileName = [" + inputFileName + "]");
            throw new RuntimeException(e);
        }
    }
}
