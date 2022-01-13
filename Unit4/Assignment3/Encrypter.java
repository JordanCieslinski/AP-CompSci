package Assignment3;

/**
 * Encrypter is a class that encrypts letter-based strings. The Encrypter
 * classes uses
 * a simple encryption alphabet in which the characters of a normal alphabet are
 * shifted
 * by a specified number of positions to either the right or left.
 * The class contains a char array normalAlphabet with the characters for the
 * normal alphabet.
 */

public class Encrypter {
    // lowercase letters of the alphabet
    private char[] normalAlphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z' };
    private char[] encryptAlphabet = new char[26];

    /* { 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z', 'a', 'b' };

    /**
     * Write the constructor for the Encrypter class. The constructor takes two
     * parameters.
     * The parameter shiftAmount indicates the number of positions the characters in
     * the normal alphabet should be shifted.
     * The parameter shiftToLeft indicates the direction the characters should be
     * shifted.
     * The constructor creates a char array encryptAlphabet that should consist of
     * the characters in normal alphabet shifted properly.
     * (Hint: Use the char array normalAlphabet to help produce the
     * encryptAlphabet).
     *                    2                        true*/
    public Encrypter(int shiftAmount, boolean shiftToLeft) {
        // Complete Part A
        if(shiftToLeft = true){
            for(int i = encryptAlphabet.length-1; i >= 0; i--){
                if(i > 25-shiftAmount){
                    for(int j = 0 ; j < shiftAmount; j++)
                        encryptAlphabet[26-shiftAmount+j] = normalAlphabet[j];
                }
                else
                    encryptAlphabet[i] = normalAlphabet[i+shiftAmount];
            }
        }
        else{
            for(int i = 0; i < encryptAlphabet.length ; i++){
                if(i < shiftAmount){
                    encryptAlphabet[i] = normalAlphabet[26-shiftAmount];
                }
                else
                    encryptAlphabet[i] = normalAlphabet[i+shiftAmount];
            }
        }
        
    }

    /**
     * Write the encrypt() method, which has a parameter for a word, and returns the
     * encrypted version of that word.
     */
    public String encrypt(String normalWord) {
        // Complete Part B
        normalWord.toLowerCase();
        String newStr = "";

        for(int i =0; i < normalWord.length(); i++){
            for(int j =0; j < normalAlphabet.length; j++){
                if(normalWord.charAt(i) == normalAlphabet[j]){
                    newStr += encryptAlphabet[j];
                }
            }

        }
        return newStr;
    }
}
