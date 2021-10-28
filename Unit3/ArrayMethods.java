import java.util.*;

public class ArrayMethods {
    public static void main(String [] args){
        int [] arr = {9,0,9,9};
        System.out.println(lastIndexOf(arr, 9));
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
}
