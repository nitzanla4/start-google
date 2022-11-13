package Utils;

import UnitTestsFootaballTeam.Player;

import java.util.Iterator;
import java.util.Set;

public class PrintSet {
    public static void printSet(Set<Player> set) {
        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
