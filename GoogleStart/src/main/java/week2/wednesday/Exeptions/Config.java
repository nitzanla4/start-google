package week2.wednesday.Exeptions;
import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.google.gson.Gson;

public class Config {
    public static void createNewFile() throws IOException { //return file's name
        Writer writer = new FileWriter("config1.json");

        // convert file to JSON File
        new Gson().toJson("config1.json");

        // close the writer
        writer.close();
    }

    public static void printMap( Map<String,String> map) {// print map entries
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
    //-----------------------------------------------------------------------------
    public static Map<String, String> createMap() throws IOException {
        // create Gson instance
        Gson gson = new Gson();
        Map<String, String> map = new HashMap<>();

        //open file and copy it to map
        try {
            File newFile = new File("C:\\Users\\nitza\\OneDrive\\Desktop\\config.json.txt");
            if (newFile.length()!=0)//Empty file
            {
                Reader reader = Files.newBufferedReader(newFile.toPath());
                // convert JSON file to map
                map=gson.fromJson(reader,Map.class);

                reader.close();
                printMap(map);

            }
            else throw new NullPointerException("Empty file");

        } catch (FileNotFoundException e) { // couldn't find the file -> create a new one.
            createNewFile();
            System.out.println("file not found");
            System.out.println("new file created");
        } catch (IOException e)
        {
            createNewFile();
            System.out.println("IO Exeption");
            System.out.println("new file created");
        }
       return map;
    }


    public static String requestConfigKey(String key) throws IOException {
        Map<String, String> map = createMap();
        printMap(map);

        if (map.containsKey(key)) return map.get(key);
        else throw new IllegalArgumentException("no such key");
    }
}






