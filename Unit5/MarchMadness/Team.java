package MarchMadness;

public class Team {
    private String name;
    private int seed;

    public Team(int s, String n) {
        name = n;
        seed = s;
    }

    public String getName() {
        return name;
    }

    public int getSeed() {
        return seed;
    }
    public String toString(){
        return seed+" "+name;
    }
}
