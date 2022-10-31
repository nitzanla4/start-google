package week2.sunday.ClassesInterfaces.CommonMethods;

import java.util.Arrays;
import java.util.List;

public class PhoneBook {

    private final String name;
    List<Contact> contactsList;

    public PhoneBook(String name, List<Contact> contactsList) {
        this.name = name;
        this.contactsList = contactsList;
    }

    public static PhoneBook createPhoneBook (String name, List<Contact> contactsList)
    {
        return new PhoneBook(name,contactsList);
    }

    public List<Contact> getContactsList() {
        return contactsList;
    }

    public String getName() {
        return name;
    }

    public static void printList(PhoneBook pb) {
        System.out.println(pb.getName());

        for (int i = 0; i < 3; i++) {
            Contact c= pb.contactsList.get(i);
            c.printContact();
        }


    }
}
