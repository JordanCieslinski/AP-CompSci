package Assignment1.q3;

public class StudentU6A1
{
    public static final int NUM_TESTS = 3;
    private String myName;
    private int[] myTests;
    private String myGrade;
    
    public StudentU6A1()
    {
        myName = "";
        myTests = new int[NUM_TESTS];
        myGrade = "";
    }

    public StudentU6A1(String name, int[] test)
    {
        myName = name;
        myTests = test;
        myGrade = "";
    }
    
    public String getName()
    {
        return myName;
    }
    
    public String getGrade()
    {
        return myGrade;
    }
    
    public void setGrade(String newGrade)
    {
        myGrade = newGrade;
    }
    
    //Using an enhanced for loop calculate the Student's average
    public double getTestAverage()
    {
        double avg = 0;
        for(double i: myTests){
            avg += (i/myTests.length);
        }
        return avg;
    }
    
    //If there is no student name then their grade is set to "No grade", if their
    //average is greater than or equal to 65, then myGrade is set to "Pass", otherwise
    //it is set to "Fail"
    public void computeGrade()
    {
        if(myName.equals("") || myName.equals(null)){
            myGrade = "No grade";
        }
        else if(getTestAverage() >= 65){
            myGrade = "Pass";
        }
        else{
            myGrade = "Fail";
        }
    }
    
    
}
