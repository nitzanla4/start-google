package UnitTestsFootaballTeam;

import java.util.List;
import java.util.Random;

import static UnitTestsFootaballTeam.FootballTeam.createDicList;

public class Generate {
    public static  int getRandomGrade()
    {
        return Utils.RandomNumber.getRandomNumber();
    }

    public static String getRandomName(FootballTeam.TeamsNames teamName) {

        List<String> list = createDicList(teamName);

        int size = list.size();
        int randIdx = new Random().nextInt(size);

        String randomElem = list.get(randIdx);
        list.remove(randIdx);
        //set.remove(randomElem);
        return randomElem;
    }


}
