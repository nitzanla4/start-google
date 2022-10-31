package week2.sunday.ClassesInterfaces.CommonMethods;

import java.util.List;
import java.util.Objects;

public class PhoneNumber implements Comparable<PhoneNumber>, Cloneable{

    private String areaCode;
    private String number;

    private PhoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public static PhoneNumber createPhoneNumber (String areaCode, String number)
    {
        return new PhoneNumber(areaCode,number);
    }

    public static PhoneNumber createCopyPhoneNumber (PhoneNumber other)
    {
        return new PhoneNumber(other.getAreaCode(), other.getNumber());
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber other = (PhoneNumber) o;
        return Objects.equals(areaCode, other.areaCode) && Objects.equals(number, other.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, number);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode='" + areaCode + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public PhoneNumber clone() {
        try {
            PhoneNumber clone = (PhoneNumber) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public int compareTo(PhoneNumber other) {
        int result = this.getAreaCode().compareTo(other.getAreaCode());
        if (result == 0) {
            return this.getNumber().compareTo(other.getNumber());
        }
        return result;
    }

}
