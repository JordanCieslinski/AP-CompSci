import java.util.*;
public class for_loops
{
    public static void main(String [] args)
    {
        System.out.println("A");
        for(int i = 2; i <= 20; i+=2)
        {
            System.out.print(i +" ");
        }

        System.out.println();
        System.out.println("B");
        //B
        for(int i = 24; i >= 4; i-=4)
        {
            System.out.print(i +" ");
        }    

        System.out.println();
        System.out.println("C");
        //C
        int sum = 0;
        for(int i = 1; i <= 100; i++)
        {
            sum += i;

        }   
        System.out.print(sum);

        System.out.println();       
        System.out.println("D");

        //D
        int sum1 = 0;
        double avg = 0;
        for(int i = 1; i <= 1004; i++)
        {
            sum1+= i;
        } 
        avg = sum1/1004.0;
        System.out.print(avg);

        System.out.println();
        System.out.println("E");

        //E
        for(int i = 1; i <= 5; i++)
        {
            System.out.print((int)(100*Math.random()+1) + " ");
        } 

        System.out.println();
        System.out.println("F");

        //F
        for(int i = 1; i <= 10; i++)
        {
            if(i < 10)
                System.out.print((int)(21*Math.random()+4) + ",");
            else
                System.out.print((int)(21*Math.random()+4));
        } 

        System.out.println();
        System.out.println("G");

        //G
        int [] arr  = new int[20];
        for(int i = 0; i < 20; i++)
        {
            arr[i] = (int)(101*Math.random()-50);
            System.out.print(arr[i] + " ");
        } 
        Arrays.sort(arr);
        System.out.println();
        System.out.print(arr[19]);
        
        System.out.println();
        System.out.println("H");

        //H
    
        for(int i = 1; i <= 400; i++)
        {
            int j = (int)(Math.sqrt(i));
            if(i == j*j)
                System.out.print(i + " ");
        } 

    }
}
