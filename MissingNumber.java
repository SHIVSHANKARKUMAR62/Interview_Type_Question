package Interview_Question;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr;
        int sum1=0;
        int sum2=0;
        int n;
        System.out.print("Enter the size of an array:- ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.print("Enter Array Elements:- ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array Elements are:- ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i=0;i<n;i++) {
            sum1 += arr[i];
        }

        for (int i = 1;i<=n+1;i++){
            sum2 = sum2+i;
        }

        System.out.print("Missing Number is:- "+(sum2-sum1));

    }
}
