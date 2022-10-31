package week1.basics.GeneralProgEx.FOOTBALL;

public class Player {

    private String name;
    private int jerseyNUM;
    private int grade;
    private String position;

    public Player(String name, int jerseyNUM, int grade, String position) {
        this.name = name;
        this.jerseyNUM = jerseyNUM;
        this.grade=grade;
        this.position= position;

    }

    //Static factory methods- for each type of position
    //GoalKeeper
    public static Player createNewGoalKeepPlayer(String name, int jerseyNUM, int grade)
    {
        Player newPlayer= new Player(name,jerseyNUM,grade,"GoalKeep");
        return newPlayer;
    }

    //Defense
    public static Player createNewDefensePlayer(String name, int jerseyNUM, int grade)
    {
        Player newPlayer= new Player(name,jerseyNUM,grade,"Defense");
        return newPlayer;
    }

    //Middlefiled
    public static Player createNewMiddlefiledPlayer(String name, int jerseyNUM, int grade)
    {
        Player newPlayer= new Player(name,jerseyNUM,grade,"Middlefiled");
        return newPlayer;
    }

    //Attack
    public static Player createNewAttackPlayer(String name, int jerseyNUM, int grade)
    {
        Player newPlayer= new Player(name,jerseyNUM,grade,"Attack");
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
}
