import java.util.*;

public class TrackingSales {
    public static void main(String [] args){
        Scanner console = new Scanner(System.in);
        int [] sales = new int[5];
        int total = 0;
        for(int i = 0; i < sales.length; i++){
            System.out.print("Enter Sales for salesperson "+i+": ");
            sales[i] = console.nextInt();
            total += sales[i];
        }
        System.out.print("\nSalesperson     Sales\n---------------------");

        for(int i =0; i < sales.length; i++){
            System.out.print("\n     "+i+"          "+sales[i]);
        }
        System.out.print("\nTotal Sales: $"+total);

    }
}
