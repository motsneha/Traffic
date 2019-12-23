package factory;

import model.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

/***
This class help returns the list of all vehicle that are permissible in the given weather
no need to instantiate vehicles every request as the vehicle data is static
 */
public class VehicleFactory {

    private static List<Vehicle> vehicles = Arrays.asList(Car.getInstance(),TukTuk.getInstance(),Bike.getInstance()) ;

    public static List<Vehicle> getAllVehicles(Weather weather){
        return vehicles.stream().filter(v -> v.getFavourableWeather().contains(weather)).collect(collectingAndThen(toList(), Collections::unmodifiableList));
    }
}
