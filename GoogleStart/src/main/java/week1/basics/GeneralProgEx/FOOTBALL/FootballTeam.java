package week1.basics.GeneralProgEx.FOOTBALL;
import java.io.*;
import java.util.*;

public class FootballTeam {
    static  final int Team_size=11;
    static private  String name;
    private static Set players;

//setters
    public static void setPlayers(Set players) {FootballTeam.players = players; }


    // constructor
    public FootballTeam(String name) { //name of the team, positions of the players
        this.name=name;
        players=new HashSet();

    }


//     Static Factory Method
//-----------------------------------------------------------------
    public static FootballTeam createNewTeamByPositions(String name, int[] pos)
    {
        FootballTeam my_team= new FootballTeam(name);
        my_team.setPlayers(create_team(name, pos));
        return my_team;
    }


    // getters
    public  Set getPlayers() { return players; }


    //Random-Unique- Names:
    //----------------------------------------------------------------------------------
    public static List<String> createDicList(String teamName)
    {
        if (teamName.equals("Barcelona") ||teamName.equals("barcelona")) // both option-upper and lower
        {
            NameGenerator myDic = NameGenerator.createWantedDic("dicBarcelona");
            return myDic.getNamesSet();
        }
        else if (teamName.equals("Rishon") ||teamName.equals("rishon"))
        {
            NameGenerator myDic = NameGenerator.createWantedDic("dicRishon");
            return myDic.getNamesSet();
        }
        else
        {
            NameGenerator myDic = NameGenerator.createWantedDic("dicRealmadrid");
            return myDic.getNamesSet();
        }

    }



    public static String getRandomName(String teamName) {

        List<String> list = createDicList(teamName);

        int size = list.size();
        int randIdx = new Random().nextInt(size);

        String randomElem = list.get(randIdx);
        list.remove(randIdx);
        //set.remove(randomElem);
        return randomElem;
    }

    //Random-Unique-Numbers:
    //----------------------------------------------------------------------------------
    public static int getRandomNumber() {
        Random rand = new Random();
        // Generate random integers in range 0 to 99
        int rNum = rand.nextInt(100);
        return rNum;
    }

    public static  int getRandomGrade()
    {
        return getRandomNumber();
    }


    //Create Positions:
    //----------------------------------------------------------------------------------
    public static boolean checkPositionInput(int[] arr)
    {
        int sum= arr[0]+arr[1]+arr[2]+arr[3];
        if (sum==11&& arr[0]==1 && arr[1]>=2 && arr[2]>=2 && arr[3]>=2) return true;
        else return  false;
    }

    // Create list of position as the client request
    public static List<String> createListPosition (int[] pos)
    {
        List<String> position_List= new ArrayList<>();
        if (checkPositionInput(pos))
        {
            for (int i = 0; i <pos.length ; i++) {
                if (i==0) position_List.add("Goal_Keeper");
                else // "Defender", "Midfielder", "Attacker"
                {
                    while (pos[i]>0)
                    {
                        if (i==1) position_List.add("Defender");
                        else if( i==2) position_List.add("Midfielder");
                        else position_List.add("Attacker");
                        pos[i]--;
                    }
                }

            }
             return position_List;
        }
        else throw new RuntimeException("ERROR- the positions you sent are wrong");
    }


    public static String getPosition( List<String> position_List)
    {
        Collections.shuffle(position_List);
        String randomPosition = position_List.get(0);

        position_List.remove(randomPosition);
        return randomPosition;
    }

   //------CREATE TEAM-------------------------------------------

    public static Set<Player> team= new HashSet<>();

    //Create player using Player static factory method
    public static Player createPlayerUsingFactoryMetByPosition(String name,int jersy_shirt,int grade, String pos) {
        switch (pos) {
            case "Goal_Keeper":
                return Player.createNewGoalKeepPlayer(name, jersy_shirt, grade);
            case "Defender":
                return Player.createNewDefensePlayer(name, jersy_shirt, grade);
            case "Midfielder":
                return Player.createNewMiddlefiledPlayer(name, jersy_shirt, grade);
            default:  return Player.createNewAttackPlayer(name, jersy_shirt, grade);
        }

    }


    public static Set <Player> create_team(String teamName, int[] pos)
    {
        HashMap<Integer, String> teamMap= new HashMap<>();
        List<String> myList=createListPosition(pos); //myList holds the requested position (list of positions)
        for (int i=0; i<Team_size; i++)
        {
            int jersy_shirt=getRandomNumber(); //get a random shirt number (unique number)
            while (teamMap.containsKey(jersy_shirt)) //we already have this jersey number
                    { jersy_shirt=getRandomNumber();}
            String name=getRandomName(teamName);
            teamMap.put(jersy_shirt, name); //for future check (name and jersy number)
            String position=getPosition(myList);

            team.add(createPlayerUsingFactoryMetByPosition(name,jersy_shirt,getRandomGrade(),position));
        }
        return team;
    }

    public static void writeTeamToFile(FootballTeam team)
    {
        Set<Player> myTeam= team.getPlayers();
        try {
            File newTextFile = new File("C:/Users/nitza/OneDrive/Desktop/file.txt");
            FileWriter fw = new FileWriter(newTextFile);
            Iterator itr = myTeam.iterator();

            while (itr.hasNext()) {
                fw.write(itr.next().toString()+ "         ");

            }
            fw.close();
            System.out.println("Success- Team was written in the file.");

        } catch (IOException iox) {
            System.out.println("An error occurred.");
            iox.printStackTrace();
        }

    }

    // Print Team- Iterator runs over the players (Set)
    public static void printTeam(Set<Player> set) {
        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}

