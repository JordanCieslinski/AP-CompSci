public class Person
{
   private int ageYears;
   private String lastName;

   public Person(String name, int age)
   {
       ageYears = age;
       lastName = name;
   }
   public void setName(String userName) 
   {
      lastName  = userName;
   }

   public void setAge(int numYears) 
   {
      ageYears = numYears;
   }

   public String toString() 
   {
      return "Name: " + lastName + ", Age: "  + ageYears;
   }
}