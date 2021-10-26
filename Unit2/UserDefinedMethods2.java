public class UserDefinedMethods2 {
    public static void main(String [] args){

        System.out.println(last3Upper("hello"));
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
        str = " "+str+" "; 
        while(true){
            if(((str.charAt(str.indexOf("co") + 3)) == 'e')){
                count++;
                str = str.replaceAll(str.substring(str.indexOf("co"), (str.indexOf("co") + 4)) ,"");
            
            }
            else
                break;
        }
        return count;
    
    }
//hello
    public static String last3Upper(String str){

        int pos1 = str.length() - 3;
        String str1 = str.substring(pos1);

        String str2 = str.substring(0, pos1);

        str1 = str1.toUpperCase();
        

        return str2 + str1;
    }
    }

