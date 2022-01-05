package Assignment2;
import java.util.*;

public class PizzaTester{
public static void main(String[] args)
{
PizzaParlor jimboslice = new PizzaParlor();
orderPizzas(jimboslice, 3, 4, 3);
printOrder(jimboslice);
}
public static void orderPizzas(PizzaParlor food, int cheese, int pepp, int veg)
{
        for(int i = 0; i < cheese; i++)
        {
        food.orderCheese();
        }
        for(int i = 0; i < pepp; i++)
        {
        food.orderPepperoni();
        }
        for(int i = 0; i < veg; i++)
        {
        food.orderVeggie();
        }
}
    public static void printOrder(PizzaParlor food)
    {
    System.out.print("# of Cheeses ordered is: " + food.getCheesePizzas()
    + "\n# of Pepperoni ordered is: " + food.getPeppPizzas() + "\n# of Veggie ordered is: "+ food.getVegPizzas());
    System.out.print("\n\nRemaining supply of cheese in ounces is: " +
    food.getCheeseSupply() + "\nRemaining supply of pepperoni in ounces is: "+
    food.getPepperoniSupply() + "\nRemaining supply of veggies in ounces is: " +
    food.getVeggieSupply() +  "\nRemaining supply of dough in ounces is: " + food.getMyDoughSupply());
    System.out.print("\n\nRevenue is: $" + String.format("%.2f", food.getMyRevenue()) +"\nBank Balance is now: $"+ String.format("%.2f", (food.getMyOrigAcctBal()+food.getMyRevenue())));
    }
}