package Data_Structure.ArrayPWAssignment.twoDarray;

import java.util.Scanner;

class Calculation{
    public void cal(int [][]arr,int m,int n){
        System.out.print("The elements of both the diagonals are: ");

        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if (i == (n-1)/2 || j == (n-1)/2) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}

public class display_the_elements_of_middle_row_and_the_elements_of_middle_column {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter Matrix element: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nMatrix elements are: ");
        for (int []num1 : arr){
            for (int num2 : num1){
                System.out.print(num2+" ");
            }
            System.out.println();
        }

        Calculation calculation = new Calculation();
        calculation.cal(arr,n,m);

    }
}
