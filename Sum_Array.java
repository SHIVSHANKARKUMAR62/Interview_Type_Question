package Interview_Question;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sum_Array {
    public static void main(String[] args) {
        //Different ways to sum all elements in an array in java8
        // 1st way
        int []arr = {2,3,4,5,7};
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum of array 1st way:- "+sum);

        // 2nd way
        int sum1 = IntStream.of(arr).sum();
        System.out.println("Sum of array 2nd way:- "+sum1);

        // 3rd way

        int sum2 = Arrays.stream(arr).reduce((x,y)->x+y).getAsInt();
        System.out.println("Sum of array 3rd way:- "+sum2);

        //4th way

        long sum4=Arrays.stream(arr).summaryStatistics().getSum();
        System.out.println("Sum of array 4th way:- "+sum4);


    }
}
