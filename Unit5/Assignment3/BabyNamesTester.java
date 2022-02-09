package Assignment3;

import java.util.*;
import java.io.*;
public class BabyNamesTester
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<BabyName> names = new ArrayList<BabyName>();
        BufferedReader br = new BufferedReader(new FileReader(new File("yob2016.txt")));
        String line = "";
        while ((line = br.readLine()) != null) 
        {
            //This creates an array, where each element is separately stored into it's own position
            //For example, entries[0] is the first word before the comma, entries[1] is the second etc.
            String[] entries = line.split(","); 
            //Create a BabyName object
            
            //Add the object to the ArrayList
            
        }
        //Test all the methods from the BabyInformation class

        
    }
}
