package Interview_Question;

import java.util.Scanner;

public class SumOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter The Size of an array:- ");
        n=sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter the array elements:- ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Arrays Elemets are:- ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int sum = 0;
        for (int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        System.out.print("Sum of the array is:- "+sum);
    }
}
