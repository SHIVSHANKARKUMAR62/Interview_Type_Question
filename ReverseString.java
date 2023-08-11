package Interview_Question;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Name:- ");
        String name = sc.nextLine();
        String rev = " ";
        for (int i = name.length()-1;i>=0;i--){
            rev = rev + name.charAt(i);
        }
        System.out.println("Reverse String is:- "+rev);

        System.out.println("....................................");

        //2 approach
        char []ch = name.toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
