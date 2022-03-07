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

    private static double roundEq = 0;

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
                for (int i = 1; i < teams.size(); i++) {
                    teams.remove(polyAlgorithim(teams.get(i - 1), teams.get(i)));
                }

            }

            roundUpdate();
            System.out.println(teams);

        }

        // System.out.println(teams);
    }

    public static Team pickALoser(Team a, Team b) {

        int dif = (Math.abs(a.getSeed() - b.getSeed())) * 6; // 1 - 16

        double chance = 50 + (dif / 2);
        double pickALoser = Math.random() * 101;

        if (chance >= pickALoser) {
            return b; // this case, "a" wins "b" loses, so return b to remove it
        } else {
            return a; // this case, "b" wins "a" loses, so return a to remove it
        }

    }

    public static Team polyAlgorithim(Team a, Team b) {
        // int betterTeam = Math.min(a.getSeed(), b.getSeed());
        double teamAChance = eqUpdate(a.getSeed());
        double teamBChance = eqUpdate(b.getSeed());

        if (Math.random() * 101 < teamAChance) { // TeamA is predicted to win
            if (Math.random() * 101 < teamBChance) // AB
                pickALoser(a, b);
            else
                return b; // A !B

        } else if (Math.random() * 101 > teamAChance) { // Math.random() * 101 > teamAChance, meaning TeamA is predicted
                                                        // to not win
            if (Math.random() * 101 > teamBChance) { // !A B
                return a;
            } else
                return pickALoser(a, b);

        }
        return pickALoser(a, b);
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
                round = "Championship";
                break;
            case "Championship":
                g.setFont(font2);
                xPos2 = 810;
                yPos2 = 810;

        }

    }

    public static double eqUpdate(int x) {
        switch (round) {
            case "1st round":
                roundEq = (0.00123640549338355 * Math.pow(x, 5))
                        + (-0.0525472334687695 * Math.pow(x, 4)) + (0.781416210217481 * Math.pow(x, 3))
                        + (-4.73996288805966 * Math.pow(x, 2)) + (3.83886441232032 * x)
                        + 99.384615385543;
                break;
            case "2nd round":
                roundEq = (0.00136416408595741 * Math.pow(x, 6)) + (-0.0679335853396106 * Math.pow(x, 5))
                        + (1.28435589746881 * Math.pow(x, 4))
                        + (-11.531137118493 * Math.pow(x, 3)) + (50.7128361060342 * Math.pow(x, 2))
                        + (-107.829974824467 * x) + 153.225961523057;
                break;
            case "Sweet 16":
                roundEq = (-0.00187349501095757 * Math.pow(x, 6)) + (0.0983445462644705 * Math.pow(x, 5))
                        + (-1.95606675419287 * Math.pow(x, 4))
                        + (18.191523268583 * Math.pow(x, 3)) + (-78.4022049713164 * Math.pow(x, 2))
                        + (127.88528091031 * x) + 14.6230770074505;
                break;
            case "Elite Eight":
                roundEq = (0.000580710353994929 * Math.pow(x, 6)) + (-0.0291731662133495 * Math.pow(x, 5))
                        + (0.568202415584274 * Math.pow(x, 4))
                        + (-5.35962108708016 * Math.pow(x, 3)) + (24.5067854458327 * Math.pow(x, 2))
                        + (-49.6406144992114 * x) + 86.2048076801088;
                break;
            case "Final Four":
                roundEq = (-0.000239078087344864 * Math.pow(x, 6)) + (0.00689707866795823 * Math.pow(x, 5))
                        + (-0.00644581378739478 * Math.pow(x, 4))
                        + (-1.38041200314272 * Math.pow(x, 3)) + (13.6007251408599 * Math.pow(x, 2))
                        + (-45.1822185864554 * x) + 94.1865384651134;
                break;
            case "Championship":
                roundEq = (-0.0000328947369929583 * Math.pow(x, 6)) + (-0.00616600181799951 * Math.pow(x, 5))
                        + (0.318215646425281 * Math.pow(x, 4)) + (-5.37727955908251 * Math.pow(x, 3))
                        + (38.7171679195532 * Math.pow(x, 2)) + (-117.402018222903 * x)
                        + 151.856730759949;
        }
        if (roundEq < 0)
            return 0.0;
        else
            return roundEq;
    }
}
