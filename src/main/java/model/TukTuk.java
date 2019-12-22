package model;

import java.util.Arrays;

public class TukTuk extends Vehicle {

    private static TukTuk tukTuk;

    private TukTuk() {
    }
    static {
        tukTuk = new TukTuk();
        tukTuk.favourableWeather =  Arrays.asList(Weather.RAINY, Weather.SUNNY);
        tukTuk.craterSprint = 1;
        tukTuk.speed = 12;
    }

    public static TukTuk getInstance(){
        if(tukTuk == null){
            tukTuk = new TukTuk();
        }
        return tukTuk;
    }


    @Override
    public String toString() {
        return "TUKTUK";
    }
}
