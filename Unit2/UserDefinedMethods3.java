import java.util.Arrays;

public class UserDefinedMethods3 {
    public static void main(String[] args){
        System.out.println(stringAddition("4+4"));
    
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
            System.out.println(digits);
            if(num >= 10 && num <=20)
                return num+"th";
                
            else if(digits == 1){
                if(num == 1)
                    return num+"st";
                else if(num == 2)
                    return num+"nd";
                else if(num == 3)
                    return num+"rd";
            }
            else if(num%((int)(Math.pow(10, digits-1))) == 1)
                return num+"st";
            else if(num%((int)(Math.pow(10, digits-1))) == 2)
                return num+"nd";
            else if(num%((int)(Math.pow(10, digits-1))) == 3)
                return num+"rd";
            return num+"th";


    }
    public static int daysToSeconds(int days){

        return ((days*24)*60)*60;
    }
    public static int tugOfWar(int num){
        int digits = (num+"").length();
        int sum1 = 0;
        int sum2 = 0;
        int half1 = num/((int)(Math.pow(10, digits/2)));
        int half2 = num%((int)(Math.pow(10, digits/2)));
        if(digits < 1)
            return 0;
        else if(digits % 2 !=0){
            half1 = num/((int)(Math.pow(10, (digits/2) +1)));
            digits--;
        }

        String half1Str = half1+"";
        String half2Str = half2+"";

        System.out.println(half1);
        System.out.println(half2);
        
        for(int i = 0; i < digits/2; i++){
            sum1 += Integer.parseInt(half1Str.charAt(i)+"");
            sum2 += Integer.parseInt(half2Str.charAt(i)+"");

        }


        if(sum1 > sum2)
            return -1;
        else if(sum1 < sum2)
            return 1;
        else
            return 0;
        
        

    }
    public static String stringAddition(String str){
        int loc = str.indexOf("+");
        if(loc == -1){
            return "NOT POSSIBLE";
        }
        else{
            return (Integer.parseInt(str.substring(0,loc)) + Integer.parseInt(str.substring(loc+1)))+"";
        } 

    }

    public static String stringAddition2(String str){
        int loc = str.indexOf("+");
        int count = 0;
        if(loc == -1){
            return "NOT POSSIBLE";
        }
        else{
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '+')
                    count++;
            }

        }
            return (Integer.parseInt(str.substring(0,loc)) + (count*Integer.parseInt(str.substring(str.lastIndexOf("+")+1))))+"";
        

    }
    public static boolean ghosthunters(String str){
        str = " "+str+" ";
        if(str.indexOf("boo") == -1)
            return false;
        else{
            if(str.charAt((str.indexOf("boo")+3)) != 'o')
                return true;
            else
                return false;
        }
    }
    

}