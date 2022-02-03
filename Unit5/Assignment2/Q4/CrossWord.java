package Assignment2.Q4;

public class CrossWord {
    private String word1;
    private String word2;

    public CrossWord(String a, String b) {
        word1 = a;
        word2 = b;
    }

    public int findCommonLetter() {
        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    return i;
                }

            }
        }
        return -1;
    }

    public void printCrossWords() {
        int startPos = word2.indexOf(word1.charAt(findCommonLetter()));
        for (int i = 0; i < word1.length(); i++) {
            if (i == findCommonLetter()) {
                System.out.println(word2);
            } else {
                for (int j = 0; j < startPos; j++) {
                    System.out.print(" ");
                }
                System.out.print(word1.charAt(i));
                System.out.print("\n");

            }
        }

    }
}
