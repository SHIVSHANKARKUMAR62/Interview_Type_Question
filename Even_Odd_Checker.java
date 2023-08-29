package Data_Structure.ArrayPWAssignment.twoDarray;

import java.util.Scanner;

// how many times even number is coming in your array...

public class Even_Odd_Checker {

    public static int Solution(int[] arr){
        int count = 0;
        for (int j : arr) {
            if (digit(j) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int digit(int n){
        int count = 0;
        while (n!=0){
            count++;
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array element: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements are: ");
        for (int s : arr){ // using for each loop
            System.out.print(s+" ");
        }

        int ans = Solution(arr);
        System.out.print("\nNumber of even elements is: "+ans);
    }
}
