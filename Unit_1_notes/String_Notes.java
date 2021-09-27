
public class String_Notes
{
   public static void main(String [] args)
   {
       String demo = "Anthony Davis is the Goat";
       
       //# Length Method
       int length = demo.length(); //length is 25 (Start at 1)
       
       //# Substring Method
       System.out.println(demo.substring(2,6)); //prints: thon (It excludes the 6th character)
       System.out.println(demo.substring(21)); //prints: Goat
       System.out.println(demo.substring(25)); //prints: "Empty String"
       //If you go 2 or more characters pat the last one you get a RunTime Error (IndexOutOfBounds)
       
       //# indexOf Method
       
       int locOfDavis = demo.indexOf("Davis"); //stores 8 into locOfDavis
       int loc = demo.indexOf("Ava"); //stores -1
       int locOfLastT = demo.lastIndexOf("t"); //stores 24
       
       //# charAt Method
       char D = demo.charAt(8); //This gives you the character at position 8, D
       String ab = demo.charAt(9) +""; //This turns a character into a String
       //char dem = demo.charAt(25); Runtime Error (IndexOutOfBounds)
       
       //# Equals Method
       boolean valid = demo.equals("John"); //stores: false
       
       char a = 97;
       System.out.println(a); //prints: a because 97 = a in unicode
       //# compareTo Method
       int ans = "ben".compareTo("chris");
       System.out.println(ans); //prints: -1
       
       
   }
}
