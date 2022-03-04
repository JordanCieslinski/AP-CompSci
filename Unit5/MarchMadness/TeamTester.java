package MarchMadness;

import java.io.*;
import java.util.*;
import java.awt.*;

public class TeamTester {
    private static String round = "1st round";
    private static int intRound = 6;

    private static int xPos1 = 165;
    private static int xPos2 = 1535;
    private static int yPos1 = 55;
    private static int yPos2 = 55;
    private static int jumps = 26;

    private static Font font1 = new Font("Impact", Font.BOLD, 13);
    private static Font font2 = new Font("Impact", Font.BOLD, 30);

    private static DrawingPanel frame = new DrawingPanel(1920, 1080);
    private static Graphics g = frame.getGraphics();
    private static Image bracket = frame
            .loadImage(System.getProperty("user.dir") + "\\Unit5\\MarchMadness\\bracket.png");

    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputFile = new Scanner(new File(System.getProperty("user.dir") + "\\Unit5\\MarchMadness\\teams.txt"));
        ArrayList<Team> teams = new ArrayList<>();
        while (inputFile.hasNextLine()) {
            teams.add(new Team(inputFile.nextInt(), inputFile.nextLine()));
        }

        g.drawImage(bracket, 100, 0, frame);
        g.setFont(font1);
        g.setColor(Color.BLACK);

        for (int j = 0; j <= intRound; j++) {

            for (int i = 0; i < teams.size(); i++) {
                if (i < teams.size() / 2) {
                    g.drawString(teams.get(i).toString(), xPos1, yPos1);
                    yPos1 += jumps;
                } else {
                    g.drawString(teams.get(i).toString(), xPos2, yPos2);
                    yPos2 += jumps;
                }
            }
            if (teams.size() != 1) {
                for (int i = 0; i < teams.size(); i++) {
                    teams.remove(pickALoser(teams.get(i), teams.get(i + 1)));
                }
            }

            roundUpdate();

        }

        // System.out.println(teams);
    }

    public static Team pickALoser(Team a, Team b) {

        int dif = (Math.abs(a.getSeed() - b.getSeed())) * 6; // 1 - 16

        double chance = 50 + (dif / 2);
        double pickALoser = Math.random() * 101;

        if (chance >= pickALoser) {
            // System.out.println(a + " beats "+b);
            return b; // this case, "a" wins "b" loses, so return b to remove it
        } else {
            // System.out.println(b + " beat "+a);
            return a; // this case, "b" wins "a" loses, so return a to remove it
        }

    }

    public static void roundUpdate() {
        switch (round) {
            case "1st round":
                round = "2nd round";
                xPos1 = 295;
                xPos2 = 1410;
                yPos1 = yPos2 = 70;
                jumps = 52;
                break;
            case "2nd round":
                xPos1 = 420;
                xPos2 = 1305;
                yPos1 = yPos2 = 95;
                jumps = 104;
                round = "Sweet 16";
                break;
            case "Sweet 16":
                xPos1 = 545;
                xPos2 = 1180;
                yPos1 = yPos2 = 145;
                jumps = 208;
                round = "Elite Eight";
                break;
            case "Elite Eight":
                xPos1 = 680;
                xPos2 = 1050;
                yPos1 = yPos2 = 250;
                jumps = 416;
                round = "Final Four";
                break;
            case "Final Four":
                xPos1 = 810;
                xPos2 = 900;
                yPos1 = 355;
                yPos2 = 560;
                jumps = 832;
                round = "Final Four";
                round = "Championship";
                break;
            case "Championship":
                g.setFont(font2);
                xPos2 = 810;
                yPos2 = 810;

        }

    }
}
