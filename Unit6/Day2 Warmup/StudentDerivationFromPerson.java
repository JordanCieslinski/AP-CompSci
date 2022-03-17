public class StudentDerivationFromPerson 
{
   public static void main(String [] args) 
   {
       /**
       * Create a Student object called will with a name of Smith, age is 20, and ID with 9999. 
       * Your program should print out the following:
       * Name: Smith, Age: 20, and has an ID Number: 9999
       */
        Student1 will = new Student1("Funny", 20, 9999);
        System.out.println(will);
       
       
      
       /**
       * Create a Student object called doug with a name of Funny, age is 9, and ID with 12345
       * Update the name to be Rick and the ID Number to be 1009
       * Your program should print out the following:
       * Name: Rick, Age: 9, and has an ID Number: 1009
       */
      Student1 doug = new Student1("Funny", 9, 12345);
      doug.setName("Rick");
      doug.setID(1009);
      System.out.println(doug);
   }
}