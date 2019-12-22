package model;

/**
 * Various weathers and the rate at which the craters in the orbit changes.
 */
public enum Weather {

    SUNNY(-10), WINDY(0), RAINY(20);

    private int craterSpeedRate;

     Weather(int craterSpeedRate){
        this.craterSpeedRate = craterSpeedRate;
    }

    public int getCraterSpeedRate(){
       return this.craterSpeedRate;
    }
}
