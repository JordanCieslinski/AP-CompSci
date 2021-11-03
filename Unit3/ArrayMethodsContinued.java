import java.util.Arrays;

public class ArrayMethodsContinued {
    public static void main(String[] args){
        int [] arr = {5, 6, 5, 7, 5, 1};
        System.out.println(mode(arr));
    }
    public static double median(int [] arr){
        Arrays.sort(arr);
        if(arr.length % 2 !=0 )
            return arr[arr.length/2];
        else
            return ((arr[arr.length/2]) +(arr[arr.length/2] - 1)) / 2 ;
            
    }
    public static double sampleStdev(int [] arr){
        double sum = 0.0;
        int elements = arr.length;
        double sum1 = 0;
        for(int i : arr){
            sum += i;
        }
        double avg = sum/elements;
        for(int i : arr){
            sum1 += Math.pow((i-avg), 2);
        }
        return Math.sqrt(sum1/(elements-1));
    }
    public static double percentEven(int [] arr){
        int count = 0;
        for(int i : arr){
            if(i%2 == 0)
                count++;
        }
        return (count/arr.length)*100;
    }
    public static int priceIsRight(int [] arr, int price){
        int closest = arr[0];
        int count = 0;
        int diff = price - arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > price)
                count++;
            else if(price - arr[i] < diff) {
                closest = arr[i];
            }
                
        }
        if(count == arr.length)
            return -1;
        return closest;
        
    }
    public static int mode(int [] arr){
        int count = 0;
        int maxCount = 0;
        int most = arr[0];
        for(int i : arr){
            for(int j : arr){
                if(i == j)
                    count++;
            }
            if(count > maxCount)
                maxCount = count;
            
        }
        return maxCount;
    }
}
