package Assignment3;

public class DieGame {
    private int[][] arr;

    public DieGame(int[][] num) {
        arr = num;
    }

    public void getPlayerTotal(int playerNum) {
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[playerNum][i];
        }
    }

    public int getMaxPlayer() {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum+= arr[i][j];
            }
            //if(sum > maxSum) IDK IM CONFUSED AT WHAT TO DO
        }
        
    }

}
