import java.util.*;
public class twoD_Array_Practice {
    public static void main(String[] args) {
        String [][] arr = {{"bananaa", "banana","bananafot"},{"banana", "banana","banana"}};
        int[][] nums = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        hashtag(arr, "#");
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(sumOfDiag(nums));
        
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

    public static void randomInts(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int)(10 * Math.random() + 1);
            }
        }
    }
    public static void frogurt(String [] [] arr) {
        for (int i = 0; i < arr.length; i++) {
                arr[i][2] = "frogurt";
        }
    }
    public static void hashtag(String [][] arr , String str){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j+=2){
                arr[i][j] = str;
            }
        
    }
    }

    public static boolean isValidIndex(int [][] arr, int row, int column){
        if(arr.length - row > 0 && arr[0].length - column > 0)
            return true;
        return false;
    }
    public static int fourCorners(int [][] arr) {
        return arr[0][0] + arr[arr.length-1][0] +arr[0][arr[0].length-1] + arr[arr.length-1][arr[0].length-1];
        
    }
    public static void midRow (int[][] arr){
        for(int i =0; i < arr[arr.length/2].length; i++){
            System.out.print(arr[arr.length/2][i] + " ");

        }
    }
    public static boolean bananas(String[][] arr) {
        boolean valid = false;
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr.length; j ++){
                if(arr[i][j].indexOf("banana") != -1)
                    valid = true;
                else
                    valid = false;
            }
        }
        return valid;

    }
    public static int sumOfDiag(int[][] arr) {
        int sum = 0;
        int columns = 0;
        int rows = arr.length;
        for(int i = rows-1; i >= 0; i--){
                sum+=arr[i][columns];
                columns++;
        }
        return sum;
    }


}