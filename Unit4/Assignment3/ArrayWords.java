package Assignment3;

public class ArrayWords {
    private String [][] arr;
    
    public ArrayWords(String [][] in){
        arr = in;
    }

    public String getUpDown(int rowStart, int rowEnd, int colNumber){
        String out = "";
        for(int i = rowStart; i <= rowEnd; i++){
            out+=arr[i][colNumber];
        }
        return out;
    }

    public String getLeftRight(int colStart, int colEnd, int rowNum){
        String out = "";
        for(int i = colStart; i <= colEnd; i++){
            out+=arr[rowNum][i];
        }
        return out;
    }
}
