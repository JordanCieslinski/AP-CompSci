import java.util.*;
public class ArrayListNotes {
    public static void main(String[] args) {
        ArrayList list0 = new ArrayList(); //This creates an ArrayList which can store any data type
        list0.add(1);
        list0.add("Jackson");

        ArrayList<String> list = new ArrayList<>(); //size of list is 0
        list.add("Chris"); //[Chris]
        list.add("Alyse"); //[Chris, Alyse]
        list.add("Madison"); // [Chris, Alyse, Madison]
        list.add("Lucas"); // [Chris, Alyse, Madison, Lucas]
        System.out.println(list.size()); //Prints out 4
        list.remove(2); //Remove Madison from the list and shifts Lucas down
        System.out.println(list);
        list.add(1,"Madison"); //[Chris, Madison, Alyse, Lucas]
        System.out.println(list);
        String name = list.set(2, "Bill"); //Replaces Alyse with Bill, name stores Alyse
        int loc = list.indexOf("Bill"); //Returns the location of Bill which is 2
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(2,4,5,7,8,9,0));
        int sum = 0;
        for(int i =0; i < list2.size(); i++){
            sum+= list2.get(i); //get(i) wil get the number at the position i
        }
        Collections.sort(list2); //sorts the ArrayList from smallest to largest

        ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("Bill", "Tom", "Josh"));
        System.out.println(evenLength(list3));

    }
    public static int countNum(ArrayList<Integer> nums) {
        int count = 0;
        for(int i =0; i < nums.size(); i++){
           if(nums.get(i) == 9){
               count++;
           }
        }
        return count;
        
    }

    public static int removeNum(ArrayList<Integer> nums) {
        int count = 0;
        for(int i =0; i < nums.size(); i++){
           if(nums.get(i) == 9){
               nums.remove(i); //[0, 9, 4, 3, 2]
               i--;
           }
        }
        return count;
        
    }

    public static ArrayList<String>  evenLength(ArrayList<String> str) {
        ArrayList<String> list = new ArrayList<String>();
        for(String i: str){
            if(i.length() % 2 == 0){
                list.add(i);
            }
        }
        return list;
        
    }
}
