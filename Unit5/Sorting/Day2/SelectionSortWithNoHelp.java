package Sorting.Day2;

import java.util.Arrays;

public class SelectionSortWithNoHelp {
    public static void main(String[] args) {
        int[] array1 = generateArrayOfLength(10);
        int[] array2 = generateArrayOfLength(20);

        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array: ");
        System.out.println(Arrays.toString(array2));
        System.out.println();

        // sort first array
        selectionSort(array1);
        // sort second array
        selectionSort(array2);

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array sorted: ");
        System.out.println(Arrays.toString(array2));
    }

    public static int[] generateArrayOfLength(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        // Arrays.sort(arr);
        return arr;
    }

    /*
     * Selection sort takes in an array of integers and
     * returns a sorted array of the same integers.
     */
    // 6, 2 , 1, 7, 3
    public static int[] selectionSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }
}