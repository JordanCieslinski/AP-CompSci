public class IHoppedOffAPlaneAtLAXWithAStringMethod
{
    /*We'll say that a 'g' in a string is "happy" if there is another 'g' immediately
     * to its left or right. Return true if all the g's in the given string are happy.
     * If there is an empty string passed in the method should return true.
     * 
     * gHappy("xxggxx") → true
     * gHappy("xxgxx") → false
     * gHappy("xxggyygxx") → false
     */
    public static boolean gHappy(String str)
    {
        str = " "+str+" ";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'g' && (str.charAt(i+1) != 'g' && str.charAt(i-1) != 'g'))
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        if(gHappy("xxggxx"))
            System.out.println("Correct");
        else
            System.out.println("Incorrect");
        if(gHappy("xxgxx"))
            System.out.println("Incorrect");
        else
            System.out.println("Correct");
        if(gHappy("xxggyygxx"))
            System.out.println("Incorrect");
        else
            System.out.println("Correct");
        if((gHappy("g")))
            System.out.println("Incorrect");
        else
            System.out.println("Correct");
        if(gHappy("gg"))
            System.out.println("Correct");
        else
            System.out.println("Incorrect");    
        if(gHappy("xxgggxyg"))
            System.out.println("Incorrect");
        else
            System.out.println("Correct");
        if(gHappy(""))
            System.out.println("Correct");
        else
            System.out.println("Incorrect");
        if(gHappy("mggm"))
            System.out.println("Correct");
        else
            System.out.println("Incorrect");	
    }
}

