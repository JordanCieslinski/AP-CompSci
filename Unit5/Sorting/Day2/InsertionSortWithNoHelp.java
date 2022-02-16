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
    public static int[] insertionSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

                for (int j = 0; j < i; j++) {
                    if (arr[i] < arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        return arr;
    }
}