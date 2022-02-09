package Assignment3.Q1;

public class GeoLocation {
    public static final double RADIUS = 3963.1676;
    // Fields for latitude, longitude and location needed
    private String location;
    private double latitude;
    private double longitude;


    // Constructs a geo location object with given latitude and longitude
    public GeoLocation(String name, double theLatitude, double theLongitude) {
        location = name;
        latitude = theLatitude;
        longitude = theLongitude;
    }

    // Add accessor methods for all three fields
    public String getLocation(){
        return location;
    }

    public double getLongitude(){
        return longitude;
    }

    public double getLatitude(){
        return latitude;
    }
    // returns a string representation of this geo location
    public String toString() {
        return getLocation()+" ("+getLatitude()+", "+getLongitude()+")";
    }

    // returns the distance in miles between this geo location and the given
    // other geo location
    // ***You do not have to do anything with this method***
    public double distanceFrom(GeoLocation other) {
        double lat1 = Math.toRadians(latitude);
        double long1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(other.latitude);
        double long2 = Math.toRadians(other.longitude);
        // apply the spherical law of cosines with a triangle composed of the
        // two locations and the north pole
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        return arcLength * RADIUS;
    }
}
