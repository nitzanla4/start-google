package UnitTestsFootaballTeam;

import java.util.Random;

public class Player {

    public enum positions {GK, DEFENSE,MIDDLEFILED,ATTACK; }

    private String name;
    private int jerseyNUM;
    private int grade;
    private positions position;

    public Player(String name, int jerseyNUM, int grade, positions position) {
        this.name = name;
        this.jerseyNUM = jerseyNUM;
        this.grade=grade;
        this.position= position;
    }

    public String getName() {
        return name;
    }

    public positions getPosition() {
        return position;
    }

    public static Player createNewGoalKeepPlayer(String name, int jerseyNUM, int grade)
    {
        Player newPlayer= new Player(name,jerseyNUM,grade,positions.GK);
        return newPlayer;
    }

    public static Player createNewDefensePlayer(String name, int jerseyNUM, int grade)
    {
        Player newPlayer= new Player(name,jerseyNUM,grade,positions.DEFENSE);
        return newPlayer;
    }

    public static Player createNewMiddlefiledPlayer(String name, int jerseyNUM, int grade)
    {
        Player newPlayer= new Player(name,jerseyNUM,grade,positions.MIDDLEFILED);
        return newPlayer;
    }

    public static Player createNewAttackPlayer(String name, int jerseyNUM, int grade)
    {
        Player newPlayer= new Player(name,jerseyNUM,grade,positions.ATTACK);
        return newPlayer;
    }


    @Override
    public String toString() {
        return "Player: " +
                "name='" + name + '\'' +
                ", jerseyNUM=" + jerseyNUM+
                ", Grade= "+ grade+
                ", Position= "+ position;
    }

    public static positions randomPosition() {
        int pick = new Random().nextInt(positions.values().length);
        return positions.values()[pick];
    }
}
