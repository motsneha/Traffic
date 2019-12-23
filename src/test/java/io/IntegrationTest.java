package io;

import model.Orbit;
import model.TukTuk;
import model.Weather;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IntegrationTest {


    @Test
    public void testPublicMethod(){
        Solution solution = new Solution();
        Orbit orbit1 = new Orbit(20, 18, 14);
        Orbit orbit2 = new Orbit(10, 20, 14);

        solution.calculateTimeForAllOrbits(orbit1, orbit2, Weather.SUNNY);
        assertEquals(orbit1.getVehicle() , TukTuk.getInstance());
        assertEquals(orbit1.getTime() < orbit2.getTime(), true);
    }
}