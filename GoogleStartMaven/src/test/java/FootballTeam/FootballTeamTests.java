package FootballTeam;

import UnitTestsFootaballTeam.FootballTeam;
import UnitTestsFootaballTeam.Player;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FootballTeamTests {
        private static FootballTeam footballTeam;

    @BeforeAll
    static void setup(){
    footballTeam = new FootballTeam(FootballTeam.TeamsNames.BARCELONA);
    }


    @Test
    void player_position_equalGK()
    {
        Player testPlayer= new Player("A",10,90,Player.randomPosition());
        assertEquals(testPlayer.getPosition(), Player.positions.GK);
    }





}



