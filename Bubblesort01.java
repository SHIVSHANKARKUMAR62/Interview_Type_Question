package Interview_Question;

import java.util.Scanner;

public class Bubblesort01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:- ");
        int n=sc.nextInt();
        int []arr = new int[n];

        System.out.print("Enter Array Element:- ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.print("Bubble sort element are:- ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
