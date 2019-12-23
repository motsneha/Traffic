package model;

public class Orbit {

    private float craters;
    private float distance;
    private float speed;
    private Vehicle vehicle;
    private float time;

    public Orbit(int craters, int distance, float speed){
        this.craters = craters;
        this.distance = distance;
        this.speed = speed;
        this.time = Float.MAX_VALUE;
    }

    private void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    private void setTime(float time){
        this.time = time;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public float getTime() {
        return time;
    }

    public void calculateTimeToCompleteTheOrbit(Vehicle vehicle, Weather weather){
        float speed = Math.min(this.getSpeed(), vehicle.getSpeed());

        float craters = this.getCraters() + (weather.getCraterSpeedRate() * (this.getCraters() / 100));
        float currentTime = (vehicle.getCraterSprint() * craters) +
                            ((this.getDistance() / speed) * 60 );
        if (currentTime < time){
            setTime(currentTime);
            setVehicle(vehicle);
        }
    }

    public float getSpeed() { return speed;}

    public float getDistance() {  return distance;}

    public float getCraters() {
        return craters;
    }
}
