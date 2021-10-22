public class UserDefinedMethods2 {
    public static void main(String [] args){

        System.out.println(getCode("code cope"));
    }

    public static String firstTwo(String str){

        if(str.length() <2){
            return str;
        }
        else   
            return str.substring(0,2);
    }

    public static String helloName(String str){
        return "Hello "+str+"!";
    }

    public static String firstHalf(String str){
        if(str.length() % 2 != 0)
            return str+str;
        else
            return str.substring((str.length()/2)+1);
    }

    public static String front22(String str){

        if(str.length() < 2)
            return str+str+str;
        else
            return str.substring((str.length()/2)+1)+str+str.substring((str.length()/2)+1);
    }
    public static boolean given2Ints(int num1, int num2){
        if(num1%10 == num2%10)
            return true;
        return false;
    }
    public static boolean mixStart(String str) {
        if(str.substring(1,3).equals("ix"))
            return true;
        return false;
        
    }

    public static String stringBits(String str){
        String newStr ="";
        if(str.length() < 3)
            return str.charAt(0)+"";
        else {
            for(int i = 0; i < str.length(); i+=2){
                newStr += str.charAt(i)+"";
            }
            return newStr;
        }
        
    }
    public static String getSandwich(String str){
        if(str.indexOf("bread") == str.lastIndexOf("bread"))
            return "";
        return str.substring(str.indexOf("bread")+5, str.lastIndexOf("bread"));
    }

    public static int getCode(String str){
        int count = 0;
        if((str.charAt(str.indexOf("co")) + 3 == 'e')){

        str = str.replaceAll(str.charAt(str.indexOf("co") + 2)+"", "d");
        while(str.indexOf("code") !=-1)
            str = str.replace((str.substring((str.indexOf("code")), str.indexOf(("code")+4))) ,"");
            count++;
        }
        return count;
    }

    }

