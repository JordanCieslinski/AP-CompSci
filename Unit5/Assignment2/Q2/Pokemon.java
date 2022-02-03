package Assignment2.Q2;

// Many properties were deleted to make this assignment shorter
public class Pokemon {
    private String name;
    private String type;
    private int level;

    public Pokemon(String n, String t, int l) {
        name = n;
        type = t;
        level = l;
    }

    // Return a string containing all of the fields
    // Sample output:
    // Level 8 Charmander, Fire Type
    public String toString() {
        return "Level "+level+" "+name+", "+type+" Type";
    }
    // Include accessor methods for all of the fields
    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }
    
    public int getLevel(){
        return level;
    }
}
