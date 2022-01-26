import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Assignment1 {

    public Assignment1(){

    }

    public double averageVowels(ArrayList<String> str) {
        if (str.size() == 0)
            return 0.0;
        else {
            double sum = 0.0;
            for (String s : str) {
                for (int i = 0; i < s.length(); i++) {
                    char a = s.charAt(i);
                    if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                        sum++;

                    }

                }
            }
            return sum / str.size();
        }
    }

    public void swapPairs(ArrayList<String> str){
        int size = str.size();
        if(str.size() % 2 != 0){
            size = str.size() - 1;
        }
        else{
            
            for(int i = 1; i < size; i++){
                str.set(i-1, str.set(i, str.get(i-1)));
            }
    }
    System.out.println(str);
    }

    public ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i: list1){
            list.add(i);
        }
        for(int i: list2){
            list.add(i);
        }
        Collections.sort(list);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) == list.get(i-1)){
                ans.add(list.get(i));
            }
        }
        return ans;
    }

    public void removeEvenLength(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

    public void doubleList(ArrayList<String> list) {
        for(int i =0; i <list.size(); i++){
            list.add(i, list.get(i));
            i++;
        }
        System.out.println(list);
    }

    public void minToFront(ArrayList<Integer> list){
        int min = list.get(0);
        int index = 0;
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) < list.get(i-1)){
                min = list.get(i);
                index = i;
            }
        }
        list.remove(index);
        list.add(0, min);
        System.out.println(list);
    }
}
