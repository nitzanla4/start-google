package week2.monday.Methods;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Store {
    String name;

    private Store(String name) {
        this.name = name;
    }

    public static  Store createStore(String name, List<Coupon> coupons) {return new Store(name);}

    public void assign(User user, Coupon coupon)
{
    user.addCoupon(coupon);
}

private boolean isValid(Coupon coupon)
{
    Date today = Calendar.getInstance().getTime();
    Date date= coupon.getExpireDate();

    if(today.compareTo(date) > 0)
        return false; //expired today is bigger
    else return true;
}

public void useCoupon(User user,Coupon coupon)
{
    if(isValid(coupon)) user.getList().remove(coupon);
}


}
