package Assignment2;

public class GridTester {
    public static void main(String[] args) {
        Grid grid = new Grid(20, 10);
        char[] randomCharacters = { '1', 'z', 'p', 'o', 'q', 'g', 'l', '(' };
        for (int i = 0; i < 10; i++) {
            int randCharIndex = (int) (Math.random() * randomCharacters.length);
            int randRowIndex = (int) (20 * Math.random());
            int randColumnIndex = (int) (10 * Math.random());
            grid.setCell(randomCharacters[randCharIndex], randRowIndex, randColumnIndex);
        }
        System.out.println(grid);
    }
}
