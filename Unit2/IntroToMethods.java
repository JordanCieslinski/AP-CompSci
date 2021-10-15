import java.util.Arrays;

public class IntroToMethods {
    
    public static void main(String[] args){
        System.out.println(removeYak("yakbak"));



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
        str.replaceAll("yak", " ");
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
         String temp = "";
         String word= "";
         
         for(int i = 0; i <=9; i++){
            switch(i){
                case(0):
                    word = "zero";
                case(1):
                    word = "one";
                case(2):
                    word = "two";
                case(3):
                    word = "three";
                case(4):
                    word = "four";
                case(5):
                    word = "five";
                case(6):
                    word = "six";
                case(7):
                    word = "seven";
                case(8):
                    word = "eight";
                case(9):
                    word = "nine";
            }
            temp = i +"";
            str.replaceAll(temp, word);
            
         }
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
