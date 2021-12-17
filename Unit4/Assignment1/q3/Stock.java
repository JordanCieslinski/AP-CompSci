package Assignment1.q3;

public class Stock {
    private String symbol;
    private int totalShares;
    private double totalCost;

    // Constructor which presets totalShares and totalCost to 0.
    public Stock(String theSymbol) {
        totalShares = 0;
        totalCost = 0;
        symbol = theSymbol;
    }

    // Records purchase of the given shares
    public void purchase(int shares, double pricePerShare) {
        totalShares+= shares;
        totalCost += shares*pricePerShare;
    }

    // Returns the total profit or loss earned on this stock, based
    // on the price per share
    public double getProfit(double todayPrice) {
        return (totalShares*todayPrice) - totalCost;
    }

    public String getSymbol() {
        return symbol;
    }
}