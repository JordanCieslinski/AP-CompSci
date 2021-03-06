public class String_Activity_Practice
{
    //This method should return true if every character in str is a letter (The letter could be upper or lowercase)  
    //**Hint** utilize the Character class
    public static boolean isAllAlpha(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            if(!Character.isLetter(str.charAt(i)))
                return false;
              
        }
        return true;
    }

    //This method should return true if every character in str is a number.  
    public static boolean isNumeric(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            if(!Character.isDigit((str.charAt(i))))
                return false;
              
        }
        return true;
    }
      
    public static void main(String[] args)
    {
        if(!isAllAlpha("A!345"))
            System.out.println("Usted está en el fuego");
        else
            System.out.println("Please try again!");
        if(isAllAlpha("AbcDEf"))
            System.out.println("You must be butter....because you are on a roll!");
        else
            System.out.println("Sorry, but this isn't your day. Please try again!");
        if(!isNumeric("AB123"))
            System.out.println("Are you my bus driver? Because you are taking me to school!");
        else
            System.out.println("I feel your pain, please try again");
        if(isNumeric("12345"))
            System.out.println("Pure genius");
        else
            System.out.println("Sorry, better luck next time!");
    }
    
}