import java.util.*;
public class Method_Notes {
    public static void main(String [] args){
        //Static Methods: Methods that use the class name
        System.out.println(Math.pow(2,5));
        //Non-Static Methods: Methods that use the object name
        Scanner console = new Scanner(System.in); //console is called an object
        int num = console.nextInt();
        
        double average = findAverage(5);
        System.out.println(average);
        //OR System.out.println(findAverage(5));

        String name = "Tim";
        int number = 9;
        update(name, number); //since the method is void, you would just call the method
        System.out.println(name + " "+number); //Prints out: Tim 9
        //# Methods cannot update Primitive  data types or Strings
    }
    public static double findAverage(int num){

        double sum = 0;
        for(int i = 1; i < num; i++)
            sum+=i;
        return sum/num;
    }

    public static String changeAtoZ(String str){

        String ans = "";
        for(int i = 0; i < str.length(); i++){
            
            if(str.charAt(i) == 'a')
                ans+="z";
            else
            ans+= str.charAt(i);
                
      }

      return ans;
        
    }
    public static String changeAtoZV2(String str){
        return str.replaceAll("a", "z");
    }
    public static void update(String word, int num){
        word += "Smith";
        num+= 4;
    }
}