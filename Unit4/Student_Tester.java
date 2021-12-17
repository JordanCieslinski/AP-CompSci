public class Student_Tester {
    public static void main(String[] args) {

        // Create 2 students, caylub and enaz, caylub uses the default constructor
        // and enaz has a name of Zane, with tests 100, 99, 79
        Student caylub = new Student();
        Student enaz = new Student("Zane", 100, 99, 79);

        // Create an array of Students containing enaz and caylub
        Student[] arr = { enaz, caylub };

        // Create an enhanced for loop to print out both students
        for (Student i : arr)
            System.out.println(i.toString());

    }
}
