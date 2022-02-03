package Assignment2.Q2;
import java.util.*;

public class PokemonPC {
    private ArrayList<Pokemon> list;

    // default constructor which instantiates the field
    public PokemonPC() {
        list = new ArrayList<>();
    }

    // initialize the field to be equal to poke
    public PokemonPC(ArrayList<Pokemon> poke) {
        list = poke;
    }

    // add the specified pokemon to the arraylist
    public void add(Pokemon p) {
        list.add(p);
    }

    // return the number of pokemon in the pc
    public int count() {
        return list.size();
    }

    // remove all the pokemon from the arraylist with the specified name
    public void removeByName(String name) {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName().equals(name)){
                list.remove(i);
                i--;
            }
        }
    }

    // return all of the pokemon with the specified type
    public ArrayList<Pokemon> getPokemonOfType(String type) {
        ArrayList<Pokemon> ans = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getType().equals(type)){
                ans.add(list.get(i));
            }
        }
        return ans;
    }

    // return the Pokemon with the highest level. If there is a tie, return the
    // one that appears first in the Arraylist
    public Pokemon getHighestLevel() {
        Pokemon maxLevelPokemon = new Pokemon("", "", Integer.MIN_VALUE);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getLevel() > maxLevelPokemon.getLevel()){
                maxLevelPokemon = list.get(i);
            }
        }
        return maxLevelPokemon;
    }

    // return a string containing all of the pokemon
    public String toString() {
        String str = "";
        for(Pokemon i: list){
            str+=i+"\n";
        }
        return str;
    }
}
