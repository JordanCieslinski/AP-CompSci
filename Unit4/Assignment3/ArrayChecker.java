package Assignment3;

public class ArrayChecker {
    private int[][] arr;

    public ArrayChecker(int[][] in) {
        arr = in;
    }

    public int arrayInstance(int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    count++;
                }
            }
        }
        return count;
    }

    public int arrayDivisor(int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % num == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
