package MarchMadness;

import java.io.*;
import java.util.*;

public class TeamTester {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputFile = new Scanner(new File(System.getProperty("user.dir")+"\\Unit5\\MarchMadness\\teams.txt"));
        ArrayList<Team> teams = new ArrayList<>();
        while(inputFile.hasNextLine()){
            teams.add(new Team(inputFile.nextInt(), inputFile.nextLine()));
        }
        int count = 0;
        for(int i = 0; i < teams.size(); i ++){
            teams.remove(likeliness(teams.get(i), teams.get(i+1)));
        }
        System.out.println(teams);
    }

    public static Team likeliness(Team a, Team b){
        int better = Math.min(a.getSeed(), b.getSeed());
        int worse = Math.max(a.getSeed(), b.getSeed());
        
        int dif = worse-better;

        double betterChance = 50;

        betterChance += dif/2;

        double pickALoser = Math.random()*101;

        if(pickALoser >= betterChance)
            return b; // this case, "a" wins "b" loses, so return b to remove it
        else
            return a; // this case, "b" wins "a" loses, so return a to remove it
        
        
        
    }
}
