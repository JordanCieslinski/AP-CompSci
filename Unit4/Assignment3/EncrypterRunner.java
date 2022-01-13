package Assignment3;

public class EncrypterRunner
{
   public static void main(String[] args)
   {
      Encrypter testEncrypter = new Encrypter(3, false);
      String inputWord = "zebra";
      String encryptedWord = "";
      
      encryptedWord = testEncrypter.encrypt(inputWord);
      
      if (encryptedWord.equals("cheud")) 
      {
         System.out.println("Correct");
      }
      else 
      {
         System.out.println("Incorrect");
         System.out.println("Input word: " + inputWord);
         System.out.println("Your encrypted word: " + encryptedWord);
         System.out.println("Expected encrypted word: " + "khoor");

      }
   }
}
