package week2.monday.Methods;

import java.util.List;

public class User {
    private final String name;
    private List<Coupon> list;

    public User(String name, List<Coupon> list) {
        this.name = name;
        this.list = list;
    }

    public static  User createUser (String name, List<Coupon> list)
    { return new User(name,list);}

    public String getName() {
        return name;
    }

    public  List<Coupon> getList() {
        return list;
    }


    public void addCoupon (Coupon coupon)
    {list.add(coupon);}

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }

    public void printUser()
    {
        System.out.println(this.getName());
        List<Coupon> list= this.getList();
        for( int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i)+ "  ");
        }
    }
}
