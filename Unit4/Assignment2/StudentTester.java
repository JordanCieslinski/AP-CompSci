package Assignment2;

public class StudentTester {
    public static void main(String[] args) {
        // Construct two student objects, where one student who is named Paco and //has
        // test scores of 70, 72, 76, 82 and Taco who has test scores of 68, //69, 74,
        // 66.
        // Then compare the averages of the two students using your compareAverage
        // method and then print out which student has the higher average.
        // Then run the following code below, it should print out:
        // 95.0
        // 100
        // 100.0
        // Chris had the following grades: [105, 95]
        // Chris had a higher average than Bill

        Student paco = new Student("Paco", new int[] {70,72,76,82});
        Student taco = new Student("Taco", new int[] {68,69,74,66});
        if(paco.compareAverage(taco) == true)
            System.out.println(paco.getName()+" had a higher average");
        else
            System.out.println(taco.getName()+" had a higher average");

        

        Student chris = new Student("Chris", new int[] { 100, 90 });
        Student bill = new Student("Bill", new int[] { 80, 90 });
        System.out.println(chris.getAverage());
        System.out.println(chris.highGrade());
        chris.extraCredit(5);
        System.out.println(chris.getAverage());
        System.out.println(chris);
        if (chris.compareAverage(bill))
            System.out.println("Chris had a higher average than Bill");
        else
            System.out.println("Bill had a higher average than Chris");
    }
}
