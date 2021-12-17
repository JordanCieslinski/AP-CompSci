package Assignment1.q4;

public class PODTESTER {
    public static void main(String[] args) {
        int counter = 0;
        PairOfDice dice = new PairOfDice();
        while (true) {
            dice.roll();
            counter++;
            if (dice.getTotal() == 2)
                break;

        }
        System.out.println("It took "+counter+" rolls to get a 2");
    }

}
