import java.util.Arrays;

public class IntroToMethods {
    
    public static void main(String[] args){
        System.out.println(isEven(7));
        System.out.println(minimum3(.3, .8, .1));
        System.out.println(removeYak("yakpak"));
        System.out.println(multipleOfThree(31));
        System.out.println(numToWord("I have 54 iPhones"));
        System.out.println(sdrawkcab("racecar"));


    }
    //1
    public static boolean isEven(int num){
        if(num % 2 == 0)
            return true;
        return false;
    }
    //2
    public static int areaCircle(double r){
        return (int)(Math.PI*Math.pow(r, 2));
    }
    //3
     public static double minimum3(double num1, double num2, double num3){
        double [] nums = {num1,num2,num3};
        Arrays.sort(nums);
        return nums[0];
     }
     //4
     

     //5
     public static String removeYak(String str){

        str = str.replaceAll("yak", "");
        return str;
     }


     //7
     public static boolean multipleOfThree(int num) {
         if(num % 3 == 0)
            return true;
        return false;
     }

     //9
     public static String numToWord(String str) {

            str = str.replaceAll("0", "zero");
            str = str.replaceAll("1", "one");
            str = str.replaceAll("2", "two");
            str = str.replaceAll("3", "three");
            str = str.replaceAll("4", "four");
            str = str.replaceAll("5", "five");
            str = str.replaceAll("6", "six");
            str = str.replaceAll("7", "seven");
            str = str.replaceAll("8", "eight");
            str = str.replaceAll("9", "nine");
         return str;
         
     }

     //10
     public static String sdrawkcab(String str){
         String temp = "";
         for(int i = str.length()-1; i >= 0; i--){
             temp+=str.charAt(i);
         }
         return temp;
     }
}
