//The Student class is a subclass of Person
public class Student1 extends Person {
   // There is one addition field idNum
   private int idNum;

   public Student1(String n, int a, int id) {
      super(n, a);
      idNum = id;
   }

   // Sets the name to Doug Funny, age to 9 and idNum to 12345
   public Student1() {
      super("Doug Funny", 9);
      idNum = 12345;
   }

   // Mutator method which updates idNum
   public void setID(int studentId) {
      idNum = studentId;
   }

   // Accessor method for ID
   public int getID() {
      return idNum;
   }

   // Returns: Name: ___________, Age: ___, and has an ID Number: _______
   public String toString() {
      return super.toString() + ", and has and ID Number: " + idNum;
   }
}