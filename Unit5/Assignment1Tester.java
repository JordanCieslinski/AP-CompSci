import java.util.*;

public class Assignment1Tester {
    public static void main(String[] args) {
        Assignment1 test = new Assignment1();
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(70, 4, 8, 9, 11, 15, 17, 28, 41, 59));
        //ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));
        //ArrayList<String> list = new ArrayList<String>(Arrays.asList("how", "are", "you?"));
        test.minToFront(list);  
    }
}
