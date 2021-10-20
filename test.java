public class test {
    public static void main(String [] args){
        numUnique(18, 3, 4);
    }
    public static int numUnique(int x, int y, int z){
        int count = 1;
        if(x != y)
            count++;
        else if(x!=z)
            count++;
        else if(y!=z)
            count++;
        return count;
    }
}
