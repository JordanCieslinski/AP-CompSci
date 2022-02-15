package Sorting.Day1;

import java.util.*;

public class LinearAndBinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 5, 6));
        int ans = linearSearch(nums, 5);
        if (ans == 4)
            System.out.println("Linear Search is Correct");
        else
            System.out.println("incorrect");

        int[] a = { 3, 2, 5, 6, 1, 9, 4 };
        int result = binarySearch(a, 2);
        if (result == 1)
            System.out.println("Binary Search is Correct");
        else
            System.out.println("incorrect");

    }

    // Do a linear search on array to find the index of number.
    // The method returns the first location of number or -1 if it is not in list
    public static int linearSearch(ArrayList<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == number) {
                return i;
            }
        }
        return -1;

    }

    // The method returns the location of number during a binary search or -1 if it
    // is not in array
    public static int binarySearch(int[] array, int number) {
        Arrays.sort(array);
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            if (number == array[end / 2]) {
                return end / 2;
            } else if (number > array[end / 2]) {
                start = (end / 2) + 1;

            } else if (number < array[end / 2]) {
                end = (end / 2) - 1;
            }
        }
        return -1;

    }
}
