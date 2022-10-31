package week1.basics.GeneralProgEx.FOOTBALL;

import week1.basics.GeneralProgEx.FOOTBALL.FootballTeam;
import week1.basics.GeneralProgEx.FOOTBALL.Player;

import java.util.Set;

public class Main {
    //-----MAIN FUNCTION------------------------------------
    public static boolean checkTeamsNamesInput(String name)
    {
        if (name.equals("Barcelona") ||name.equals("barcelona") || name.equals("Rishon") || name.equals("rishon")||
        name.equals("RealMadrid") || name.equals("realMadrid")) return true;
        else return false;
    }


    public static void main(String[] arg) {
        int[] positions = {1, 4, 4, 2};
        String teamName= "Barcelona";

        if(checkTeamsNamesInput(teamName))
        {
            FootballTeam myTeam= FootballTeam.createNewTeamByPositions(teamName, positions);
            Set<Player> players= myTeam.getPlayers();

            FootballTeam.printTeam(players);
            FootballTeam.writeTeamToFile(myTeam);
        }
        else System.out.println("Error- Wrong team name");
    }
}
