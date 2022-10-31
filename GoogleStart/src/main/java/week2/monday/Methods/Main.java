package week2.monday.Methods;

import java.util.Optional;

public class Main {



    public static void main (String args[])
    {
        Coupon testCop=Coupon.createCoupon(50,Coupon.generateRandomDate(),123);

        Store store= Store.createStore("Bug",Coupon.generateRandomCoupons());
        Coupon coupon=Coupon.createCoupon(20,Coupon.generateRandomDate(),200);
        User user= User.createUser("Avi",Coupon.generateRandomCoupons());

        user.printUser(); // 3 cop

        store.assign(user,coupon); //adding a cop
        user.printUser();
        //store.useCoupon(user,coupon); //use a cop

//         Optional coupon2= testCop.getCopounById(user,20);
//        System.out.println(coupon2);

//        Coupon coupon3=testCop.getHighestValueCopoun(user);
//        System.out.println(" Highest value coupon: "+ coupon3);

//        Optional coupon4= testCop.getClosestExpireDateCopoun(user);
//        System.out.println(coupon4);
//
//        Coupon coupon5= testCop.randomlyCopoun(user);
//        System.out.println(coupon5);





    }
}
