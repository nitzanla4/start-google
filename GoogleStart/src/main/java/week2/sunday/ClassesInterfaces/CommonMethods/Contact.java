package week2.sunday.ClassesInterfaces.CommonMethods;

import java.util.List;
import java.util.Objects;

public class Contact implements Comparable<Contact> ,Cloneable{
    private Name name;
    private PhoneNumber phoneNum;

    private Contact(Name name, PhoneNumber phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public static Contact createContact (Name name, PhoneNumber phoneNum)
    { return new Contact(name,phoneNum);}

    public Name getName() {
        return name;
    }

    public PhoneNumber getPhoneNum() {
        return phoneNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(phoneNum, contact.phoneNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNum);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name=" + name +
                ", phoneNum=" + phoneNum +
                '}';
    }


    @Override
    public int compareTo(Contact other) {
        int result = this.getName().compareTo(other.getName());
        if (result == 0) {
            return this.getPhoneNum().compareTo(other.getPhoneNum());
        }
        return result;
    }


    protected Contact clone() {
        try {
            Contact clone = (Contact) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void printContact ()
    {
        System.out.println(this.getName() + " "+this.getPhoneNum());
    }
}




