package service;


import model.Weather;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TrafficServiceTest {
    TrafficService trafficService = new TrafficService();


    @Test
    public void findFastestVehicleOrbitRainyWeather() {
        String result = trafficService.findFastestVehicleOrbit(Weather.RAINY,  8.0f,  15.0f);
        assertEquals("TUKTUK ORBIT2" , result);
    }

    @Test
    public void findFastestVehicleOrbitRainyWeather2() {
        String result = trafficService.findFastestVehicleOrbit(Weather.RAINY,  40.0f,  25.0f);
        assertEquals("CAR ORBIT2" , result);
    }

    @Test
    public void findFastestVehicleOrbitSunnyWeather() {
        String result = trafficService.findFastestVehicleOrbit(Weather.SUNNY,  12.0f,  10.0f);
        assertEquals("TUKTUK ORBIT1", result);
    }

    @Test
    public void findFastestVehicleOrbitWindyWeather() {
        String result = trafficService.findFastestVehicleOrbit(Weather.WINDY,  14.0f,  20.0f);
        assertEquals("CAR ORBIT2", result);

    }
}