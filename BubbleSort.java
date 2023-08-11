package Interview_Question;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an array:- ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter Element :- ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n-1;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.print("Bibble sort Element are:- ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
