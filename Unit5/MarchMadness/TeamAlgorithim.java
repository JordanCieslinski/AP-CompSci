package MarchMadness;


import java.io.*;
import java.util.*;

public class TeamAlgorithim {
    private ArrayList<Team> teams;
    private Scanner inputFile;

    public TeamAlgorithim() throws FileNotFoundException{
        teams = new ArrayList<>(); 
        inputFile = new Scanner(new File(System.getProperty("user.dir") + "\\Unit5\\MarchMadness\\teams.txt"));
    }
    public void addTeams(){
        while(inputFile.hasNextLine()){
            teams.add(new Team(inputFile.nextLine(), inputFile.nextInt()));
        }
    }
    public void likeliness(Team a, Team b){
        int better = Math.min(a.getSeed(), b.getSeed());
        int worse = Math.max(a.getSeed(), b.getSeed());
        
        int dif = worse-better;
        
        
        
    }
}
