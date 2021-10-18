import java.util.*;
import java.util.Arrays;
import java.awt.*;

public class UserDefinedMethods {
    
    public static void main(String[] args) {
        System.out.print(randomColor());
    }

    public static void powersOfTwo() {
        
        for(int i =1;i<=10; i++)
            System.out.print(Math.pow(10, i) + " ");
    }

    public static void alarm(int num){

        for(int i = 1; i <= num; i++)
            System.out.println("Alarm!");
    }

    public static int sum100(){
        int sum = 0;
        for(int i = 1; i <= 100; i++)
            sum+=i;
        return sum;
    }

    public static int sumRange(int num, int num2){
        int sum = 0;
        for(int i = num; i <= num2; i++)
            sum+=i;
        return sum;
    }

    public static int maxOfFour(int num, int num2, int num3, int num4){
        int [] arr = {num, num2, num, num3};
        Arrays.sort(arr);
        return arr[3];
    }

    public static boolean larger(double num, double num2){
        if(num > num2)
            return true;
        return false;
    }

    public static int countA(String str) {
        
        int length = str.length();
        str = str.replaceAll("a", "");
        return length - str.length();
    }
    public static boolean evenlyDivisible(int num, int num2){
        if(num%num2 == 0 || num2%num ==0)
            return true;
        return false;
    }

    public static double average(int num, int num2, int num3){
        int sum = num+num2+num3;
        return sum/3;
    }

    public static double average(int num, int num2, int num3, int num4){
        int sum = num+num2+num3+num4;
        return sum/4;
    }

    public static String multiConCat(String str, int num) {
        String temp = "";
        for(int i = 1; i<= num; i++)
            temp+=str;
        return temp;
        
    }
    public static String multiConCat(String str) {
        return str+str;
    }

    public static boolean isAlpha(char chr) {
        
        if(!Character.isLetter(chr))
            return false;
        return true;
    }

    public static int validate(int lower, int upper, int num) {
        Scanner in = new Scanner(System.in);
        int [] arr = {lower, upper, num};
        Arrays.sort(arr);
        boolean valid = true;

        while(valid == true){
        if(lower <= num && num <= upper)
            valid = false;
        else{
            System.out.print("You did not enter a number in the range.\nPlease enter a new number:");
            num = in.nextInt();
        }
        }
        return num;
    }

    public static boolean isIsoceles(int a, int b, int c) {
        if(a == b && b ==c)
            return false;
        else if(a==b && b!=c)
            return true;
        else if(a == c && c!=b)
            return true;
        else if(b == c && a!=b)
            return true;
        return false;
    }

    public static int randomInRange(int lower, int upper){
        return (int)((upper-lower)*Math.random() + lower);
    }

    public static int randomInRange(int upper){
        return (int)((upper-1)*Math.random() + 1);
    }

    public static Color randomColor(){
        int random1 = (int)(256*Math.random());
        int random2 = (int)(256*Math.random());
        int random3 = (int)(256*Math.random());
        Color random = new Color(random1, random2, random3);
        return random;
    }


   
}
