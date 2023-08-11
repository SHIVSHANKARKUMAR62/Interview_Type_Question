package Interview_Question;

import java.util.Scanner;

public class SelectionShort {
    public static void main(String[] args) {
        int n,loc; // loc is a intital element
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:- ");
        n=sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter Elements:- ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are:- ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.print("Selection sort elements are:- ");
        for (int i=0;i<n-1;i++){
            loc=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[loc]){
                    loc=j;
                }
                if (loc!=i) {
                    int temp = arr[loc];
                    arr[loc] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
