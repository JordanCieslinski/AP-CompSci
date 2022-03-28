package Assignment1.q2;
/**     
*       <<< THIS CODE IS NOT COMPLETE >>>
*   SavingsAccount is a subclass of BankAccount.
*   An account that earns interest at a fixed rate.
*/
public class SavingsAccount extends BankAccount
{
   private double interestRate; //Will be stored as a percentage
   public static final double MINIMUM_BALANCE = 10;
   
   /**
   *   Constructs a bank account with a given interest rate.
   */
   public SavingsAccount(double rate)  
   {
       interestRate = rate;
   }

   /**   
    *   Constructs a bank account with a given balance
    *   and a given interest rate.
    */
   public SavingsAccount(double initialBalance, double rate) 
   {
       
       super(initialBalance);
       interestRate = rate;

   }
   
   
   /**  
   *   Adds the earned interest to the account balance.
   *   Assume interestRate is stored as a percentage.
   */
   public void addInterest()   
   {
        deposit(interestRate*getBalance());
   }
   
   /** 
    *  This method overrides withdraw from the superclass.
    *  It only allows a withdrawal to occur if 
    *  resulting balance is greater than MINIMUM_BALANCE.
    */
    public void withdraw(double amount)  
    {
      if(getBalance()- amount > MINIMUM_BALANCE)
        withdraw(amount);
    }

   
}