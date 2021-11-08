import java.util.*;

public class TrackingSales {
    public static void main(String [] args){
        Scanner console = new Scanner(System.in);
        int total = 0;
        System.out.print("Enter the amount of sales associates: ");
        int [] sales = new int[console.nextInt()];
        for(int i = 0; i < sales.length; i++){
            System.out.print("Enter Sales for salesperson "+(i+1)+": ");
            sales[i] = console.nextInt();
            total += sales[i];
        }
        System.out.print("\nSalesperson     Sales\n---------------------");

        for(int i =0; i < sales.length; i++){
            System.out.print("\n     "+(i+1)+"          "+sales[i]);
        }
        System.out.println("\nTotal Sales: $"+total);
        System.out.println("Average Sales: "+avgSale(sales, total));
        System.out.println("The range is : "+rangeSale(sales));
        exceededSales(sales, 2);
    }
    public static String avgSale(int [] sales, int total){
        
        return String.format("%.2f",total/((double)(sales.length)));
    }
    public static void maxSale(int [] arr){
        int max = arr[0];
        int indexOfMax = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                indexOfMax = i;
            }
        }
        System.out.println("Salesperson "+(indexOfMax+1)+" had the highest sale with $"+max);
    }
    public static int rangeSale(int [] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        return max-min;
    }
        public static void exceededSales(int [] sales, int amount){
            int count = 0;
            for(int i = 0; i < sales.length; i++){
                if(sales[i] > amount){
                    System.out.println("Salesperson "+(i+1)+" exceeded the amount of sales, their  sales were "+sales[i]);
                    count++;
                }
            }
            if(count ==1)
                System.out.println("There was "+1+" sales associates who exceeded the amount.");
            else if(count == 0)
                System.out.println("There were no sales associates who exceeded the amount.");
            else
                System.out.println("There were "+count+" sales associates who exceeded the amount.");



        }
        
}
