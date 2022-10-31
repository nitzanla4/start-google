package week2.wednesday.Exeptions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static week2.wednesday.Exeptions.Config.createMap;
import static week2.wednesday.Exeptions.Config.requestConfigKey;

public class Main {

public static void main(String[] args) throws IOException {
    Map<String, String> map = new HashMap<>();
    map = createMap();

    System.out.println("-----------------------------");
    String key="version";
    System.out.println("key:"+ key+"  "+ requestConfigKey(key));
}

}
