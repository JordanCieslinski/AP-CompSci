import java.util.*;

public class oneD_Array_Notes{


    public static void main(String [] args){
        int[] goose = new int[6]; //instantiating an array of integers called goose
        //0 , 0 , 0 , 0 , 0 , 0
        goose[2] = 9; //0 , 0 , 9 , 0 , 0 , 0
        goose[5] = 99; ///0 , 0 , 9 , 0 , 0 , 99
        //goose[7] = 99;// COMPILES, BUT RUNTIME ERROR (IndexOutOfBounds)
        goose[goose.length - 2] = 29; //0 , 0 , 9, 0 , 29 , 99

        String[] words = {"giants", "knicks","yankees"};
        //print out the length of the second element in words
        System.out.println(words[1].length());

        //find the largest value in goose
        int [] temp = goose;
        Arrays.sort(temp);
        int largest  = temp[temp.length-1];
        System.out.println(largest);

        //Copy all values from goose and put them into loose

        int [] loose = new int[goose.length];
        for(int i = 0; i < loose.length; i++){
            loose[i] = goose[i];
        }
        Arrays.sort(goose); //This perminately changes goose forever
        System.out.println(Arrays.toString(goose)); // [0, 0, 0, 9, 29, 99]

        //ENHANCED For Loops (also know as a For-Each Loop)
        for(String i : words){
            System.out.println(i);
        }
        //TWO EXCEPTIONS WITH ENHANCED FOR LOOPS
        //1) YOU CANNOT UPDATE AN ELEMENTIN AN ARRAY
        //2) IT ALWAYS GOES THROUGH THE WHOLE ARRAY


        int[]nums = numArray(goose);
        System.out.println(Arrays.toString(nums));



        }

        //Find out how many elements in arr are equal to 9
        //Then, return an array with only 9's in the array
        public static int[] numArray(int[] arr){
            int count = 0;
            for(int i: arr){
                if(i == 9)
                    count++;
            }
            int [] arr1 = new int[count];
            for(int i = 0; i < arr1.length; i++)
                arr1[i] = 9;
            return arr1;
        }
}