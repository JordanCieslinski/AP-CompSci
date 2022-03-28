package Assignment1.q3;

public class StudentTesterU6A1
{
    public static void main(String[] args)
    {
        StudentU6A1 alyse = new StudentU6A1("Alyse", new int[] {100, 98, 96});
        GradStudentU6A1 chris = new GradStudentU6A1("Chris", new int[] {94, 92, 90},  999);
        UnderGradU6A1 bill = new UnderGradU6A1("Bill", new int[] {80, 85, 93});
                
        alyse.computeGrade();
        chris.computeGrade();
        if(alyse.getTestAverage() == 98.0)
            System.out.println("Correct!");
        else
            System.out.println("Incorrect");
        if(alyse.getGrade().equals("Pass"))
            System.out.println("Correct!");
        else
            System.out.println("Incorrect");
        if(chris.getGrade().equals("Pass with Distinction"))
            System.out.println("Correct!");
        else
            System.out.println("Incorrect");
        
  
    }
}
