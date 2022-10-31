package week2.monday.Methods;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Coupon {
    private final int id;
    private final Date expireDate;
    private final int value;

    private Coupon(int id, Date expireDate, int value) {
        this.id = id;
        this.expireDate = new Date(expireDate.getTime());
        this.value = value;
    }

    public static  Coupon createCoupon (int id, Date expireDate, int value)
    {return new Coupon(id,expireDate,value);}

    public static Coupon createCouponCopy (Coupon other)
    { return new Coupon(other.getId(),other.getExpireDate(), other.getValue());}

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public  Optional<Coupon> getCopounById (User user, int id)
    {
        List<Coupon> list=user.getList();
        for (int i=0; i< list.size(); i++) {
            if ((list.get(i)).getId()== id) return Optional.of (list.get(i));
        }
        return Optional.empty();
    }


    public Coupon getHighestValueCopoun (User user)
    {
        List<Coupon> list=user.getList();
        int max= Integer.MIN_VALUE;
        int higestIndex=0;
        for (int i=0; i< list.size(); i++) {
            if ((list.get(i)).getValue()> max)
            {
                max= (int)list.get(i).getValue();
                higestIndex=i;
            }
        }
        return list.get(higestIndex);
    }


    public   Optional<Coupon> getClosestExpireDateCopoun (User user) {
        List<Coupon> list = user.getList();
        List<Date> dates = new ArrayList<>();
        for (int i = 0; i < list.size(); i++)
            dates.add(list.get(i).getExpireDate());

        final long now = System.currentTimeMillis();

        Date closest = Collections.min(dates, new Comparator<Date>() {
            public int compare(Date d1, Date d2) {
                long diff1 = Math.abs(d1.getTime() - now);
                long diff2 = Math.abs(d2.getTime() - now);
                return Long.compare(diff1, diff2);
            }
        });
        Coupon retCop;
        for (int i = 0; i < list.size(); i++)
        {
         if (list.get((i)).getExpireDate().equals(closest))
            return Optional.of(list.get(i));

        }
        return Optional.empty();


    }


        public  Coupon randomlyCopoun (User user)
        {
            List<Coupon> list=user.getList();
            Random rand = new Random();
            int randomElement = list.get(rand.nextInt(list.size())).getId();

            return list.get(randomElement);
        }


    //Generate a Date --------------------------------------------

    public static Date generateRandomDate() {
        LocalDate startDate = LocalDate.of(2022, 10, 24); //start date
        long start = startDate.toEpochDay();

        LocalDate endDate = LocalDate.of(2024, 10, 31);  //end date
        long end = endDate.toEpochDay();

        long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
        LocalDate res= LocalDate.ofEpochDay(randomEpochDay); // random date between the range
        Date date = Date.from(res.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return date;
    }

    public static int generateValue()
    {
        Random rand = new Random();
        // Generate random integers in range 0 to 99
        int rNum = rand.nextInt(100);
        return rNum;
    }
    public static  List<Coupon> generateRandomCoupons()
    {
        List<Coupon> list= new ArrayList<>();
        for (int i=0; i<3; i++)
        {
            list.add(createCoupon(i,generateRandomDate(),generateValue()));
        }
        return list;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "id=" + id +
                ", expireDate=" + expireDate +
                ", value=" + value +
                '}';
    }
}

