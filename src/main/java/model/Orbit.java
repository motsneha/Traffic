package model;

public class Orbit {

    private int craters;
    private int distance;
    private float speed;

    public Orbit(int craters, int distance){
        this.craters = craters;
        this.distance = distance;

    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getSpeed() {
        return speed;
    }

    public int getDistance() {
        return distance;
    }

    public int getCraters() {
        return craters;
    }
}
