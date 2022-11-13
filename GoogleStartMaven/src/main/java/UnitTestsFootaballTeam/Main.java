package UnitTestsFootaballTeam;

import java.util.Set;

import static UnitTestsFootaballTeam.Validation.checkTeamsNamesInput;

public class Main {

    public static void main(String[] arg) {
        int[] positions = {1, 4, 4, 2};
        FootballTeam.TeamsNames  teamName= FootballTeam.TeamsNames.BARCELONA;

        if(checkTeamsNamesInput(teamName))
        {
            FootballTeam myTeam= FootballTeam.createNewTeamByPositions(teamName, positions);
            Set<Player> players= myTeam.getPlayers();

            Utils.PrintSet.printSet(players);
            FootballTeam.writeTeamToFile(myTeam);
        }
        else System.out.println("Error- Wrong team name");
    }
}
