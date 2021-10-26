import java.util.Arrays;

public class UserDefinedMethods3 {
    public static void main(String[] args){
        System.out.println(ordinalNum(21));
    
    }
    public static String isToOnes(String str){
        if(str.indexOf("l") != -1){
            str = str.replaceAll("l", "1");
        }
        return str;
    }
    public static int oneIsTheLoneliestNumber(int num){
        String str = num+"";
        if(str.indexOf("1") != -1){
            str = str.replaceAll("1", "2");
        }
        num = Integer.parseInt(str);
        return num;

    }
    public static boolean tripeA(String str){
        if(str.indexOf("aaa") != -1)
            return true;
        else
            return false;
    }
    public static String increasingNums(int num1, int num2, int num3){
        int [] arr = {num1, num2, num3};
        Arrays.sort(arr);
        return arr[0]+", "+arr[1]+", "+arr[3];
    }
    public static String ordinalNum(int num){
            int digits = (num+"").length();
            if(num >= 10 && num <=20)
                return num+"th";
            else if(num%((int)(Math.pow(1, digits))) == 1)
                return num+"st";
            else if(num%((int)(Math.pow(1, digits))) == 2)
                return num+"nd";
            else if(num%((int)(Math.pow(1, digits))) == 3)
                return num+"rd";
            return num+"th";


    }


}