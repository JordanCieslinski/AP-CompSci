package Assignment3;

public class DiceGame {
    private int[][] arr;

    public DiceGame(int[][] num) {
        arr = num;
    }

    public int getPlayerTotal(int playerNum) {
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[playerNum][i];
        }
        return sum;
    }

    public int getMaxPlayer() {
        int maxSum = 0;
        int sum = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum+= arr[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                index  = i;
            }
                 
            sum = 0;
        }
        return index;
        
    }

}
