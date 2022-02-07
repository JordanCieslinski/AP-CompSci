package Assignment2.Q3;

import java.util.*;

public class UniqueStringList {
    private ArrayList<String> strings;
    private boolean isCaseSensitive;

    // default constructor which instantiates the field
    public UniqueStringList() {
        strings = new ArrayList<>();
        isCaseSensitive = false;
    }

    // Set the ArrayList field
    public UniqueStringList(ArrayList<String> arrayList) {
        strings = arrayList;
    }

    // Mutator method for isCaseSensitive
    public void setCaseSensitive(boolean caseSensitive) {
        isCaseSensitive = caseSensitive;
    }

    // Accessor method for isCaseSensitive
    public boolean getCaseSensitive() {
        return isCaseSensitive;
    }

    // returns the number of elements in the ArrayList
    public int size() {
        return strings.size();
    }

    // returns the string at the specified index, if it is out of bounds return null
    public String get(int index) {
        if (index >= 0 && index < size()) {
            return strings.get(index);
        } else
            return null;
    }

    // returns true if the two Strings are equal based on isCaseSensitive
    // For example, if isCaseSensitive is true, then both a and b need to be
    // identical
    public boolean stringEqual(String a, String b) {
        if (isCaseSensitive == true) {
            return a.equals(b);
        } else
            return a.equalsIgnoreCase(b);
    }

    // returns true if the string is in the ArrayList
    public boolean contains(String s) {
        for (String a : strings) {
            if (isCaseSensitive) {
                if (a.equals(s)) {
                    return true;
                }
            } 
            else {
                if (a.equalsIgnoreCase(s)) {
                    return true;
                }
            }

        }
        return false;
    }

    // if the string already exists in the ArrayList then don't add it, and
    // return false. If it's not in there already, then add it and return true
    public boolean add(String s) {
        if (contains(s) == false) {
            strings.add(s);
            return true;
        } else
            return false;

    }

    // remove the specified string from the ArrayList, if it's not in
    // the array list, then don't do anything
    public void remove(String s) {
        while (contains(s)) {
            strings.remove(s);
        }
    }

    // returns the ArrayList as a string
    public String toString() {
        return strings + "";
    }
}
