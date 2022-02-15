package Sorting.Day2;

import java.util.Arrays;

public class InsertionSortWithNoHelp {
    public static void main(String[] args) {
        int[] array1 = { 5, 3, 4, 1, 6, 2 };
        int[] array2 = { 5, 6, 4, 8, 9, 7, 3, 1, 2 };

        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array: ");
        System.out.println(Arrays.toString(array2));
        System.out.println();

        // sort first array
        insertionSort(array1);
        // sort second array
        insertionSort(array2);

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array sorted: ");
        System.out.println(Arrays.toString(array2));
    }

    /*
     * Insertion sort takes in an array of integers and
     * returns a sorted array of the same integers.
     */
    public static void insertionSort(int[] arr) {
        
    }
}