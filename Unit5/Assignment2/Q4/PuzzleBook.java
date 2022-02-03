package Assignment2.Q4;

import java.util.*;

public class PuzzleBook {
    private ArrayList<CrossWord> puzzles;

    /**
     * Make a CrossWord puzzle for every 2 strings and
     * add the puzzle to puzzles.
     * Precondition: str will contain at least 2 Strings and there
     * will be an even number of Strings in the array.
     */
    public PuzzleBook(String[] str) {
        puzzles = new ArrayList<>();
        for(int i = 1; i < str.length; i+=2){
            puzzles.add(new CrossWord(str[i-1], str[i]));
        }
        
    }

    /**
     * If there are no common letters in the CrossWord Puzzle
     * then the puzzle is removed from puzzles.
     */
    public void removeBadPuzzles() {
        for(int i = 0; i < puzzles.size(); i++){
            if(puzzles.get(i).findCommonLetter() == -1){
                puzzles.remove(i);
                i--;
            }
        }
    }

    /**
     * Print out all of the puzzles.
     * Look at the sample output in the PDF to see the formatting.
     */
    public void printAllPuzzles() {
        for(int i = 0; i < puzzles.size(); i++){
            System.out.println("PUZZLE "+(i+1)+":");
            puzzles.get(i).printCrossWords();
            System.out.println("-------------------------------------");
        }
    }
}
