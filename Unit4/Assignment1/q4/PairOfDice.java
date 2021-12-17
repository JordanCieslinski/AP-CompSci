package Assignment1.q4;

public class PairOfDice {
    private int die1; // Number showing on the first die.
    private int die2; // Number showing on the second die.

    /**
     * Constructor creates a pair of dice and rolls them so that
     * they initially show some random value.
     */
    public PairOfDice() {
        die1 = (int) Math.random() * 7;
        die2 = (int) Math.random() * 7;
    }

    /**
     * 
     * Simulates rolling the dice by setting each die
     * to be a random number between 1 and 6.
     * 
     */
    public void roll() {
        die1 = (int) Math.random() * 7;
        die2 = (int) Math.random() * 7;
    }

    /**
     * Return the number showing on the first die.
     */
    public int getDie1() {
        return die1;
    }

    /**
     * Return the number showing on the second die.
     */
    public int getDie2() {
        return die2;
    }

    /**
     * Return the total showing on the two dice.
     */
    public int getTotal() {
        return die1 + die2;
    }

    /**
     * Return a String representation of a pair of dice, where die1
     * and die2 are instance variables containing the numbers that are
     * showing on the two dice.
     */
    public String toString() {
        if(die1 == die2)
            return "The dice come up double "+die1;
        return "The dice come up "+die1+" and "+die2;
    }
}
