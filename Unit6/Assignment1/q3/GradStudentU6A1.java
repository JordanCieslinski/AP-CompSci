package Assignment1.q3;

public class GradStudentU6A1 extends StudentU6A1
{
    private int myGradID;

    //sets myGradID to zero.
    public GradStudentU6A1()
    {
        myGradID = 0;
    }

    public GradStudentU6A1(String name, int[] tests, int gradID)
    {
        super(name, tests);
        myGradID = gradID;
    }
    
    public int getID()
    {
        return myGradID;
    }
    
    //Invokes computeGrade method from Student class, however, if the test average
    //is greater than or equal to 90, grade is set to "Pass with Distinction".
    @Override
    public void computeGrade()
    {
        if(getTestAverage() >= 90){
            setGrade("Pass with Distinction");
        }
        else{
            super.computeGrade();
        }


    }
}
