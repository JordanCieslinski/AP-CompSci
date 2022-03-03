package MarchMadness;

import java.io.*;
import java.util.*;

public class TeamTester {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputFile = new Scanner(new File(System.getProperty("user.dir") + "\\Unit5\\MarchMadness\\teams.txt"));
        ArrayList<Team> teams = new ArrayList<>();
        while (inputFile.hasNextLine()) {
            teams.add(new Team(inputFile.nextInt(), inputFile.nextLine()));
        }
        int count = 0;
        for (int j = 0; j < teams.size(); j++) {
            for (int i = 0; i < teams.size(); i++) {
                teams.remove(pickALoser(teams.get(i), teams.get(i + 1)));
            }
            
        }

        System.out.println(teams);
    }

    public static Team pickALoser(Team a, Team b) {

        int dif = (Math.abs(a.getSeed() - b.getSeed())) * 5;

        double chance = 50 + (dif / 2);
        double pickALoser = Math.random() * 101;

        if (pickALoser >= chance)
            return b; // this case, "a" wins "b" loses, so return b to remove it
        else
            return a; // this case, "b" wins "a" loses, so return a to remove it

    }
}
