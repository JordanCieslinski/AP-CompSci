package Assignment2.Q1;

public class RepairTester {
    public static void main(String[] args) {
        // Construct a RepairSchedule object r containing 6 mechanics.
        RepairSchedule r = new RepairSchedule(6);
        // Add a repair to the schedule using mechanic 3 and bay 4
        r.addRepair(3, 4); 
        // The method should return true because neither
        // mechanic 3 nor bay 4 are present in the schedule

        // Add a repair to the schedule using mechanic 0 and bay 1
        r.addRepair(0, 1);
        // Add a repair to the schedule using mechanic 0 and bay 2
        // This should return false because mechanic 0 is already in use
        r.addRepair(0, 2);
        // Add a repair to the schedule using mechanic 4 and bay 5
        r.addRepair(4, 5);
        // Remove repair in bay 4 from the schedule.
        r.carOut(4);
        // Print out the RepairSchedule object r.
        System.out.println(r);
        // The output should read:
        // Mechanic 0 is working in Bay 1
        // Mechanic 4 is working in Bay 5
        System.out.println(r.availableMechanics());
        // Print out the available Mechanics
        // The output should read:
        // [1, 2, 3, 5]
    }
}