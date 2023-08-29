package Data_Structure.ArrayPWAssignment.twoDarray;

import java.util.Scanner;

public class Happy_Number_In_The_Range {
    public static void main(String[] args) {
        int r, start, sum = 0, end,num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting Number: ");
        start = sc.nextInt();

        System.out.print("Enter the ended number: ");
        end = sc.nextInt();


        while (start!=end){
            num = start;
            while (start > 9)
            {
                while (start > 0)
                {
                    r = start % 10;
                    sum = sum + (r * r);
                    start = start / 10;
                }
                start = sum;
                sum = 0;
            }
            if (start == 1)
            {
                System.out.println(num+" is a Happy Number...");
            }
            else
            {
                System.out.println(num+" is not a Happy Number...");
            }
            start = num + 1;
        }
    }
}
