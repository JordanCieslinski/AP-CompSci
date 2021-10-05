public class ThisIsBrickNumber5
{
     /**
     * We want to make a row of bricks that is goal inches long. 
     * We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
     * Return true if it is possible to make the goal by choosing from the given bricks.
     * So, for example, if you have 2 small bricks, 1 large brick and the goal is 8, then
     * you would be one small brick short from reaching the goal.  
     */
    public static boolean makeBricks(int small, int big, int goal) 
    {
        int lengthS = small;
        int lengthL = 5*big;

          if(lengthS+lengthL < goal)
            return false;
        
        if(goal % 5 > small)
            return false;  
        
        return true;
    }
    
    public static void main(String[] args)
    {
        if(!makeBricks(1, 1, 11))
            System.out.println("Correct");
        else 
            System.out.println("Incorrect");
        if(!makeBricks(3, 1, 9))
            System.out.println("Correct");
        else 
            System.out.println("Incorrect");
        if(makeBricks(3, 2, 10))
            System.out.println("Correct");
        else 
            System.out.println("Incorrect");
        if(!makeBricks(3, 2, 9))
            System.out.println("Correct");
        else 
            System.out.println("Incorrect");
        if(makeBricks(6, 1, 11))
            System.out.println("Correct");
        else 
            System.out.println("Incorrect");
        if(!makeBricks(1, 4, 12))
            System.out.println("Correct");
        else 
            System.out.println("Incorrect");
        if(makeBricks(43, 1, 46))
            System.out.println("Correct");
        else 
            System.out.println("Incorrect");
        if(makeBricks(1, 4, 11))
            System.out.println("Correct");
        else 
            System.out.println("Incorrect");
    }
}









