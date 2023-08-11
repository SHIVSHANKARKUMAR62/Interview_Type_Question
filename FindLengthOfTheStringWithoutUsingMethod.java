package Interview_Question;

import java.util.Scanner;

public class FindLengthOfTheStringWithoutUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int count = 0;
        System.out.print("Enter a String Value:- ");
        name=sc.nextLine();
        for (int i=0;i<name.length();i++){
            count++;
        }

        System.out.println(name.toCharArray().length);
        System.out.print("Length of the String is:- "+count);
    }
}
