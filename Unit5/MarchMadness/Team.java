package MarchMadness;

public class Team {
    private String name;
    private int seed;

    public Team(String n, int s) {
        name = n;
        seed = s;
    }

    public String getName() {
        return name;
    }

    public int getSeed() {
        return seed;
    }
}
