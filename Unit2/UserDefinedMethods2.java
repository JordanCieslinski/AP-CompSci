public class UserDefinedMethods2 {
    public static void main(String [] args){


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

    }

