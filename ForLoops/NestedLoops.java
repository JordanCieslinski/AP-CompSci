
public class NestedLoops
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 5; j++)
                System.out.print("*");
            System.out.println();
        }
        
        System.out.println();
        
        for(int i = 5; i >= 0; i--)
        {
            for(int j = i+1; j <= 5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        
        for(int i = 1; i <= 7; i++)
        {
            for(int j = i+1; j >= 8 ; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
