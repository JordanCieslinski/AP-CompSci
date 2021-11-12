import java.util.*;
public class twoD_Array_Practice {
    public static void main(String[] args) {
        int[][] arr = {
            {
                2,
                2,
                3
            },
            {
                4,
                5,
                6
            },
            {
                4,
                5,
                6
            }
        };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(randomInts(arr)));
        }
    }
    public static int sumOfRow(int[][] arr, int row) {
        int sum = 0;
        for (int i = 0; i < arr[row].length; i++) {
            sum += arr[row][i];
        }
        return sum;

    }
    public static int oddNums(int[][] arr, int col) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] % 2 != 0)
                count += arr[i][col];
        }
        return count;
    }

    public static int numOfElements(double[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                count++;
            }
        }
        return count;


    }

    public static boolean isSquare(int[][] arr) {
        if (arr.length == arr[0].length)
            return true;
        return false;
    }

    public static int[][] randomInts(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int)(10 * Math.random() + 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

}