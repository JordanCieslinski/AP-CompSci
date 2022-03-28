package Assignment1.q3;

public class UnderGradU6A1 extends StudentU6A1
{
        
    public UnderGradU6A1(String name, int[] tests)
    {
        super(name, tests);
    }

    //If the student's average is greater than or equal to 70, then the grade is set to "Pass",
    //otherwise it is set to "Fail"
    public void computeGrade()
    {
        if(getTestAverage() >= 70){
            setGrade("Pass");
        }
        else{
            setGrade("Fail");
        }
    }
}
