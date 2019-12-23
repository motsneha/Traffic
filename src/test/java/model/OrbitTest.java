package model;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class OrbitTest {

    @Test
    public void calculateTimeToCompleteTheOrbit() {
        Orbit orbit1 = new Orbit(20, 18, 14);
        orbit1.calculateTimeToCompleteTheOrbit(TukTuk.getInstance(), Weather.RAINY);
        orbit1.calculateTimeToCompleteTheOrbit(Car.getInstance(), Weather.RAINY);
        assertEquals(orbit1.getTime(), 114.0f);
        assertEquals(orbit1.getVehicle(), TukTuk.getInstance());
    }
}