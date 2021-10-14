
public class Back2Basics
{
   public static void main (String [] args)
   {
       System.out.print("I missed this class. ");
       System.out.println("I remember this stuff");
       System.out.println("Easy peasy");
       
       //#Primitive data types
       boolean valid = true;
       double pizza = 9.9;
       char care = 'c';
       int num = 109;
       
       //# Object
       String emily = "Neenan"; //emily is the object, String is the class
       int[] nums = {9,99,999,9999,19, 29,109}; //nums is the object
       
       //# Declaring variables
       int x;
       double z,y;
       int a = 9, b =19, c =29;
       
       //# Constants
       final int RATE = 10;
       final double INTEREST = 1.5;
       
       System.out.println(3+3); //prints: 6
       System.out.println("3"+ 3); //prints: 33, this is called concatenation
       System.out.println("3" + 4 + 5); //prints: 345
       System.out.println(4*8+5+"6"+9); //prints: 3769
       System.out.println(4 > 3 || 2 == 1 && 8 > 5); //prints: true
       
       //# Casting, Modulus, Division, etc...
       System.out.println(4 / 3); //prints: 1
       System.out.println( 5 / 2.0); //prints: 2.5
       System.out.println((int)(5/2.0)); //prints: 2
       System.out.println((double)7 / 2); //prints: 3.5
       System.out.println((int)(6.6 + 0.5)); //Rounding positive numbers
       System.out.println((int)(-5.8 - 0.5)); //Rounding negative numbers
       System.out.println(8%3); //prints: 2
       System.out.println(3 - 4 % 6); //prints: -1, modulus is on same level as * and /
       
       //# Useful trick with mod and division
       System.out.println(497 / 10 ); //Chops off last digit (prints: 49)
       System.out.println(497 % 10); //Retrieves last digit (prints: 7)
       
       System.out.println(Math.sqrt(-4)); //prints: NaN
       //System.out.println(5 //0) This is called an ArtithmeticException which is a runtime error
       
       
   }
}
