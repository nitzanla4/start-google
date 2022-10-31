package week2.sunday.ClassesInterfaces.CommonMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

   public static void main (String[] args)
   {
       Contact c1= Contact.createContact(Name.createName (Name.Prefix.Mr, "Yossi", "Levi"), PhoneNumber.createPhoneNumber("03","966656"));
       Contact c2= Contact.createContact(Name.createName (Name.Prefix.Mr, "Daniel", "Dani"), PhoneNumber.createPhoneNumber("03","963333"));
       Contact c3= Contact.createContact(Name.createName (Name.Prefix.Mr, "Moshe", "Avi"), PhoneNumber.createPhoneNumber("03","955555"));

       List<Contact> list= new ArrayList<>();
       list.add(c1);
       list.add(c2);
       list.add(c3);

      PhoneBook pb= PhoneBook.createPhoneBook("Dafi_Zhaav",list);
      PhoneBook.printList(pb);

      if(c1.compareTo(c2)==0) System.out.println("The same person");
      else if(c1.compareTo(c2)==1 )System.out.println("Levi before Dani");
      else System.out.println("Dani before Levi");





   }


}
