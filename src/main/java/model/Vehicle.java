package model;

import java.util.Collections;
import java.util.List;

public class Vehicle {
   protected float speed;
   protected float craterSprint;
   protected List<Weather> favourableWeather;

    public List<Weather> getFavourableWeather() {
        return Collections.unmodifiableList(favourableWeather);
    }

    public float getSpeed() {
        return speed;
    }

    public float getCraterSprint() {
        return craterSprint;
    }

}
