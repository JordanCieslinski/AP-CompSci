public class Students {
    private int age;
    private String name;

    public Students(String str, int old) {
        name = str;
        age = old;
    }
    public int getAverage(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void increaseAverage(int increase){
        age += increase;
    }
    public String toString(){
        return name+" has an average of "+getAverage();
    }
}
