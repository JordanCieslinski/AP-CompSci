package Assignment1.q1;

public class Person {
    private String name;
    private int age;
    private int weight;

    public Person(String n, int a, int w){
        name = n;
        age = a;
        weight = w;
    }

    public void eat(){
        weight+=2;
    }

    public void bodyStats(){
        System.out.println("Age: "+age+", Weight: "+weight);
    }

    public String toString(){
        return name;
    }

    public void setWeight(int add){
        weight+=add;
    }
}
