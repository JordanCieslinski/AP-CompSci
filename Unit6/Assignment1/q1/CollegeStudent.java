package Assignment1.q1;

public class CollegeStudent extends Person {
    private String major;
    private String university;

    public CollegeStudent(String n, int a, int w, String m, String u){
        super(n, a, w);
        m = major;
        u = university;
    }

    public void eat(){
        super.setWeight(10);
    }

    public String toString(){
        return super.toString()+", "+university;
    }

}
