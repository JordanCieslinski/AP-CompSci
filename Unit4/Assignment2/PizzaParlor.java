package Assignment2;

public class PizzaParlor {
    private int myNumCheesePizzas;
    private int myNumPeppPizzas;
    private int myNumVegPizzas;
    private int myCheeseSupply;
    private int myPepperoniSupply;
    private int myVeggieSupply;
    private int myRevenue;
    private int myOrigAcctBal;

    private int myDoughSupply;

    public PizzaParlor() {
        myNumCheesePizzas = 0;
        myNumPeppPizzas = 0;
        myNumVegPizzas = 0;
        myCheeseSupply = 400;
        myPepperoniSupply = 200;
        myVeggieSupply = 200;
        myRevenue = 0;
        myOrigAcctBal = 1000;

        myDoughSupply = 400;
    }

    public void orderCheese() {
        myNumCheesePizzas++;
        myCheeseSupply -= 12;
        myRevenue += 8;
        myDoughSupply -=11;
    }

    public void orderPepperoni() {
        myNumPeppPizzas++;
        myCheeseSupply -= 8;
        myPepperoniSupply -= 6;
        myRevenue += 10;

        myDoughSupply -=11;

    }

    public void orderVeggie() {
        myNumPeppPizzas++;
        myCheeseSupply -= 8;
        myVeggieSupply -= 12;
        myRevenue += 11;

        myDoughSupply -=11;

    }

    public int getCheesePizzas() {
        return myNumCheesePizzas;
    }

    public int getPeppPizzas() {
        return myNumPeppPizzas;
    }

    public int getVegPizzas() {
        return myNumVegPizzas;
    }

    public int getCheeseSupply() {
        return myCheeseSupply;
    }

    public int getPepperoniSupply() {
        return myPepperoniSupply;
    }

    public int getVeggieSupply() {
        return myVeggieSupply;
    }

    public double getMyRevenue() {
        return myRevenue;
    }

    public double getMyOrigAcctBal() {
        return myOrigAcctBal;
    }

    public int getMyDoughSupply(){
        return myDoughSupply;
    }
}
