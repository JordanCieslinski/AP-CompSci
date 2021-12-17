package Assignment1.q3;

import java.util.*;

public class StockTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input implementation here
        System.out.print("First Stock's symbol: ");
        Stock firstStock = new Stock(in.next());
        System.out.println();
        double profit1 = makePurchases(firstStock, in);
        System.out.println("Net profit/Loss: $" + profit1);
        System.out.println();

        System.out.print("Second Stock's symbol: ");
        Stock secondStock = new Stock(in.next());
        System.out.println();
        double profit2= makePurchases(secondStock, in);
        System.out.println("Net profit/Loss: $" + profit2);
        System.out.println();
        if(profit1 > profit2)
            System.out.println(firstStock.getSymbol()+" was more profitable than "+ secondStock.getSymbol());
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
        System.out.println("How many purchases did you make? ");
        int purchases = in.nextInt();
        for (int i = 1; i <= purchases; i++) {
            System.out.println("Purchase " + i + ": How many shares, at what price per share? ");
            currentStock.purchase(in.nextInt(), in.nextDouble());
        }
        System.out.println("What is today's price per share?");
        double currentPrice = in.nextDouble();
        return currentStock.getProfit(currentPrice);
    }
}