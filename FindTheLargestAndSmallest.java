package Interview_Question;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheLargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array:- ");
        n=sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter Array element:- ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array elements are:- ");
        for (int i=0;i< n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int max = arr[0];
        int min = arr[0];
        for (int i=0;i<n;i++){
            if (arr[i]>max){
                max=arr[i];
            }else if (arr[i]<min){
                min=arr[i];
            }
        }


        System.out.println("Array elements are: "+ Arrays.toString(arr));
        System.out.println("Maximum value in the array is:- "+max);
        System.out.print("Minimum value in the array is:- "+min);


    }
}
