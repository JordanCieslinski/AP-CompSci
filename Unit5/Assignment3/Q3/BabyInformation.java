package Assignment3.Q3;

import java.util.*;

public class BabyInformation {
    // create an ArrayList of type BabyName called names
    private ArrayList<BabyName> names;

    public BabyInformation(ArrayList<BabyName> n) {
        names = n;
    }

    // returns how many babies were born in the year
    public int totalBirths() {
        int total = 0;
        for (int i = 0; i < names.size(); i++) {
            total += names.get(i).getQuantity();
        }
        return total;
    }

    // returns the most popular boy or girls name, based on gender
    public String mostPopularName(String gender) {
        int max = Integer.MIN_VALUE;
        String mostPopular = "";

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).getGender().equals(gender)) {
                if (names.get(i).getQuantity() > max) {
                    max = names.get(i).getQuantity();
                    mostPopular = names.get(i).getName();
                }
            }
        }
        return mostPopular;

    }

    // returns the total number of births, based on gender
    // ***You must use an enhanced for loop in your solution***
    public int totalBirthsByGender(String gender) {
        int total = 0;
        for (BabyName i : names) {
            if (i.getGender().equals(gender)) {
                total+=i.getQuantity();
            }
        }
        return total;

    }

    // returns a String of names based on the length of the name, num, and the
    // gender
    // For example, System.out.println(getSpecificNames(4,"F")); would result in:
    // Emma
    // Mary
    // Jill, etc...
    public String getSpecificNames(int num, String gender) {
        String s = "";
        for (BabyName i : names) {
            if (i.getGender().equals(gender) && i.getName().length() == num) {
                s+=i.getName()+"\n";
            }
        }
        return s;
    }

    // returns the numbers of babies with name
    public int getQuantity(String name) {
        int total = 0;
        for (BabyName i : names) {
            if (i.getName().equals(name)) {
                total+= i.getQuantity();
            }
        }
        return total;
    }

    // returns true if there were more male births than female births
    // returns false if they are equal
    public boolean whichGenderHappenedMore() {
        int totalBoys = 0;
        int totalGirls = 0;

        for (BabyName i : names) {
            if (i.getGender().equals("M")) {
                totalBoys+=i.getQuantity();
            }
            else
                totalGirls+=i.getQuantity();
        }
        if(totalBoys > totalGirls){
            return true;
        }
        else if(totalBoys == totalGirls)
            return false;
        else
            return false;
    }

    // returns a 2D array of random male and female names
    // the dimensions of the array will be controlled by row and col
    public String[][] randomNames(int row, int col) {
        String [][] s = new String[row][col];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                s[i][j] = "";
            }
        }
        return s; //NOT DONE, NEED TO CHOOSE RANDOM NAMES
    }
}