
import java.util.*;

public class twoD_Array_Notes{

    public static void main(String [] args){
        
        int [] [] arr = new int[3][4]; //3 rows, 4 columns

        int[][] nums = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        System.out.println(nums[1][0]); // prints : 4
        System.out.println(nums[2][1]); // prints : 8
        //System.out.println(nums[2][3]); // prints : RUNTIME ERROR (IndexOutOfBounds)
        System.out.println(Arrays.toString(nums[2])); //prints : [7, 8, 9]
        System.out.println(nums); //& THIS PRINTS OUT THE MEMORY ADDRESS OF NUMS
        //&PRINTING OUT A 2D ARRAY

        //Option 1
        for(int i = 0; i < nums.length; i++){ // nums.length = # of rows/arrays
            for(int j = 0; j < nums.length; j++){ //nums[0].length = # of columns or elements in each array
                System.out.println(nums[i][j]);
            }
            System.out.println();
        }

        //Option 2
        for(int i = 0; i < nums.length; i++){
            System.out.println(Arrays.toString(nums[i]));
        }

        //Option 3
        for(int [] i : nums){
            for(int j : i){
                System.out.println(j+" ");
            }
            System.out.println();
        }

        String [] [] names = {{"Emily","Libby"} , {"Jan" , "Helen"},{"Bella" , "Sophia"}};
        int count = 0;
        for(String [] i : names){
            for(String j : i){
                for(int k = 0; k < j.length(); k++)
                    if(Character.isLetter(j.charAt(k)))
                        count++;
            }
            
        }
        System.out.println(count);

        int [][] answer = fillArray(3, 4);
        for(int i = 0; i < answer.length; i++){
            System.out.println(Arrays.toString(answer[i]));
        }
    }
    public static int[] [] fillArray(int row, int col){
        int count = 1;
        int [][] arr = new int[row][col];
        for(int i = 0; i< row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = count;
                count++;
            }
        }
        return arr;
    }
}


