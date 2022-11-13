package UnitTestsFootaballTeam;

public class Validation {

    public static boolean checkTeamsNamesInput(FootballTeam.TeamsNames name)
    {
        if (equalsToBarcelona(name)||equalsToRishon(name)|| equalsToRealMadrid(name)) return true;
        else return false;
    }



    public static boolean equalsToBarcelona (FootballTeam.TeamsNames teamName)
    {
        return teamName.equals(FootballTeam.TeamsNames.BARCELONA);
    }

    public static boolean equalsToRishon (FootballTeam.TeamsNames teamName)
    {
        return teamName.equals(FootballTeam.TeamsNames.RISHON);
    }

    public static boolean equalsToRealMadrid (FootballTeam.TeamsNames teamName)
    {
        return teamName.equals(FootballTeam.TeamsNames.REALMADRID);
    }


}
