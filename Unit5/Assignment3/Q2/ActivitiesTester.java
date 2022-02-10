package Assignment3.Q2;

public class ActivitiesTester {
    public static void main(String[] args) {
        
        Activities act1 = new Activities();

        act1.addActivity(new Activity("Chaye's Pool Party", "Helen Newman Hall", "11 AM"));
        act1.addActivity(new Activity("Retsim's Victory Party", "GSM", "9 PM"));
        System.out.println(act1);

        act1.addActivity(new Activity("Victor Graduation", "Blue Cross Arena", "6 PM"));
        System.out.println(act1);

        act1.cancelActivity(new Activity("Chaye's Pool Party", "Helen Newman Hall", "11 AM"));
        System.out.println(act1);

        System.out.println(act1.getActivities("6 PM"));


    }
}
