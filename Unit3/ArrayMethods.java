import java.util.*;

public class ArrayMethods {
    public static void main(String [] args){
        String [] arr = {"Hello","Hey","Hi"};
        System.out.println(findLongestWord(arr));
    }
    public static int lastIndexOf(int[] arr , int x){
        int loc = arr.length-1;
        for(int i = arr.length-1; i>=0; i++){
            if(arr[i] == x)
                return loc;
        }
        return -1;
        
    }

    public static int range(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1] - arr[0];
    }
    public static int countInRange(int[] arr, int min, int max){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < max && arr[i] > min)
                count++;
        }
        return count;
    }
    public static int oneLessSum(int [] arr){
        int sum = 0;
        for(int i = 0; i < arr.length-1; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int[] swapPlaces(int[] arr) {
        int temp = arr[arr.length-1];
        arr[arr.length-1] = arr[0];
        arr[0] = temp;
        return arr;
      }
    public static String findLongestWord(String [] arr){
        int biggest = 0;
        int pos = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i].length() > biggest){
                biggest = arr[i].length();
                pos = i;
            }
        }
        return arr[pos];
    }



}

