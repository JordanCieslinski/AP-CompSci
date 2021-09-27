public class ThisStringIsOnFire
{
    /*
     * Given a string, return the length of the largest "block" in the string. 
     * A block is a run of adjacent characters that are the same.  For example,
     * maxBlock("soccer") would return 2, whereas maxBlock("family") would return 1.
     * In addition, maxBlock("") would return 0.
     */
    public static int maxBlock(String str) 
    {
        int tmpcount = 1;
        int count = 0;
        for(int i = 1; i < str.length(); i++)
        {
            if(str.charAt(i) == str.charAt(i-1))
                tmpcount++;
            else if(str.length() == 0)
                return 0;
            else
            {
                tmpcount = 1;
                if(tmpcount > count)
                    count = tmpcount;
            }

        }

        return count;
    }

    public static void main(String[] args)
    {
        if(maxBlock("hoopla") == 2)
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(maxBlock("abbCCCddBBBxx") == 3)
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(maxBlock("") == 0)
            System.out.println("correct");
        else
            System.out.println("incorrect");    

        if(maxBlock("xyz") == 1)
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(maxBlock("xyzz") == 2)
            System.out.println("correct");
        else
            System.out.println("incorrect");    

        if(maxBlock("xxyz") == 2)
            System.out.println("correct");
        else
            System.out.println("incorrect"); 

        if(maxBlock("abbbcbbbxbbbx") == 3)
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(maxBlock("XXBBBBbbxx") == 4)
            System.out.println("correct");
        else
            System.out.println("incorrect");  

        if(maxBlock("XXBBBbbxxXXXX") == 4)
            System.out.println("correct");
        else
            System.out.println("incorrect");

        if(maxBlock("XX2222BBBbbXX2222") == 4)
            System.out.println("correct");
        else
            System.out.println("incorrect");    
    }
}
