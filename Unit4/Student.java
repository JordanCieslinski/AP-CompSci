 
public class Student
{
    private String name;
    private int test1;
    private int test2;
    private int test3;
    private static int studentCounter;
    
    //Default Constructor: Set name to Caleb and test1 to 50, update studentCounter by 1
    public Student()
    {
        name = "Caleb";
        test1 = 50;
        studentCounter++;
    }
    //Overloaded Constructor: Set all the fields to their respective parameters, update studentCounter by 1
    public Student(String n, int t1, int t2, int t3)
    {
        name = n;
        test1 = t1;
        test2 = t2;
        test3 = t3;
        studentCounter++;
    }
    //Accessor method because it accesses a field
    public String getName()
    {
        return name;
    }
    /**
     * pre: needs 1 <= testNum <= 3
     * post: returns the specified grade
     */
    public int getScore(int testNum)
    {
        if(testNum == 1)
            return test1;
        else if(testNum == 2)
            return test2;
        else if(testNum == 3)
            return test3;
        else
            return -1;
    }
    
    public static int getStudentCounter()
    {
        return studentCounter;
    }
    //Mutator method
    public void setName(String nm)
    {
        name = nm;
    }
    //Returns: _____ has three test scores of: ___ , ___ , ___
    public String toString()
    {
        return name+" has three test scores of: "+test1+", "+test2+", "+test3;
    }
    //Returns the student's test average
    public double getAverage()
    {
        return (test1+test2+test3)/3.0;
    }
    //Returns the highest test score
    public int getHighScore()
    {
        return Math.max(Math.max(test1, test2), test3);
    }
    //Returns the true if this Student has a higher average than ben
    public boolean hasHigherTestAverage(Student ben)
    {
        if(ben.getAverage() < getAverage())
            return true;
        else
            return false;
    }
    //Returns the Student with the higher test average
    public Student getBetterStudent(Student mike)
    {
        if(getAverage() > mike.getAverage())
            return this;
        else
            return mike; 
    }
    
}




















