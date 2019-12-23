package factory;


import model.Orbit;
import model.TukTuk;
import model.Vehicle;
import model.Weather;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class OrbitTest {

    Orbit orbit1 ;

    @Test
    public void findFastestVehicleOrbitRainyWeather() {
        orbit1 = new Orbit(20, 18, 8.0f);

        for (Vehicle v :
                VehicleFactory.getAllVehicles(Weather.RAINY)) {
            orbit1.calculateTimeToCompleteTheOrbit(v,Weather.RAINY);
        }

        assertEquals(orbit1.getTime() , 159.0f);
        assertEquals(orbit1.getVehicle(), TukTuk.getInstance());
    }

    @Test
    public void findFastestVehicleOrbitRainyWeather2() {
        orbit1 = new Orbit(20, 18, 40.0f);

        for (Vehicle v :
                VehicleFactory.getAllVehicles(Weather.RAINY)) {
            orbit1.calculateTimeToCompleteTheOrbit(v,Weather.RAINY);
        }

        assertEquals(orbit1.getTime() , 114.0f);
        assertEquals(orbit1.getVehicle(), TukTuk.getInstance());

    }



}