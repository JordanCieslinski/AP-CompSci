package Assignment2;

public class PiggyBank {
    private int pennies;
    private int nickels;
    private int dimes;
    private int quarters;

    public PiggyBank(){
        pennies = 1;
        nickels = 1;
        dimes = 1;
        quarters = 1 ;
    }

    public PiggyBank(int p, int n, int d, int q){
        pennies = p;
        nickels = n;
        dimes = d;
        quarters = q;
    }
    
    public int getPennies(){
        return pennies;
    }

    public int getNickels(){
        return nickels;
    }

    public int getDimes(){
        return dimes;
    }

    public int getQuarters(){
        return quarters;
    }

    public void setPennies(int a){
        pennies=a;
    }

    public void setNickels(int a){
        nickels=a;
    }

    public void setDimes(int a){
        nickels=a;
    }

    public void setQuarters(int a){
        quarters=a;
    }

    public String getTotalMoney(){
        return "$"+String.format("%.2f", (pennies*.01)+(nickels*.05)+(dimes*.1)+(quarters*.25));
    }

    public String toString(){
        return quarters+" quarters, "+dimes+" dimes, "+nickels+ " nickels, and "+pennies+" pennies";
    }
}
