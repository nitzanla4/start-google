package week1.basics.GeneralProgEx;

public class day2 {
    //func1: input: An integers array
    //       output: prints the sum of the odds numbers and the sum of the even nunbers

    public static void printOddOrEvenSum(int[] arr)
    {
        int evenSum=0, oddSum=0;
        for (Integer num:arr) {
            if (num%2==0) evenSum+=num;
            else oddSum+=num;
        }

        System.out.println("Even sum:  "+ evenSum);
        System.out.println("Odd sum:  "+ oddSum);

    }

    public static void main (String[] args) {
    int[] arr= {1,2,3,4,5};
    printOddOrEvenSum(arr);

    }
}
