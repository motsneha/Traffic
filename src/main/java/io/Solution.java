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
        String inputFileName = args[0];

        try {
            Path path = Paths.get(inputFileName);

            List<String> lines = Files.lines(path).collect(Collectors.toList());
            TrafficService trafficService = new TrafficService();
            for (String input : lines) {
                String[] params = input.split(" ");
                String weather = params[0];
                float speed = Float.parseFloat(params[1]);
                float speed2 = Float.parseFloat(params[2]);


                String fastestVehicleOrbit = trafficService.findFastestVehicleOrbit(Weather.valueOf(weather), speed, speed2);
                System.out.println(fastestVehicleOrbit);
            }

        } catch (IOException e) {
            System.out.println("Unable to read fileName = [" + inputFileName + "]");
            throw new RuntimeException(e);
        }
    }
}
