import java.util.*;

public class ArrayMethods {
    public static void main(String [] args){
        String [] arr = {"a", "bb", "b", "ccc"};
        System.out.println(Arrays.toString(wordsRemoved(arr, 4)));
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
    public static int mostVowels(String [] arr){
        int count = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[i].length(); j++){
                if(arr[i].charAt(j) == 'a' || arr[i].charAt(j) == 'e' || arr[i].charAt(j) == 'i' || arr[i].charAt(j) == 'o' || arr[i].charAt(j) == 'u')
                    count++;
            }
            if (count > max){
                max = count;
                count = 0;
            }
        }
        return max;
    }
    public static int [] changeNumber(int [] numbersArray , int changeFrom, int changeTo){

        for(int i = 0; i < numbersArray.length; i++){
            if(numbersArray[i] == changeFrom)
                numbersArray[i] = changeTo;
        }
        return numbersArray;
    }
    public static boolean haveThree(int [] arr){
        boolean valid = true;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 3){
                if(i == 0 && arr[i+1] == 3)
                    valid = false;
                else if(i == arr.length-1 && arr[i-1] ==3)
                    valid = false;
                else if((i != 0 && i != arr.length-1) && (arr[i-1] == 3 || arr[i+1] == 3))
                    valid = false;
            }
            
        }
        return valid;
    }
    public static String [] wordsRemoved(String [] str, int num){
        int count = 0;
        for(int i = 0; i < str.length; i++){

            if(str[i].length() == num){
                count++;
                str[i] = "";
                System.out.println(Arrays.toString(str));
            }
        }
        String [] temp = new String[str.length-count];
        System.out.println(Arrays.toString(temp));

        for(int i = 0; i < temp.length; i++){

            for(int j = 0; j < str.length; j++){

                if(!str[j].equals("")){
                    temp[i] = str[j];
                    if(temp[i] != null){
                        str[j] = "";
                        break;
                    }
                }
        }
        }
        
        return temp;
    }



}

