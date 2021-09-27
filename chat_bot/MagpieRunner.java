import java.util.Scanner;
public class MagpieRunner
{
    /**
     * 1) Create a Magpie object, give it user input, and print its replies.
     * 
     * 2) Program should continue to run as long as the word "Bye" doesn't appear.
     */
    public static void main(String[] args)
    {
        Magpie answer = new Magpie();
        Scanner console = new Scanner(System.in);
        
        System.out.println(answer.getGreeting());
        
        String in = console.nextLine();
        while(in.indexOf("bye") != -1)
        {
            System.out.println(answer.getResponse(in));
            in = console.nextLine();
        }
    }

}