package week1.basics.GeneralProgEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class User {
    String name;
    String email;
    String country;


    public User() {}
    public User(String name, String email) {}
    public User(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }

    public void setName(String name) {this.name = name;}

    public void setEmail(String email) {this.email = email;}

    public void setCountry(String country) {this.country = country;}

    public String getName() {return name;}

    public String getEmail() {return email;}

    public String getCountry() {return country;}

    public static User createNewUser(String name, String email, String country)
    {
        User user= new User(name,email,country);
        return user;
    }

    public static User createNewUserFromIsrael(String name, String email) {
        User user= new User(name, email);
        user.setCountry("Israel");
        return user;
    }

    public static User createCopyUser(User user) {
        User copyUser= new User();
        copyUser.setName(user.getName());
        copyUser.setEmail(user.getEmail());
        copyUser.setCountry(user.getCountry());
        return copyUser;
    }

// -------------------------------------------
    //--- Read FILE
    public static void readFile(File fn)
    {
        try{
            File file= new File("file.txt");
            Scanner myReader= new Scanner(file);
            while (myReader.hasNextLine())
            {
                String data=myReader.nextLine();
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }





}


