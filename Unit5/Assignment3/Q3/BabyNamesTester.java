package Assignment3.Q3;

import java.util.*;
import java.io.*;

public class BabyNamesTester {
    public static void main(String[] args) throws IOException {
        ArrayList<BabyName> names = new ArrayList<BabyName>();
        BufferedReader br = new BufferedReader(
                new FileReader(new File(System.getProperty("user.dir") + "\\Unit5\\Assignment3\\Q3\\yob2016.txt")));
        String line = "";
        while ((line = br.readLine()) != null) {
            // This creates an array, where each element is separately stored into it's own
            // position
            // For example, entries[0] is the first word before the comma, entries[1] is the
            // second etc.
            String[] entries = line.split(",");
            // Create a BabyName object
            BabyName baby = new BabyName(entries[0], entries[1], Integer.parseInt(entries[2]));
            // Add the object to the ArrayList
            names.add(baby);
        }
        // Test all the methods from the BabyInformation class
        BabyInformation b = new BabyInformation(names);

        System.out.println(b.totalBirths());

        System.out.println(b.mostPopularName("F"));
        System.out.println(b.mostPopularName("M\n"));

        System.out.println(b.totalBirthsByGender("F"));
        System.out.println(b.totalBirthsByGender("M\n"));

        System.out.println(b.getSpecificNames(0, "F"));
        System.out.println(b.getSpecificNames(0, "M\n"));

        System.out.println(b.getQuantity("Jordan\n"));

        System.out.println(b.whichGenderHappenedMore());

        for (String[] i : b.randomNames(2, 2)) {
            System.out.println(Arrays.toString(i));
        }

    }
}
