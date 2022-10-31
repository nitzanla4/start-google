package week2.monday.Generics;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Callable<String> stringCallable = new Callable<>() {
            @Override
            public String call() throws Exception {
                return "Shalom";
            }
        };

        Callable<Double> doubleCallable = new Callable<>() {
            @Override
            public Double call() throws Exception {
                return ThreadLocalRandom.current().nextDouble(10);
            }
        };

        Callable<Integer> integerCallable = new Callable<>() {
            @Override
            public Integer call() throws Exception {
                return ThreadLocalRandom.current().nextInt(10);
            }
        };

        retry(integerCallable,5);
    }
    public static <T> T retry (Callable <T> action, T expectedResult , int retryLimits, int sleepTime)
    {
        T actionResult= null;
        for (int i=0; i<retryLimits; i++)
        {
            try {
                actionResult=action.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            if (actionResult == expectedResult) return expectedResult;

            if (i== retryLimits-1)  return actionResult;// in case of lase iteration

            try {
                System.out.println(actionResult);
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException("Sleep-error");
            }

        }
        return actionResult;
    }

    public static <T> T retry (Callable <T> action, T expectedResult)
    {
        return retry(action,expectedResult,5,10);
    }

}
