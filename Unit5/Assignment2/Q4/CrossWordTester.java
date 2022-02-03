package Assignment2.Q4;

public class CrossWordTester {
    public static void main(String[] args) {
        String[] list = { "AVA", "BEAN", "BOGUS", "LAME", "COMPUTER", "FUN" };
        PuzzleBook puzz = new PuzzleBook(list);
        puzz.removeBadPuzzles();
        puzz.printAllPuzzles();
    }
}
