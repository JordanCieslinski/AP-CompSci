package Assignment1;

import java.util.*;

public class StockTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input implementation here
        System.out.print("First Stock's symbol: ");
        System.out.println();
        System.out.println("What is today's price per share? ");
        int currentStock = in.nextDouble();
        System.out.println("Net profit/Loss: $" + makePurchases(currentStock, in)); //fix not supposed to be current price but current stock

    }

    /**
     *
     * This method will collect all the stock purchases and returns the profit made
     * from the
     * currentStock.
     *
     */
    public static double makePurchases(Stock currentStock, Scanner in) {
        // Input implementation here
        Stock advisor = new Stock(in.nextLine());
        System.out.println("How many purchases did you make? ");
        int purchases = in.nextInt();
        for (int i = 1; i <= purchases; i++) {
            System.out.println("Purchase " + i + ": How many shares, at what price per share? ");
            advisor.purchase(in.nextInt(), in.nextDouble());
        }
        return advisor.getProfit(currentStock);
    }
}