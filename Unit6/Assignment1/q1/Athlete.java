package Assignment1.q1;

public class Athlete extends Person{
    private String sport;
    private int jerseyNumber;
    private String position;

    public Athlete(String n, int a, int w, String sp, int j, String p){
        super(n, a, w);
        sport = sp;
        jerseyNumber = j;
        position = p;
    }

    public void eat(){
        super.setWeight(4);
    }
    public String toString(){
        return super.toString()+", "+sport;
    }
}
