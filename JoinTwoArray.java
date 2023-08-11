package Interview_Question;

import java.util.Scanner;

public class JoinTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:- ");
        int n = sc.nextInt();
        int []arr = new int[n];
        int []arr1 = new int[n];
        System.out.print("Enter the First Array Element:- ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("First Array Elements are:- ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter Second Array Elements:- ");
        for (int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Second Array Elements are:- ");
        for (int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println();

        int c[]=new int[n];
        for (int i=0,j=0,k=0;i<n;i++,j++,k++){
           c[k]=arr1[i]+arr[j];
        }

        System.out.print("Adding of Two array:-  ");
        for (int i=0;i<n;i++){
            System.out.print(c[i]+" ");
        }

    }
}
