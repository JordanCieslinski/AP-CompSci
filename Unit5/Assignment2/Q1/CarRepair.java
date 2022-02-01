package Assignment2.Q1;

public class CarRepair {
    private int mechanicNum;
    private int bayNum;

    public CarRepair(int m, int b) {

        mechanicNum = m;
        bayNum = b;

    }

    public int getMechanicNum() {

        return mechanicNum;

    }

    public int getBayNum() {

        return bayNum;

    }
    public String toString(){
        return "Mechanic "+mechanicNum+" is working in Bay "+bayNum;
    }
}
