package Assignment1.q2;

/**
 * <<< THIS CODE IS NOT COMPLETE >>>
 * CheckingAccount is a subclass of BankAccount.
 * 
 * COMPLETE METHODS: deposit, withdraw, deductFees
 */
public class CheckingAccount extends BankAccount {
    /**
     * keeps track of the number of account transactions made
     */
    private int transactionCount;

    /**
     * The bank allows 3 free transactions per period,
     * 2 dollars is charged per transaction after 3.
     */
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 2.0;

    /**
     * Constructs a checking account with a given balance.
     * and initializes transaction count to 0.
     */
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
        transactionCount = 0;
    }

    /**
     * <<< COMPLETE THE METHOD BELOW >>>
     * This method overrides deposit in superclass
     * so that it will increment the number of transactions
     * and deposit the amount into the account.
     */
    public void deposit(double amount) {

        transactionCount++;
        deposit(amount);

    }

    /**
     * <<< COMPLETE THE METHOD BELOW >>>
     * This method overrides withdraw in the superclass
     * and also increments the number of transactions
     * and withdraws amount from account.
     */
    public void withdraw(double amount) {

        transactionCount++;
        super.withdraw(amount);

    }

    /**
     * <<< COMPLETE THE METHOD BELOW >>>
     * resets transaction count to 0, and deducts 2 dollars
     * for each transaction exceeding number of
     * FREE_TRANSACTIONS from the bank account
     */
    public void deductFees() {
        for(int i = transactionCount; i > FREE_TRANSACTIONS; i--){
            this.withdraw(TRANSACTION_FEE);
        }
        transactionCount = 0;
    }

}