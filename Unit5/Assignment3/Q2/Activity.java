package Assignment3.Q2;

public class Activity {
    // Include the necessary fields based on the constructor
    private String name;
    private String loc;
    private String t;
    // Only constructor needed for this class
    public Activity(String eventName, String location, String time) {
        name = eventName;
        loc = location;
        t = time;
    }

    // Include accessor methods for all the fields
    public String getName(){
        return name;
    }

    public String getLoc(){
        return loc;
    }

    public String getTime(){
        return t;
    }

    // Returns a boolean which is true if the object passed in has the same
    // name, location, and time.
    public boolean equals(Activity other) {
        if(other.getName().equals(name) && other.getLoc().equals(loc) && other.getTime().equals(t)){
            return true;
        }
        else
            return false;
    }

    // Returns a string containing the event and information about it
    // Example: Stevie’s Pool Party – Champion Hills (12 PM)
    public String toString() {
        String s = "";
        return name+" - "+loc+" ("+t+")";
    }
}
