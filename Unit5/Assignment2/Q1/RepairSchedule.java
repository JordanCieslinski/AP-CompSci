package Assignment2.Q1;

import java.util.*;

public class RepairSchedule {
    // Each element represents a repair by an individual mechanic in a bay.
    private ArrayList<CarRepair> schedule;
    // Number of mechanics available in schedule.
    private int numberOfMechanics;

    /**
     * Construct a RepairSchedule object.
     * Precondition: n >= 0, where n is the number of available mechanics
     */
    public RepairSchedule(int n) {
        schedule = new ArrayList<CarRepair>();
        numberOfMechanics = n;
    }

    /**
     * Attempts to schedule a repair by a given mechanic in a given bay.
     * A repair is scheduled if both the mechanic and bay are available.
     * Precondition: 0 <= m < numberOfMechanics and b >= 0
     */
    public boolean addRepair(int m, int b) {
        for (CarRepair i : schedule) {
            if ((i.getMechanicNum() == m) || (i.getBayNum() == b)) {
                return false;
            }
        }
        schedule.add(new CarRepair(m, b));

        return true;

    }

    // Returns an ArrayList containing all the available mechanics.
    // Remember, mechanics are listed by their location in the Repair
    // Schedule. Therefore, if we have 4 mechanics they are numbered
    // 0 through 3
    public ArrayList<Integer> availableMechanics() {
        ArrayList<Integer> availableMecs = new ArrayList<>();
        ArrayList<Integer> usedMecs = new ArrayList<>();
        boolean valid = false;
        for(CarRepair a: schedule){
            for(int i = 0; i < numberOfMechanics; i++){
                if(a.getMechanicNum() == i){
                    usedMecs.add(i);
                }
            }
        }

        for(int i =0; i < numberOfMechanics; i++){
            if(!usedMecs.contains(i)){
                availableMecs.add(i);
            }
        }

        
        return availableMecs;
    }

    /**
     * Removes an element from schedule when a repair is complete.
     * b represents the bay number that the car is being removed from.
     */
    public void carOut(int b) {
        for (int i = 0; i < schedule.size(); i++) {
            if (schedule.get(i).getBayNum() == b) {
                schedule.remove(i);
                i--;
            }
        }
    }

    public String toString() {
        String s = "";
        for (CarRepair i : schedule) {
            s = s + i + "\n";
        }
        return s;
    }
}
