package Assignment3.Q1;

import java.util.*;

public class RoadTrip {
    private ArrayList<GeoLocation> locs;

    // Default constructor for RoadTrip
    public RoadTrip() {
        locs = new ArrayList<>();
    }

    // Create a GeoLocation object and add it to locs
    public void addStop(String name, double latitude, double longitude) {
        locs.add(new GeoLocation(name, latitude, longitude));
    }

    // Get the total number of stops in the trip
    public int getNumberOfStops() {
        return locs.size();
    }

    // Get the total miles of the trip
    public double getTripLength() {
        double totalMiles = 0;
        for(int i = 1; i < getNumberOfStops(); i++){
            totalMiles += locs.get(i).distanceFrom(locs.get(i-1));
        }
        return totalMiles;
    }

    // Return a formatted toString of the trip, for example if you had 2 trips:
    // 1. San Francisco (37.7833, -122.4167)
    // 2. Los Angeles (34.052235, -118.243683)
    public String toString() {
        String s = "";
        for(int i = 1; i <= getNumberOfStops(); i++){
            s+=(i+". "+locs.get(i-1).toString()+"\n");
        }
        return s;
    }
}
