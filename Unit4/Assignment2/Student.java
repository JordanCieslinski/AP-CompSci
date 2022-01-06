package Assignment2;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades;

    public Student(String n, int[] g) {
        name = n;
        grades = g;
    }

    // Returns the instance variable, name
    public String getName() {
        return name;
    }

    // Returns the instance variable, grades
    public int[] getGrades() {
        return grades;
    }

    // Adds amount to each of the test grades
    public void extraCredit(int amount) {
        for(int i = 0; i < grades.length; i++)
            grades[i]+=amount;
    }

    // Returns the highest test grade from "grades"
    public int highGrade() {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < grades.length; i++){
            if(grades[i] > max)
                max = grades[i];
        }
        return max;
            
    }

    // Returns the test average
    public double getAverage() {
        double sum = 0;
        for(int i = 0; i < grades.length; i++){
            sum+=grades[i];
        }
        return sum/(grades.length);
    }

    /**
     * If there were a student named "Robin", then it would return:
     * Robin had the following grades: [100,91,92,94,96]
     */
    public String toString() {
        return name+" had the following grades: "+Arrays.toString(grades);
    }

    // Returns true if "this" Student, has a higher average than Student x
    public boolean compareAverage(Student x) {
        if(this.getAverage() > x.getAverage())
            return true;
        return false;
    }
}