package Assignment3.Q2;

import java.util.*;

public class Activities {
    private ArrayList<Activity> act;

    // Initializes the list with no activities
    public Activities() {
        act = new ArrayList<>();
    }

    // Initializes and adds all of the activities into the list
    public Activities(Activity[] activities) {
        act = new ArrayList<>(Arrays.asList(activities));
    }

    // Adds activity to the list
    public void addActivity(Activity activity) {
        act.add(activity);
    }

    // Removes any Activity object that are equal to activity
    public void cancelActivity(Activity activity) {
        for(int i = 0; i < act.size(); i++){
            if(act.get(i).equals(activity)){
                act.remove(i);
            }
        }
        
    }

    // Removes any Activity that is at location
    public void cancelActivities(String location) {
        for(int i = 0; i < act.size(); i++){
            if(act.get(i).getLoc().equals(location)){
                act.remove(i);
            }
        }
    }

    // Returns the List containing all the activities
    public ArrayList<Activity> getActivities() {
        return act;

    }

    // Returns a List that containins any activities at the time, time
    public ArrayList<Activity> getActivities(String time) {
        ArrayList<Activity> list = new ArrayList<>();
        for (int i = 0; i < act.size(); i++) {
            if(act.get(i).getTime().equals(time)){
                list.add(act.get(i));
            }
        }
        return list;
    }
    // Returns a String containing every activity
    // Example: 1) Stevie’s Pool Party – Champion Hills (12 PM),
    //2) Arctic Monkeys Concert – Blue Cross Arena (11 PM)

    public String toString() {
        String s = "";
        for (int i = 0; i < act.size(); i++) {
            s+=(i+1)+") "+act.get(i)+"\n";
        }
        return s;
    }
}
