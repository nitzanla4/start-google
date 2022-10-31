package week2.sunday.ClassesInterfaces.CommonMethods;

import java.util.Objects;

public class Name implements Comparable <Name>,Cloneable {
    public enum Prefix {Mr, Ms, Mis}

    ;
    private Prefix prefix;
    private String firstName;
    private String lastName;

    private Name(Prefix prefix, String firstName, String lastName) {
        this.prefix = prefix;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //factory method
    public static Name createName(Prefix prefix, String firstName, String lastName) {
        return new Name(prefix, firstName, lastName);
    }

    public Prefix getPrefix() {
        return prefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return prefix == name.prefix && Objects.equals(firstName, name.firstName) && Objects.equals(lastName, name.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prefix, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Name{" +
                "prefix=" + prefix +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    protected Name clone() {
        try {
            Name clone = (Name) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public int compareTo(Name other) {
        int result = this.getLastName().compareTo(other.getLastName());
        if (result == 0) {
            return this.getFirstName().compareTo(other.getFirstName());
        }
        return result;
    }
}
